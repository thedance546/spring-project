//package com.example.demo4.controller;
//
//import com.example.demo4.dto.CommentDto;
//import com.example.demo4.entity.Article;
//import com.example.demo4.repository.ArticleRepository;
//import com.example.demo4.repository.CommentRepository;
//import com.example.demo4.service.CommentService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//@RequiredArgsConstructor
//public class CommentController {
//
//    private final CommentRepository commentRepository;
//    private final ArticleRepository articleRepository;
//    private final CommentService commentService;
//
//    @GetMapping("/articles/{articleId}/comments/new")
//    public String newCommentForm(@PathVariable Long articleId, Model model) {
//        Article article = articleRepository.findById(articleId).orElse(null);
//        model.addAttribute("article", article);
//        return "/comments/new";
//    }
//
//    @PostMapping("/articles/{articleId}/comments/create")
//    public String newComment(@PathVariable Long articleId) {
//
//        return "redirect:/articles/";
//    }
//}
