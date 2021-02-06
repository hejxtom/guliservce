package com.hejx.guli.service.edu.service;

import com.hejx.guli.service.edu.entity.Course;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hejx.guli.service.edu.entity.form.CourseInfoForm;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author hejx
 * @since 2020-09-26
 */
public interface CourseService extends IService<Course> {

    /**
     * 保存课程和课程详情信息
     * @param courseInfoForm
     * @return 新生成的课程id
     */
    String saveCourseInfo(CourseInfoForm courseInfoForm);

}
