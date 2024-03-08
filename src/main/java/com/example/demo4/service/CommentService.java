//package com.example.demo4.service;
//
//import com.example.demo4.dto.CommentDto;
//import com.example.demo4.entity.Article;
//import com.example.demo4.entity.Comment;
//import com.example.demo4.repository.ArticleRepository;
//import com.example.demo4.repository.CommentRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//@RequiredArgsConstructor
//public class CommentService {
//
//    private final ArticleRepository articleRepository;
//    private final CommentRepository commentRepository;
//
//    public List<CommentDto> comments(Long articleId) {
////        comment 조회
////        List<Comment> comments = commentRepository.findByArticleId(articleId);
////        entity -> dto
////        List<CommentDto> dtos = new ArrayList<CommentDto>();
////        for(int i=0; i< comments.size(); i++){
////            Comment comment = comments.get(i);
////            CommentDto dto = CommentDto.createDto(comment);
////            dtos.add(dto);
////        }
//
//        return commentRepository.findByArticleId(articleId)
//                .stream()
//                .map(comment -> CommentDto.createDto(comment))
//                .collect(Collectors.toList());
//    }
//
//    public CommentDto create(Long articleId, CommentDto dto) {
//        //1. 게시글 조회 및 에러 발생
//        Article article = articleRepository.findById(articleId)
//                .orElseThrow(() -> new IllegalArgumentException("댓글 생성 실패"));
//        //2. 댓글 엔티티 생성
//        Comment comment = Comment.createComment(dto, article);
//        //3. 댓글 엔티티를 db에 저장
//        Comment created = commentRepository.save(comment);
//        //4. dto로 변환해 리턴
//        return CommentDto.createDto(created);
//    }
//
//    public CommentDto update(Long id, CommentDto dto) {
//        //1. 댓글 조회 및 예외 발생
//        Comment target = commentRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("댓글 수정 실패, 대상 댓글이 없습니다."));
//        //2. 댓글 수정
//        target.patch(dto);
//        //3. db 갱신
//        Comment updated = commentRepository.save(target);
//        //4. 댓글 entity -> dto, return
//        return CommentDto.createDto(updated);
//    }
//
//    public CommentDto delete(Long id) {
//        Comment target = commentRepository.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("댓글 삭제 실패, 대상 댓글이 없습니다."));
//        commentRepository.delete(target);
//        return CommentDto.createDto(target);
//    }
//
//    public void deleteByArticleId(Long id) {
//        List<Comment> comments = commentRepository.findByArticleId(id);
//        for (Comment comment : comments) {
//            commentRepository.delete(comment);
//        }
//
//    }
//}
