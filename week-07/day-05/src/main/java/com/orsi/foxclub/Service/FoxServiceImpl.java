package com.orsi.foxclub.Service;

import com.orsi.foxclub.models.Fox;
import com.orsi.foxclub.models.FoxFood;
import com.orsi.foxclub.models.FoxTrick;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxServiceImpl implements FoxService {

    List<Fox> foxes = new ArrayList<>();
    List<FoxTrick> tricks = new ArrayList<>();


    @Override
    public void addFox(Fox fox) {
        //if String name = már létező Fox {annak az info oldalat adja vissza}
        // else {foxes.add(fox)}
        //.anyMatch?

        foxes.add(fox);
    }


    @Override
    public Fox findByName(String name) {
        if (name == null) {
            return new Fox(null);
        } else {
            return foxes
                    .stream()
                    .filter(f -> f.getFoxName().equals(name))
                    .findFirst()
                    .get();
        }
    }

    @Override
    public boolean isFoxAvailable(String name) {
        return foxes
                .stream()
                .anyMatch(f -> f.getFoxName().equals(name));
    }

    @Override
    public List<Fox> returnAll() {
        return foxes;
    }

    @Override //ez még nem jó
    public FoxTrick showTrick(FoxTrick foxTrick) {
        return tricks
                .stream()
                .findFirst()
                .get();
    }


/*    @Override
        public FoxFood changeFood() {
        return null;
    }
*/

}
