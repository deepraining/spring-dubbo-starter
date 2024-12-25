package dr.sds.user.main.service;

import dr.sds.article.api.article.ArticleApi;
import dr.sds.base.model.ArticleModel;
import dr.sds.base.model.UserModel;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
  @DubboReference(scope = "remote")
  private ArticleApi articleApi;

  private UserModel generateFakeUserModel(Long id) {
    UserModel userModel = new UserModel();
    userModel.setId(id);
    userModel.setUsername("你好呀" + id);
    userModel.setAvatar("你好你好呀" + id);
    userModel.setNickname("你好你好你好呀" + id);
    return userModel;
  }

  @Override
  public UserModel getUserById(Long id) {
    return generateFakeUserModel(id);
  }

  @Override
  public List<UserModel> getUserByIds(List<Long> ids) {
    List<UserModel> result = new ArrayList<>();
    for (Long id : ids) {
      result.add(generateFakeUserModel(id));
    }
    return result;
  }

  @Override
  public int updateUserById(UserModel userModel) {
    // do something with userModel
    return 1;
  }

  @Override
  public List<ArticleModel> getArticleList(Integer pageSize, Integer pageNum) {
    return articleApi.getArticlesByUserId(pageSize, pageNum, 1L);
  }
}
