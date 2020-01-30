package com.orsi.week7day4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier("Green")
@Service
public class ColorGreen implements MyColor {
    @Override
    public String printColor() {
        return "green";
    }
}
