package com.hejx.guli.service.edu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hejx.guli.service.edu.entity.Course;
import com.hejx.guli.service.edu.entity.CourseDescription;
import com.hejx.guli.service.edu.entity.form.CourseInfoForm;
import com.hejx.guli.service.edu.mapper.CourseDescriptionMapper;
import com.hejx.guli.service.edu.mapper.CourseMapper;
import com.hejx.guli.service.edu.service.CourseService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 课程 服务实现类
 * </p>
 *
 * @author hejx
 * @since 2020-09-26
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {
    //注意：为了避免idea在这个位置报告找不到依赖的错误，
//我们可以在CourseDescriptionMapper接口上添加@Repository注解
    @Autowired
    private CourseDescriptionMapper courseDescriptionMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public String saveCourseInfo(CourseInfoForm courseInfoForm) {

        //保存课程基本信息
        Course course = new Course();
        course.setStatus(Course.COURSE_DRAFT);
        BeanUtils.copyProperties(courseInfoForm, course);
        baseMapper.insert(course);

        //保存课程详情信息
        CourseDescription courseDescription = new CourseDescription();
        courseDescription.setDescription(courseInfoForm.getDescription());
        courseDescription.setId(course.getId());
        courseDescriptionMapper.insert(courseDescription);

        return course.getId();
    }

}
