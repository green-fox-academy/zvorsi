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
    public String reddit(@RequestParam(required = false) Long pagenumber, Model model){
        if(pagenumber == null){
            model.addAttribute("posts", redditService.findByAllOrderByPage(1L));
            model.addAttribute("pagenumber", 1L);
        }else{
            model.addAttribute("posts", redditService.findByAllOrderByPage(pagenumber));
            model.addAttribute("pagenumber", pagenumber);
        }

        model.addAttribute("pagelist", redditService.pageList());

        return "list-posts";
    }

    @GetMapping("/reddit/{id}")
    public String upvote(@PathVariable Long id, @RequestParam Integer voting){
        redditService.voting(id, voting);
        return "redirect:/reddit?pagenumber=" + redditService.getPageNumber();
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

    @GetMapping("/last-page")
    public String lastPage(){
        return "redirect:/reddit?pagenumber=" + redditService.pageTotalNumber();
    }


}
