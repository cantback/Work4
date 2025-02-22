package com.catowl.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface ArticleMapper {
    List<Map<String,Object>> articleListByLike(@Param("limit") int limit, @Param("offset") int offset);
    List<Map<String,Object>> articleListByView(@Param("limit") int limit, @Param("offset") int offset);
    int incrementViewCount(@Param("article_id") Long articleId);
    int deleteArticle(@Param("article_id") Long articleId);
    int publishArticle(@Param("title") String title, @Param("content") String content,@Param("author_id") Long author_id);
}
