package com.atguigu.ggkt.vod.controller;


import com.atguigu.ggkt.vod.entity.Teacher;
import com.atguigu.ggkt.vod.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author syx
 * @since 2022-07-03
 */
@Api(tags = "讲师管理接口")
@RestController
@RequestMapping(value="/admin/vod/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    //删除讲师
    @ApiOperation("逻辑删除讲师")
    @DeleteMapping("{id}")
    public boolean removeById(@ApiParam(name = "id", value = "ID", required = true) @PathVariable String id){
        return teacherService.removeById(id);
    }

    //查询所有讲师列表
    @ApiOperation("所有讲师列表")
    @GetMapping("findAll")
    public List<Teacher> findAll(){
        List<Teacher> list = teacherService.list();
        return list;
    }
}