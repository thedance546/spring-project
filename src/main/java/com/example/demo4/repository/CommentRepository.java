//package com.example.demo4.repository;
//
//import com.example.demo4.entity.Comment;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.List;
//import java.util.Optional;
//
//public interface CommentRepository extends JpaRepository<Comment, Long> {
//
//    //게시글의 모든 댓글 조회
////    @Query(value = "SELECT * FROM comment WHERE article_id = :articleId", nativeQuery = true)
//    List<Comment> findByArticleId(Long articleId);
//
//    //닉네임의 모든 댓글 조회
////    @Query(value = "SELECT * FROM comment WHERE name = :name", nativeQuery = true)
//    List<Comment> findByName(String name);
//}
