package ru.sberbank.newsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.sberbank.newsservice.model.Article;
import ru.sberbank.newsservice.service.ArticleService;

import java.util.List;

@RestController
public class NewsController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/news",
                    produces = MediaType.APPLICATION_JSON_VALUE,
                    consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Article> get(@RequestBody List<Integer> usersId) {
        return articleService.get(usersId);
    }
}
