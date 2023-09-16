package com.example.commandlinerunnertest;

import org.hibernate.annotations.Comment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class CommandLineRunnerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandLineRunnerTestApplication.class, args);
    }

}
@Component
class Runner implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Spring Boot execute this code after startup");
    }
}
// Following run method will not be executed because I didn't mark the class as Component, so Spring will not manage this class as a bean.
class RunnerTwo implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Spring Boot wont execute this code.");
    }
}
