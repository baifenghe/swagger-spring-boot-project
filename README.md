# Swagger Spring Boot Project


[![swagger-spring-boot-project](https://img.shields.io/badge/version-1.0--SNAPSHOT-green.svg)](https://github.com/Avancee/swagger-spring-boot-project)  [![GitHub stars](https://img.shields.io/github/stars/Avancee/swagger-spring-boot-project.svg?style=flat&label=Star)](https://github.com/Avancee/swagger-spring-boot-project)  [![GitHub issues](https://img.shields.io/github/issues/Avancee/swagger-spring-boot-project.svg?style=flat&label=issues)](https://github.com/Avancee/swagger-spring-boot-project/issues)  [![GitHub license](https://img.shields.io/github/license/Avancee/swagger-spring-boot-project.svg?style=flat&label=license)](https://github.com/Avancee/swagger-spring-boot-project)





## Todo List

- [x] 工程模块化
- [ ] 用户名/密码登陆
- [ ] 发布RELEASE版本


## Quick Start

- swagger文档地址: `http://localhost:port/swagger-ui.html#/`

由于项目目前还在完善，所以并未提交到中央仓库，如需使用请先本地 `install` 后引入如下依赖。

~~~xml
<dependency>
    <groupId>com.github.avancee</groupId>
    <artifactId>swagger-spring-boot-starter</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
~~~

参考配置如下：
~~~yaml
swagger:
  enabled: true
  version: 1.0.0
  contact: 白风和
  title: Swagger Samples RESTful APIs
  base-package: com.github.avancee.samples.controller
  description: 开箱即用的swagger-spring-boot-starter
  terms-of-service-url: https://github.com/Avancee
~~~



## Documentation

- 等待更新