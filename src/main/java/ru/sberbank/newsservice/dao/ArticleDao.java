package ru.sberbank.newsservice.dao;

import ru.sberbank.newsservice.model.Article;

import java.util.List;

public interface ArticleDao {

    List<Article> getArticlesById(int id);
}
