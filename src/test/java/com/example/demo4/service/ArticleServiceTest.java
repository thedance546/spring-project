package com.example.demo4.service;

import com.example.demo4.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArticleServiceTest {

    @Autowired ArticleService service;

    @Test
    void index() {
        //예상 데이터
        Article a = new Article(1L, "aaaa", "1111");
        Article b = new Article(2L, "bbbb", "2222");
        Article c = new Article(3L, "cccc", "3333");
        ArrayList<Article> expected = new ArrayList<>(Arrays.asList(a, b, c));
        //실제 데이터
        List<Article> find = service.index();
        //검증
        assertEquals(expected.toString(),find.toString());

    }

}