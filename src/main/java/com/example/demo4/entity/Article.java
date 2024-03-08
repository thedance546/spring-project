package com.example.demo4.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Entity
public class Article {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String content;

    //수정 로직
    public void put(Article article) {
        if(article.title!=null) {
            this.title= article.title;
        }
        if(article.content!=null){
            this.content= article.content;
        }
    }

}
