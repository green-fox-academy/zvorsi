package com.orsi.week7day4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Qualifier ("Red")
public class ColorRed implements MyColor {

    @Override
    public String printColor() {
        return "red";
    }
}
