package com.hejx.guli.service.edu.controller.api;

import com.hejx.guli.common.base.result.R;
import com.hejx.guli.service.edu.entity.Course;
import com.hejx.guli.service.edu.entity.vo.WebCourseQueryVo;
import com.hejx.guli.service.edu.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname ApiCourseController
 * @Description TODO
 * @Date 15:31 2021/2/23
 * @Created by hejx
 */

@CrossOrigin
@Api(description="课程")
@RestController
@RequestMapping("/api/edu/course")
public class ApiCourseController {

    @Autowired
    private CourseService courseService;

    @ApiOperation("课程列表")
    @GetMapping("list")
    public R list(
            @ApiParam(value = "查询对象", required = false)
                    WebCourseQueryVo webCourseQueryVo){
        List<Course> courseList = courseService.webSelectList(webCourseQueryVo);
        return  R.ok().data("courseList", courseList);
    }
}
