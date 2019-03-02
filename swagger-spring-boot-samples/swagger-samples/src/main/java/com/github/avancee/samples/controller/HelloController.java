package com.github.avancee.samples.controller;

import com.github.avancee.samples.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author bfh
 * @since 2018/12/31
 */
@Api(tags = "HelloController")
@RestController
public class HelloController {


    @ApiOperation("根据id获取用户信息")
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Integer id) {

        return new User(id, "joy", "male");
    }

    @ApiOperation("新增用户")
    @PostMapping("user")
    public ResponseEntity user(User user) {

        return ResponseEntity.ok().body(user);
    }
}
