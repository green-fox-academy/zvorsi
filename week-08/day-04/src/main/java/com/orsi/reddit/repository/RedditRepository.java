package com.orsi.reddit.repository;

import com.orsi.reddit.model.Reddit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RedditRepository extends CrudRepository <Reddit, Long> {

    Integer postsByPage = 3;

    @Query(value = "select * from reddit order by like_counter desc limit ?#{#postsByPage}", nativeQuery = true)
    List<Reddit> findAllByOrder(@Param("postsByPage") Integer postsByPage);

    @Query(value = "select * from reddit order by like_counter desc limit 3 offset ?#{#page * 3 - 3}", nativeQuery = true)
    List<Reddit> findAllByOrdOrderByLikeCounterPaging(@Param("page")Long page, @Param("postsByPage") Integer postsByPage);

}
