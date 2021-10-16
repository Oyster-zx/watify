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
                    .ico("2343242323")
                    .dic("CZ23423423")
                    .bankAccount("234234234/0800")
                    .build();
            userDao.save(testUser);
        };
    }
}
