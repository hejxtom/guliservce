package com.hejx.guli.service.edu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hejx.guli.service.edu.entity.Course;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hejx.guli.service.edu.entity.form.CourseInfoForm;
import com.hejx.guli.service.edu.entity.vo.CoursePublishVo;
import com.hejx.guli.service.edu.entity.vo.CourseQueryVo;
import com.hejx.guli.service.edu.entity.vo.CourseVo;

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
     *
     * @param courseInfoForm
     * @return 新生成的课程id
     */
    String saveCourseInfo(CourseInfoForm courseInfoForm);

    /**
     * 回显
     */
    CourseInfoForm getCourseInfoById(String id);

    /***
     *
     *
     *更新
     *
     *
     */

    void updateCourseInfoById(CourseInfoForm courseInfoForm);

    IPage<CourseVo> selectPage(Long page, Long limit, CourseQueryVo courseQueryVo);

    boolean removeCoverById(String id);

    boolean removeCourseById(String id);

    CoursePublishVo getCoursePublishVoById(String id);

    boolean publishCourseById(String id);
}
