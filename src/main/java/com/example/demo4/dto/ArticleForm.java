package com.example.demo4.dto;

import com.example.demo4.entity.Article;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private Long id;
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(id, title, content);
    }

}
