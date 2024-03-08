package com.example.demo4.controller;

import com.example.demo4.dto.ArticleForm;
import com.example.demo4.entity.Article;
import com.example.demo4.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("/articles")
    public String index(Model model) {
        List<Article> articleList = articleService.index();
        model.addAttribute("articleList",articleList);
        return "articles/index";
    }

    @GetMapping("/articles/new")
    public String create() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        //Dto -> entity
        Article article = form.toEntity();
        Article saved = articleService.create(form);
        return "redirect:/articles/" + saved.getId();
    }

    @GetMapping("/articles/{id}")
    public String show(@PathVariable Long id, Model model){
        Article article = articleService.show(id);
//        List<CommentDto> comment = commentService.comments(id);
//        model.addAttribute("comment",comment);
        model.addAttribute("article", article);
        return "articles/show";
    }

    @GetMapping("/articles/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        Article article = articleService.show(id);
        model.addAttribute("article",article);
        return "/articles/edit";
    }

    @PostMapping("/articles/update")
    public String update(ArticleForm form) {
        Article article = form.toEntity();
        articleService.update(article.getId(), form);
        return "redirect:/articles/" + article.getId();
    }

    @GetMapping("/articles/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes rttr) {
        Article find = articleService.show(id);
        if (find != null) {
            articleService.delete(id);
            rttr.addFlashAttribute("msg", "<<delete complete>>");
            articleService.delete(id);
        }
        return "redirect:/articles";
    }

}
