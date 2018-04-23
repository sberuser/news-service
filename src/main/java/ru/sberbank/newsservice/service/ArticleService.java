package ru.sberbank.newsservice.service;

import ru.sberbank.newsservice.dao.ArticleDao;
import ru.sberbank.newsservice.model.Article;

import java.util.List;

public interface ArticleService {

    List<Article> get(List<Integer> usersId);
}
