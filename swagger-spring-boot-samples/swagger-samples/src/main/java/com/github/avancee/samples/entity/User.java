package com.github.avancee.samples.entity;

import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户实体类
 *
 * @author bfh
 * @since 2019/03/02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /**
     * 用户ID
     */
    @ApiParam(value = "用户ID", example = "123")
    private Integer id;

    /**
     * 用户名
     */
    @ApiParam("用户名")
    private String name;

    /**
     * 性别
     */
    @ApiParam("性别")
    private String gender;

}
