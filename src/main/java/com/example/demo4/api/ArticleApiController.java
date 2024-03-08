//package com.example.demo4.api;
//
//import com.example.demo4.dto.ArticleForm;
//import com.example.demo4.entity.Article;
//import com.example.demo4.repository.ArticleRepository;
//import com.example.demo4.service.ArticleService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//@RequiredArgsConstructor
//public class ArticleApiController {
//
////    private final ArticleRepository articleRepository;
//    private final ArticleService service;
//
//// 모든 게시글 조회
////    @GetMapping("/articles")
////    public List<Article> index() {
////        ArrayList<Article> articleList = articleRepository.findAll();
////        return articleList;
////    }
//
//    @GetMapping("/articles")
//    public List<Article> index() {
//        return service.index();
//    }
//
//// 단일 게시글 조회
////    @GetMapping("/articles/{id}")
////    public Article getArticle(@PathVariable Long id) {
////        Article article = articleRepository.findById(id).orElse(null);
////        return article;
////    }
//
//    @GetMapping("/articles/{id}")
//    public Article getArticle(@PathVariable Long id) {
//        return service.show(id);
//    }
//
//    // 게시글 생성
////    @PostMapping("/articles")
////    public Article newArticle(@RequestBody ArticleForm form) {
////        Article articleEntity = form.toEntity();
////        Article saved = articleRepository.save(articleEntity);
////        return saved;
////    }
////
//    @PostMapping("/articles")
//    public ResponseEntity<Article> newArticle(@RequestBody ArticleForm dto) {
//        Article article = service.create(dto);
//        return (article != null) ?
//                ResponseEntity.status(HttpStatus.OK).body(article) :
//                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//    }
//
//    // 게시글 수정
////    @PatchMapping("/articles/{id}")
////    public ResponseEntity<Article> patch(@PathVariable Long id, @RequestBody ArticleForm form) {
////        Article articleEntity = form.toEntity();
////        Article find = articleRepository.findById(id).orElse(null);
////        //잘못된 요청 처리
////        if(find==null || id!=articleEntity.getId()) {
////            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
////        }
////        Article saved = articleRepository.save(articleEntity);
////        return ResponseEntity.status(HttpStatus.OK).body(saved);
////    }
//
//    @PatchMapping("/articles/{id}")
//    public ResponseEntity<Article> patch(@PathVariable Long id, @RequestBody ArticleForm dto) {
//        Article updated = service.update(id, dto);
//        return (updated != null) ?
//                ResponseEntity.status(HttpStatus.OK).body(updated) :
//                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//    }
////
////    @PutMapping("/articles/{id}")
////    public ResponseEntity<Article> put(@PathVariable Long id, @RequestBody ArticleForm form) {
////        Article articleEntity = form.toEntity();
////        Article find = articleRepository.findById(id).orElse(null);
////        //잘못된 요청 처리
////        if(find==null || id!=articleEntity.getId()) {
////            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
////        }
////        //기존 데이터에 수정할 데이터 추가
////        find.put(articleEntity);
////        Article saved = articleRepository.save(find);
////        return ResponseEntity.status(HttpStatus.OK).body(saved);
////    }
////
////    @DeleteMapping("/articles/{id}")
////    public ResponseEntity<Article> delete(@PathVariable Long id) {
////        Article find = articleRepository.findById(id).orElse(null);
////        if(find==null) {
////            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
////        }
////        articleRepository.delete(find);
////        return ResponseEntity.status(HttpStatus.OK).build();
////    }
//
//    @DeleteMapping("/articles/{id}")
//    public ResponseEntity<Article> delete(@PathVariable Long id) {
//        Article deleted = service.delete(id);
//        return (deleted != null) ?
//                ResponseEntity.status(HttpStatus.OK).body(deleted) :
//                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//    }
//
//    // transaction test
////    @PostMapping("/t-test")
////    public ResponseEntity<List<Article>> test(@RequestBody List<ArticleForm> dtos) {
////        List<Article> articleList = service.createArticles(dtos);
////        return (articleList != null) ?
////                ResponseEntity.status(HttpStatus.OK).body(articleList) :
////                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
////    }
//}
