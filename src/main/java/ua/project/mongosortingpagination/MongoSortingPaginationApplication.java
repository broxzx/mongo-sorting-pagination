package ua.project.mongosortingpagination;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import ua.project.mongosortingpagination.service.UserService;

@SpringBootApplication
@EnableMongoRepositories
@RequiredArgsConstructor
public class MongoSortingPaginationApplication {

    private final UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(MongoSortingPaginationApplication.class, args);
    }

    //for the testing

//    @Bean
//    public CommandLineRunner commandLineRunner() {
//        return args -> {
//            for (int i = 0; i < 100; i++) {
//                UserEntity randomUserEntity = UserEntity.builder()
//                        .username(String.valueOf((long) (Math.random() * 1000000)))
//                        .age((long) (Math.random() * 100))
//                        .email((long) (Math.random() * 1000000) + "@gmail.com")
//                        .build();
//
//                userService.saveUserEntity(randomUserEntity);
//            }
//        };
//    }

}
