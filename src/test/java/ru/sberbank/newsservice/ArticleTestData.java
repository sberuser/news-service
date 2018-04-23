package ru.sberbank.newsservice;

import ru.sberbank.newsservice.model.Article;

import java.time.LocalDateTime;

public class ArticleTestData {

    public static final Integer USER_ID_1 = 100000;
    public static final Integer USER_ID_2 = 100001;
    public static final Integer USER_ID_3 = 100002;

    public static final Integer ARTICLE_ID_1 = 1;
    public static final Integer ARTICLE_ID_2 = 2;
    public static final Integer ARTICLE_ID_3 = 3;
    public static final Integer ARTICLE_ID_4 = 4;

    public static final Article ARTICLE_1 = new Article(ARTICLE_ID_1, USER_ID_1, "First article", "one", LocalDateTime.now());
    public static final Article ARTICLE_2 = new Article(ARTICLE_ID_2, USER_ID_1, "Second article", "two", LocalDateTime.now());
    public static final Article ARTICLE_3 = new Article(ARTICLE_ID_3, USER_ID_2, "Third article", "three", LocalDateTime.now());
    public static final Article ARTICLE_4 = new Article(ARTICLE_ID_4, USER_ID_3, "Fourth article", "four", LocalDateTime.now());
}
