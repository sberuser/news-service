package ru.sberbank.newsservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.sberbank.newsservice.service.ArticleService;
import ru.sberbank.newsservice.service.ArticleServiceImpl;
import ru.sberbank.newsservice.test_dao.TestArticleDao;

@Configuration
public class ControllerTestConfig {

    @Bean
    ArticleService articleService() {
        return new ArticleServiceImpl();
    }

    @Bean
    TestArticleDao testArticleDao() {
        return new TestArticleDao();
    }
}