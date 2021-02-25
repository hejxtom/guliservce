package com.hejx.guli.service.edu.controller.api;

import com.hejx.guli.common.base.result.R;
import com.hejx.guli.service.edu.entity.Course;
import com.hejx.guli.service.edu.entity.vo.ChapterVo;
import com.hejx.guli.service.edu.entity.vo.WebCourseQueryVo;
import com.hejx.guli.service.edu.entity.vo.WebCourseVo;
import com.hejx.guli.service.edu.service.ChapterService;
import com.hejx.guli.service.edu.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @Autowired
    private ChapterService chapterService;

    @ApiOperation("根据ID查询课程")
    @GetMapping("get/{courseId}")
    public R getById(
            @ApiParam(value = "课程ID", required = true)
            @PathVariable String courseId){

        //查询课程信息和讲师信息
        WebCourseVo webCourseVo = courseService.selectWebCourseVoById(courseId);

        //查询当前课程的嵌套章节信息和课时信息
        List<ChapterVo> chapterVoList = chapterService.nestedList(courseId);

        return R.ok().data("course", webCourseVo).data("chapterVoList", chapterVoList);
    }
}
