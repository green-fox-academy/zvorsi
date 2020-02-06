package com.orsi.reddit.service;

import com.orsi.reddit.model.Reddit;
import com.orsi.reddit.repository.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RedditServiceImplementation implements RedditService{

    RedditRepository redditRepository;

    @Autowired
    public RedditServiceImplementation(RedditRepository redditRepository) {
        this.redditRepository = redditRepository;
    }


    @Override
    public void addRedditPost(Reddit reddit) {
        redditRepository.save(reddit);
    }

    @Override
    public Reddit findById(Long id) {
        return redditRepository.findById(id).get();
    }

    @Override
    public List<Reddit> returnAll() {
        return (List<Reddit>) redditRepository.findAll();
    }

    @Override
    public void voting(Long id, Integer voting) {
        if (voting == 1 || voting == -1 && redditRepository.findById(id).isPresent()){
            Optional<Reddit> voted = redditRepository.findById(id);
            voted.get().setLikeCounter(voted.get().getLikeCounter() + voting);
            redditRepository.save(voted.get());
        }
    }

    @Override
    public void save(Reddit reddit) {
        redditRepository.save(reddit);
    }

    @Override
    public List<Reddit> findByAllOrder() {
        return redditRepository.findAllByOrder();
    }


}
