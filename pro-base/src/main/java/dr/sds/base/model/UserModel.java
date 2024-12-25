package dr.sds.base.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

// 用户模型
@Setter
@Getter
public class UserModel implements Serializable {
  private Long id; // Id
  private String username; // 用户名
  private String avatar; // 头像
  private String nickname; // 昵称
}
