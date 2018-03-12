
package com.kjz.www.article.service;
import com.kjz.www.common.IServiceOperations;
import com.kjz.www.article.domain.Article;
import com.kjz.www.article.vo.ArticleVo;

import java.util.List;
import java.util.Map;

public interface IArticleService extends IServiceOperations<Article, ArticleVo> {
    List<Map<String,Object>> getTagsByArticleId(Integer articleId);

    List<Map<String,Object>> getArticlesByTagId(Integer tagId);
}

