package com.orsi.foxclub.Service;

import com.orsi.foxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoxService {

    void addFox(Fox fox);

    Fox findByName(String name);

    List<Fox> returnAll();
}
