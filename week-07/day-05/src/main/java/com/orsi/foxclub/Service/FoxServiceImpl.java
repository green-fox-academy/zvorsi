package com.orsi.foxclub.Service;

import com.orsi.foxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxServiceImpl implements FoxService {
    List<Fox> foxes = new ArrayList<>();

    @Override
    public void addFox(Fox fox) {
        foxes.add(fox);
    }

    @Override
    public Fox findByName(String name) {
        if (name == null) {
            return new Fox("default");
        } else {
            return foxes
                    .stream()
                    .filter(f -> f.getFoxName().equals(name))
                    .findFirst()
                    .get();
        }
    }

    @Override
    public List<Fox> returnAll() {
        return foxes;
    }
}
