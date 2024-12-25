# spring-dubbo-starter

用于快速创建 [dubbo](https://github.com/apache/dubbo) 应用的模板脚手架，使用 [Gradle](https://gradle.org/) 构建项目。

## 子项目

- `pro-base`: 基础代码
- `pro-user-api`: `user` 项目对外开放接口
- `pro-user`: `user` 项目主体代码
- `pro-article-api`: `article` 项目对外开放接口
- `pro-article`: `article` 项目主体代码

## 创建项目

克隆代码，然后根据需要调整项目与代码

```
git clone https://github.com/deepraining/spring-dubbo-starter.git yourProName --depth=1

cd yourProName
```

去掉原有的 Git 信息，并重新初始化

```
rm -rf .git

git init
```

## 运行项目

请先确保已有 Nacos 服务。

先运行 `pro-user` 项目

```
./gradlew pro-user:run
```

再运行 `pro-article` 项目

```
./gradlew pro-article:run
```

访问数据

```
// 访问user项目接口
http://localhost:18001/user/articleList

// 访问article项目接口
http://localhost:18002/article/articleList
```
