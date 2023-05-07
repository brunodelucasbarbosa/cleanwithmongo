package br.com.pratice.cleanwithmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class CleanwithmongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CleanwithmongoApplication.class, args);
    }

}
