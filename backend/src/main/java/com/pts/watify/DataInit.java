package com.pts.watify;

import com.pts.watify.dao.UserDao;
import com.pts.watify.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInit {

    @Bean
    public CommandLineRunner setUpInitialData(UserDao userDao) {
        return (args) -> {
            User testUser = User.builder()
                    .name("Jiří Spokojený")
                    .build();
            userDao.save(testUser);
        };
    }
}
