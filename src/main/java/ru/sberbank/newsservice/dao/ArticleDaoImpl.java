package ru.sberbank.newsservice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.sberbank.newsservice.feign.ArticleFeignClient;
import ru.sberbank.newsservice.model.Article;

import java.util.List;

@Repository
public class ArticleDaoImpl implements ArticleDao {

    @Autowired
    private ArticleFeignClient articleFeignClient;

    @Override
    public List<Article> getArticlesById(int id) {
        return articleFeignClient.getAllById(id);
    }
}
