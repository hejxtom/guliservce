package com.hejx.guli.service.edu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hejx.guli.common.base.result.R;
import com.hejx.guli.service.edu.entity.Course;
import com.hejx.guli.service.edu.entity.Teacher;
import com.hejx.guli.service.edu.entity.vo.TeacherQueryVo;
import com.hejx.guli.service.edu.feign.OssFileService;
import com.hejx.guli.service.edu.mapper.CourseMapper;
import com.hejx.guli.service.edu.mapper.TeacherMapper;
import com.hejx.guli.service.edu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>
 * 讲师 服务实现类
 * </p>
 *
 * @author hejx
 * @since 2020-09-26
 */
//注入TeacherMapper 和 Teacher
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

    @Autowired
    private OssFileService ossFileService;

    @Override
    public IPage<Teacher> selectPage(Long page, Long limit, TeacherQueryVo teacherQueryVo) {
        Page<Teacher> pageParam = new Page<>(page, limit);
        //显示分页查询列表
        //1.排序：按照sort字段排序
        QueryWrapper<Teacher> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("sort");

        //2.分页查询
        if (teacherQueryVo == null){
            return baseMapper.selectPage(pageParam, queryWrapper);
        }

        //条件查询
        String name = teacherQueryVo.getName();
        Integer level = teacherQueryVo.getLevel();
        String begin = teacherQueryVo.getJoinDateBegin();
        String end = teacherQueryVo.getJoinDateEnd();

        if (!StringUtils.isEmpty(name)) {
            //左%会使索引失效
            queryWrapper.likeRight("name", name);
        }

        if (level != null) {
            queryWrapper.eq("level", level);
        }

        if (!StringUtils.isEmpty(begin)) {
            queryWrapper.ge("join_date", begin);
        }

        if (!StringUtils.isEmpty(end)) {
            queryWrapper.le("join_date", end);
        }

        return baseMapper.selectPage(pageParam, queryWrapper);
    }

    @Override
    public List<Map<String, Object>> selectNameListByKey(String key) {
        QueryWrapper<Teacher> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("name");
        //SELECT name FROM edu_teacher WHERE is_deleted=0 AND (name LIKE '?')
        queryWrapper.likeRight("name", key);

        List<Map<String, Object>> list = baseMapper.selectMaps(queryWrapper);//返回值是Map列表
        return list;
    }


/**
 * 根据讲师id删除图片
 *
 */
    @Override
    public boolean removeAvatarById(String id) {
        Teacher teacher = baseMapper.selectById(id);
        if(teacher != null) {
            //根据讲师id获取avatar
            String avatar = teacher.getAvatar();
            if(!StringUtils.isEmpty(avatar)){
                //删除图片
                R r = ossFileService.removeFile(avatar);
                return r.getSuccess();
            }
        }
        return false;
    }


    @Autowired
    private CourseMapper courseMapper;

    /**
     * 根据讲师id获取讲师详情页数据
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> selectTeacherInfoById(String id) {
        //获取讲师信息
        Teacher teacher = baseMapper.selectById(id);
        //根据讲师id获取讲师课程
        List<Course> courseList =  courseMapper.selectList(new QueryWrapper<Course>().eq("teacher_id", id));

        Map<String, Object> map = new HashMap<>();
        map.put("teacher", teacher);
        map.put("courseList", courseList);
        return map;
    }

}
