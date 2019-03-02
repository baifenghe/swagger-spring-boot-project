package com.github.avancee.swagger.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * {@link ConfigurationProperties} for configuring Swagger.
 *
 * @author bfh
 * @since 2019/03/02
 */
@Data
@ConfigurationProperties("swagger")
public class SwaggerProperties implements Serializable {

    private static final long serialVersionUID = -643260829749539015L;

    /**
     * 是否开启swagger
     */
    private Boolean enabled = false;

    /**
     * swagger解析路径
     */
    private String basePackage;

    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    private String description;

    /**
     * 服务条款地址
     */
    private String termsOfServiceUrl;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 版本
     */
    private String version;
}
