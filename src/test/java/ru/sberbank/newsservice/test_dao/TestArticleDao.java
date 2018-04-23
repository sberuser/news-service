package ru.sberbank.newsservice.test_dao;

import org.springframework.stereotype.Repository;
import ru.sberbank.newsservice.dao.ArticleDao;
import ru.sberbank.newsservice.model.Article;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static ru.sberbank.newsservice.ArticleTestData.*;

@Repository
public class TestArticleDao implements ArticleDao {

    private static final Map<Integer, Article> articles = new HashMap<>();

    static {
        articles.put(1, ARTICLE_1);
        articles.put(2, ARTICLE_2);
        articles.put(3, ARTICLE_3);
        articles.put(4, ARTICLE_4);
    }

    @Override
    public List<Article> getArticlesById(int id) {
        return articles.values().stream()
                .filter(article -> article.getUserId() == id)
                .collect(Collectors.toList());
    }
}
