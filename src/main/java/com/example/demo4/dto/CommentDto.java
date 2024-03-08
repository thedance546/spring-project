//package com.example.demo4.dto;
//
//import com.example.demo4.entity.Article;
//import com.example.demo4.entity.Comment;
//import lombok.*;
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@ToString
//public class CommentDto {
//
//    private Long id;
//    private Long articleId;
//    private String name;
//    private String body;
//
//    public static CommentDto createDto(Comment comment) {
//        return new CommentDto(comment.getId(), comment.getArticle().getId(), comment.getName(), comment.getBody());}
//
////    public Comment toEntity() {
////        return new Comment(id,name,body)
////    }
//
//}
