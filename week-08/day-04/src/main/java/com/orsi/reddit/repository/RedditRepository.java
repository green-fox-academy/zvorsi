package com.orsi.reddit.repository;

import com.orsi.reddit.model.Reddit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedditRepository extends CrudRepository <Reddit, Long> {
}
