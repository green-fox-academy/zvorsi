package com.orsi.reddit.service;

import com.orsi.reddit.model.Reddit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RedditService {

    void addRedditPost(Reddit reddit);

    Reddit findById(Long id);

    List<Reddit> returnAll();

    void voting(Long id, Integer voting);

    void save(Reddit reddit);

    List<Reddit> findByAllOrder();


}
