package com.hejx.guli.service.edu.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hejx.guli.service.edu.entity.Teacher;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hejx.guli.service.edu.entity.vo.TeacherQueryVo;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author hejx
 * @since 2020-09-26
 */
public interface TeacherService extends IService<Teacher> {
    /**
     * 分页查询
     */
    IPage<Teacher> selectPage(Long page, Long limit, TeacherQueryVo teacherQueryVo);

    /**
     * 性名-查询
     */
    List<Map<String, Object>> selectNameListByKey(String key);

    /**
     * 根据讲师id删除图片
     */
    boolean removeAvatarById(String id);


    /**前端
     * 根据讲师id获取讲师详情页数据
     * @param id
     * @return
     */
    Map<String, Object> selectTeacherInfoById(String id);

}
