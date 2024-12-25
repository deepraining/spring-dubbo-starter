package dr.sds.user.main.service;

import dr.sds.base.model.ArticleModel;
import dr.sds.base.model.UserModel;
import java.util.List;

public interface UserService {

  UserModel getUserById(Long id);

  List<UserModel> getUserByIds(List<Long> ids);

  int updateUserById(UserModel userModel);

  List<ArticleModel> getArticleList(Integer pageSize, Integer pageNum);
}
