//package com.example.demo4.api;
//
//import com.example.demo4.dto.CommentDto;
//import com.example.demo4.entity.Comment;
//import com.example.demo4.service.CommentService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.thymeleaf.templateparser.markup.HTMLTemplateParser;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/api")
//public class CommentApiController {
//
//    private final CommentService service;
//
//    @GetMapping("/articles/{articleId}/comments")
//    public ResponseEntity<List<CommentDto>> comments(@PathVariable Long articleId) {
//     List<CommentDto> dtos = service.comments(articleId);
//     return ResponseEntity.status(HttpStatus.OK).body(dtos);
//    }
//
//    @PostMapping("/articles/{articleId}/comments")
//    public ResponseEntity<CommentDto> create(@PathVariable Long articleId, @RequestBody CommentDto dto) {
//        CommentDto createdDto = service.create(articleId, dto);
//        return ResponseEntity.status(HttpStatus.OK).body(createdDto);
//    }
//
//    @PatchMapping("/comments/{id}")
//    public ResponseEntity<CommentDto> update(@PathVariable Long id, @RequestBody CommentDto dto) {
//        CommentDto updatedDto = service.update(id, dto);
//        return ResponseEntity.status(HttpStatus.OK).body(updatedDto);
//    }
//
//    @DeleteMapping("/comments/{id}")
//    public ResponseEntity<CommentDto> delete(@PathVariable Long id) {
//        CommentDto deletedDto = service.delete(id);
//        return ResponseEntity.status(HttpStatus.OK).body(deletedDto);
//    }
//}
