package com.example.demo4.service;

import com.example.demo4.dto.ArticleForm;
import com.example.demo4.entity.Article;
import com.example.demo4.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articlerepository;
//    private final CommentService commentService;

    public List<Article> index() {
        return articlerepository.findAll();
    }

    public Article show(Long id) {
        return articlerepository.findById(id).orElse(null);
    }

    public Article create(ArticleForm dto) {
        Article articleEntity = dto.toEntity();
        return articlerepository.save(articleEntity);
    }

    public Article update(Long id, ArticleForm dto) {
        //수정 게시글
        Article updated = dto.toEntity();
        //기존 게시글
        Article find = articlerepository.findById(id).orElse(null);
        // 잘못된 요청 처리
        if(updated == null || id != updated.getId()) {
            return null;
        }
        //기존 게시글에 put
        find.put(updated);
        return articlerepository.save(find);
    }

    public Article delete(Long id) {
        //삭제할 entity
        Article find = articlerepository.findById(id).orElse(null);
        //삭제할게 없으면 null
        if(find==null) {
            return null;
        }
        //딸린 댓글 먼저 지워줌
//        commentService.deleteByArticleId(id);
        articlerepository.delete(find);
        return find;
    }

//    @Transactional
//    public List<Article> createArticles(List<ArticleForm> dtos) {
//        //1. dtos -> entity
//        List<Article> articleList = dtos.stream()
//                .map(dto -> dto.toEntity())
//                .collect(Collectors.toList());
//        //2. entity -> db
//        articleList.stream()
//                .forEach(article -> articlerepository.save(article));
//        //3. 강제 예외 발생
//        articlerepository.findById(-1L)
//                .orElseThrow(()-> new IllegalArgumentException("실패"));
//        //4. return
//        return articleList;
//    }
}
