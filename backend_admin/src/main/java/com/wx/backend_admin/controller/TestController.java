package com.wx.backend_admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName TestController
 * @Description TODO
 * @Author Wangdongyi
 * @Date 2023/8/16 23:04
 * @Version 1.0
 */
@Api(value = "/test",tags = "swagger接口测试")
@RestController
@RequestMapping("/test")
public class TestController {

    /**
     * @MethodName selectTest
     * @Description   查询测试
     * @return: java.lang.String
     * @Author Wangdong yi
     * @Date 2023/8/20 12:17
     */
    @ApiOperation(value = "/selectTest", tags = "查询测试方法")
    @GetMapping("/selectTest")
    public String selectTest() {
        return "查询成功";
    }

    /**
     * @MethodName selectTest
     * @Description   新增测试
     * @return: java.lang.String
     * @Author Wangdong yi
     * @Date 2023/8/20 12:18
     */
    @ApiOperation(value = "/saveTest", tags = "新增测试方法")
    @PostMapping("/saveTest")
    public String saveTest(@ApiParam(value = "查询用户列表", required = true)String name) {
        return "新增成功";
    }
}
