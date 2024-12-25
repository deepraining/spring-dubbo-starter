package dr.sds.user.main.controller;

import dr.sds.base.CommonResult;
import dr.sds.base.model.ArticleModel;
import dr.sds.base.model.UserModel;
import dr.sds.user.main.service.UserService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired private UserService userService;

  @RequestMapping(value = "/articleList", method = RequestMethod.GET)
  public CommonResult<List<ArticleModel>> articleList(
      @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
    List<ArticleModel> list = userService.getArticleList(pageSize, pageNum);
    return CommonResult.success(list);
  }

  @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
  public CommonResult<Integer> updateUser(@RequestBody UserModel userModel) {
    return CommonResult.success(userService.updateUserById(userModel));
  }
}
