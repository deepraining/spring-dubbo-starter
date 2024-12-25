package dr.sds.user.api.user;

import dr.sds.base.model.UserModel;
import java.util.List;

public interface UserApi {
  // 获取用户信息
  UserModel getUserById(Long id);

  // 获取用户信息
  List<UserModel> getUserByIds(List<Long> ids);
}
