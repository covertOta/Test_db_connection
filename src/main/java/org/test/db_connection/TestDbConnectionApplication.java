package org.test.db_connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestDbConnectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestDbConnectionApplication.class, args);
        System.out.println("ola!");
    }

}
