package com.github.avancee.swagger.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * {@link ConfigurationProperties} for configuring Swagger.
 *
 * @author bfh
 * @since 2019/03/02
 */
@Data
@ConfigurationProperties("swagger")
public class SwaggerProperties {

    /**
     * switch of swagger
     */
    private Boolean enabled = false;

    /**
     * which package while swagger scan
     */
    private String basePackage = "";

    /**
     * title
     */
    private String title = "";

    /**
     * description
     */
    private String description = "";

    /**
     * terms of service url
     */
    private String termsOfServiceUrl = "";

    /**
     * contact
     */
    private String contact = "";

    /**
     * api document version
     */
    private String version = "1.0.0";
}
