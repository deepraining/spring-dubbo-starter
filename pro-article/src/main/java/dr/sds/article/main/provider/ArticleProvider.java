package dr.sds.article.main.provider;

import dr.sds.article.api.article.ArticleApi;
import dr.sds.article.main.service.ArticleService;
import dr.sds.base.model.ArticleModel;
import java.util.List;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@DubboService
@Component
public class ArticleProvider implements ArticleApi {
  @Autowired private ArticleService articleService;

  @Override
  public ArticleModel getArticleById(Long id) {
    return articleService.getArticleById(id);
  }

  @Override
  public List<ArticleModel> getArticleByIds(List<Long> ids) {
    return articleService.getArticleByIds(ids);
  }

  @Override
  public List<ArticleModel> getArticlesByUserId(Integer pageSize, Integer pageNum, Long userId) {
    return articleService.getArticlesByUserId(pageSize, pageNum, userId);
  }
}
