package com.orsi.week7day4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week7day4Application implements CommandLineRunner {

    private Printer printer;


    @Autowired
    public Week7day4Application(Printer printer){
        this.printer = printer;
    }


    @Autowired
    public static void main(String[] args) {
        SpringApplication.run(Week7day4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("bullshit");
        System.out.println("The chosen color is " + printer.myColor.printColor());

    }

}
