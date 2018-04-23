package ru.sberbank.newsservice.service;

import org.assertj.core.api.Assertions;
import org.assertj.core.internal.RecursiveFieldByFieldComparator;
import org.assertj.core.internal.TypeComparators;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import ru.sberbank.newsservice.ControllerTestConfig;
import ru.sberbank.newsservice.model.Article;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;
import static ru.sberbank.newsservice.ArticleTestData.*;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ControllerTestConfig.class})
@WebAppConfiguration
public class ArticleServiceImplTest {

    @Autowired
    private ArticleService articleService;

    @Test
    public void get() {
        List<Article> actual = articleService.get(Arrays.asList(USER_ID_1, USER_ID_2));

        Assertions.assertThat(actual)
                .usingElementComparator(recursiveIgnoringFieldsComparator("dateTime"))
                .containsExactlyInAnyOrder(ARTICLE_1, ARTICLE_2, ARTICLE_3);
    }

    @SuppressWarnings("unchecked")
    private <T> Comparator<T> recursiveIgnoringFieldsComparator(String... fieldNames) {
        final Map<String, Comparator<?>> comparatorByPropertyOrField =
                Arrays.stream(fieldNames)
                        .collect(toMap(
                                name -> name,
                                name -> (o1, o2) -> 0
                        ));

        return (Comparator<T>) new RecursiveFieldByFieldComparator(comparatorByPropertyOrField, new TypeComparators());
    }
}