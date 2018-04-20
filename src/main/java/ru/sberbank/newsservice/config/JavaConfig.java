package ru.sberbank.newsservice.config;

import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.cloud.netflix.feign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.sberbank.newsservice.feign.ArticleFeignClient;

@Configuration
public class JavaConfig {

    public static final String ARTICLE_SERVICE_URL = "http://localhost:8090";

    @Bean
    ArticleFeignClient articleFeignClient() {
        return Feign.builder()
                .contract(new SpringMvcContract())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(new Logger.ErrorLogger())
                .logLevel(Logger.Level.FULL)
                .target(ArticleFeignClient.class, ARTICLE_SERVICE_URL);
    }
}
