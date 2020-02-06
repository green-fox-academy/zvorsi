package com.orsi.reddit.repository;

import com.orsi.reddit.model.Reddit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RedditRepository extends CrudRepository <Reddit, Long> {

    @Query(value = "select * from reddit order by like_counter desc limit 5", nativeQuery = true)
    List<Reddit> findAllByOrder();
}
