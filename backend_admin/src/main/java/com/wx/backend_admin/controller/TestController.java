package com.wx.backend_admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName TestController
 * @Description TODO
 * @Author Wangdongyi
 * @Date 2023/8/16 23:04
 * @Version 1.0
 */
@Api(tags = "swagger接口测试")
@RestController
@RequestMapping("/test")
public class TestController {

    @ApiOperation(value = "/hello", tags = "测试方法")
    @GetMapping("/hello")
    public String test() {
        return "hello spring boot";
    }
}
