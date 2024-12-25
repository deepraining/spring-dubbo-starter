package dr.sds.article.api.article;

import dr.sds.base.model.ArticleModel;
import java.util.List;

public interface ArticleApi {
  // 获取文章信息
  ArticleModel getArticleById(Long id);

  // 获取文章信息
  List<ArticleModel> getArticleByIds(List<Long> ids);

  // 获取用户的文章列表
  List<ArticleModel> getArticlesByUserId(Integer pageSize, Integer pageNum, Long userId);
}
