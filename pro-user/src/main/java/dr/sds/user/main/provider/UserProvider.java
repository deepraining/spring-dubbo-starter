package dr.sds.user.main.provider;

import dr.sds.base.model.UserModel;
import dr.sds.user.api.user.UserApi;
import dr.sds.user.main.service.UserService;
import java.util.List;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@DubboService
@Component
public class UserProvider implements UserApi {
  @Autowired private UserService userService;

  @Override
  public UserModel getUserById(Long id) {
    return userService.getUserById(id);
  }

  @Override
  public List<UserModel> getUserByIds(List<Long> ids) {
    return userService.getUserByIds(ids);
  }
}
