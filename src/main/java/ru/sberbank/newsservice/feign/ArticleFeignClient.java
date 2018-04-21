package ru.sberbank.newsservice.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.sberbank.newsservice.model.Article;

import java.util.List;

@FeignClient
public interface ArticleFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/articles/{userId}")
    List<Article> getAllById(@PathVariable("userId") Integer userId);
}
