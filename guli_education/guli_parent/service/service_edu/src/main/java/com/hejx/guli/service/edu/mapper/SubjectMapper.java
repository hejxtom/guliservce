package com.hejx.guli.service.edu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hejx.guli.service.edu.entity.Subject;
import com.hejx.guli.service.edu.entity.vo.SubjectVo;

import java.util.List;

/**
 * <p>
 * 课程科目 Mapper 接口
 * </p>
 *
 * @author hejx
 * @since 2020-09-26
 */
public interface SubjectMapper extends BaseMapper<Subject> {
    List<SubjectVo> selectNestedListByParentId(String parentId);
}
