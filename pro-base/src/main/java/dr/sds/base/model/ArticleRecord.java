package dr.sds.base.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

// 文章模型
@Setter
@Getter
public class ArticleRecord extends ArticleModel implements Serializable {
  private UserModel authorItem;
}
