package dr.sds.article.main.service;

import dr.sds.base.model.ArticleModel;
import dr.sds.base.model.ArticleRecord;
import dr.sds.user.api.user.UserApi;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ArticleServiceImpl implements ArticleService {
  @DubboReference(scope = "remote")
  private UserApi userApi;

  private ArticleModel generateFakeArticleModel(Long id) {
    ArticleModel articleModel = new ArticleModel();
    articleModel.setId(id);
    articleModel.setAuthorId(id);
    articleModel.setTitle("你好呀" + id);
    articleModel.setIntro("你好你好呀" + id);
    articleModel.setDetail("你好你好你好呀" + id);
    return articleModel;
  }

  @Override
  public ArticleModel getArticleById(Long id) {
    return generateFakeArticleModel(id);
  }

  @Override
  public List<ArticleModel> getArticleByIds(List<Long> ids) {
    List<ArticleModel> result = new ArrayList<>();
    for (Long id : ids) {
      result.add(generateFakeArticleModel(id));
    }
    return result;
  }

  @Override
  public int createArticle(ArticleModel articleModel) {
    // do something with articleModel
    return 1;
  }

  @Override
  public List<ArticleModel> getArticlesByUserId(Integer pageSize, Integer pageNum, Long userId) {
    List<ArticleModel> list = new ArrayList<>();
    for (int i = 1; i < 11; i++) {
      list.add(generateFakeArticleModel((long) i));
    }
    return list;
  }

  @Override
  public List<ArticleRecord> getArticleList(Integer pageSize, Integer pageNum) {
    List<ArticleRecord> list = new ArrayList<>();
    for (int i = 1; i < 11; i++) {
      ArticleModel articleModel = generateFakeArticleModel((long) i);
      ArticleRecord articleRecord = new ArticleRecord();
      BeanUtils.copyProperties(articleModel, articleRecord);

      articleRecord.setAuthorItem(userApi.getUserById((long) i));
      list.add(articleRecord);
    }
    return list;
  }
}
