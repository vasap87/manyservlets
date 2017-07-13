package ru.kotovaleksandr.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ru.kotovaleksandr.springboot.firstservlet.SpringBootWebConfigFirst;
import ru.kotovaleksandr.springboot.secondservlet.SpringBootWebConfigSecond;

/**
 * Created by alexkotov on 13.07.17.
 */
@SpringBootApplication
@Import({SpringBootWebConfigFirst.class, SpringBootWebConfigSecond.class})
public class MainConfiguration {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebConfigFirst.class, args);
        SpringApplication.run(SpringBootWebConfigSecond.class, args);
    }
}
