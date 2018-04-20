package ru.sberbank.newsservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sberbank.newsservice.dao.ArticleDao;
import ru.sberbank.newsservice.model.Article;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public List<Article> get(List<Integer> usersId) {
        List<Article> articles = new ArrayList<>();

        usersId.forEach((userId) -> articles.addAll(articleDao.getArticlesById(userId)));

        return articles.stream()
                .sorted(((o1, o2) -> o2.getDateTime().compareTo(o1.getDateTime())))
                .limit(50)
                .collect(Collectors.toList());
    }
}
