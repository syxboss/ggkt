package com.atguigu.ggkt.vod.controller;


import com.atguigu.ggkt.vod.entity.Teacher;
import com.atguigu.ggkt.vod.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author syx
 * @since 2022-07-03
 */
@RestController
@RequestMapping("/vod/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService ;

    @GetMapping("findAll")
    private List<Teacher> findAll(){
        List<Teacher> list = teacherService.list();
        return list;
    }
}

