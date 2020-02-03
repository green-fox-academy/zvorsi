package com.orsi.foxclub.Service;

import com.orsi.foxclub.models.Fox;
import com.orsi.foxclub.models.FoxFood;
import com.orsi.foxclub.models.FoxTrick;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface FoxService {

    void addFox(Fox fox);

    Fox findByName(String name);

    List<Fox> returnAll();

    FoxTrick showTrick(FoxTrick foxTrick); //ez még nem jó

    FoxFood changeFood();
}
