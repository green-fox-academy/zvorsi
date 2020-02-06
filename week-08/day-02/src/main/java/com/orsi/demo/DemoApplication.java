package com.orsi.demo;

import com.orsi.demo.domain.Todo;
import com.orsi.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    private TodoRepository todoRepository;

    @Autowired
    public DemoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Buy Milk", false, true));
        todoRepository.save(new Todo("Prepare meal", false, false));
        todoRepository.save(new Todo("Do dark laundry", false, true));
        todoRepository.save(new Todo("go home", true, false));
        todoRepository.save(new Todo("bake bread", true, true));
        todoRepository.save(new Todo("Do color laundry", false, true));
        todoRepository.save(new Todo("Do white laundry",true, true));
    }
}
