package com.orsi.reddit.controller;

import com.orsi.reddit.model.Reddit;
import com.orsi.reddit.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RedditController {
    RedditService redditService;

    @Autowired
    public RedditController(RedditService redditService) {
        this.redditService = redditService;
    }

    @GetMapping("/reddit")
    public String reddit(Model model){
        model.addAttribute("posts", redditService.findByAllOrder());
        return "list-posts";
    }

    @GetMapping("/reddit{id}")
    public String upvote(@PathVariable Long id, @RequestParam Integer voting){
        redditService.voting(id, voting);
        return "redirect:/reddit";
    }

    @GetMapping("/new-post")
    public String newPost(){
        return "new-post";
    }

    @PostMapping("/new-post")
    public String savePost(@ModelAttribute Reddit reddit){
        redditService.save(reddit);
        return "redirect:/reddit";
    }
}
