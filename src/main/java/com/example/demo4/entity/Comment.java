//package com.example.demo4.entity;
//
//import com.example.demo4.dto.CommentDto;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//
//@Entity
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//public class Comment {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column
//    private String name;
//
//    @Column
//    private String body;
//
//    //부모 게시글
//    @ManyToOne
//    @JoinColumn(name = "article_id") //FK 생성
//    private Article article;
//
//    public static Comment createComment(CommentDto dto, Article article){
//        //예외 발생
//        if(dto.getId()!=null)
//            throw new IllegalArgumentException("댓글의 id가 없어야 합니다.");
//        if(dto.getArticleId()!=null)
//            throw new IllegalArgumentException("게시글의 id가 잘못되었습니다.");
//        //엔티티 생성 및 리턴
//        return new Comment(dto.getId(), dto.getName(), dto.getBody(), article);
//    }
//
//    public void patch(CommentDto dto) {
//        //예외 발생
//        if(this.id!=dto.getId()) {
//            throw new IllegalArgumentException("잘못된 id");
//        }
//        //댓글 갱신
//        if(dto.getName()!=null){
//            this.name=dto.getName();
//        }
//        if(dto.getBody()!=null){
//            this.body=dto.getBody();
//        }
//
//    }
//}
