package net.achraf.chatbotrag;

import net.achraf.chatbotrag.entities.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class ChatBotRagApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatBotRagApplication.class, args);
    }

    CommandLineRunner commandLineRunner(PersonRepository personRepository){
        return args -> {
            for (int i = 0;i < 100; i++){
                Person person = Person.builder()
                        .name(UUID.randomUUID().toString().substring(0,8))
                        .email(UUID.randomUUID().toString().substring(0,8)+"@gmail.com")
                        .build();
            }
        };
    }

}
