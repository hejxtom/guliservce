package com.hejx.guli.service.edu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hejx.guli.service.edu.entity.Subject;
import com.hejx.guli.service.edu.entity.vo.SubjectVo;

import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 课程科目 服务类
 * </p>
 *
 * @author hejx
 * @since 2020-09-26
 */
public interface SubjectService extends IService<Subject> {

    /**
     * 批量导入
     */
    void batchImport(InputStream inputStream);

    /**
     * 树形结构
     */

    List<SubjectVo> nestedList();

}
