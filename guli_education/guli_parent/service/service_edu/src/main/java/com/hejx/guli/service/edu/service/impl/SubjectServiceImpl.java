package com.hejx.guli.service.edu.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hejx.guli.service.edu.entity.Subject;
import com.hejx.guli.service.edu.entity.excel.ExcelSubjectData;
import com.hejx.guli.service.edu.entity.vo.SubjectVo;
import com.hejx.guli.service.edu.listener.ExcelSubjectDataListener;
import com.hejx.guli.service.edu.mapper.SubjectMapper;
import com.hejx.guli.service.edu.service.SubjectService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 课程科目 服务实现类
 * </p>
 *
 * @author hejx
 * @since 2020-09-26
 */
@Service
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, Subject> implements SubjectService {
    /**
     * 批量导入
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void batchImport(InputStream inputStream) { //inputStream：文件流

        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(inputStream, ExcelSubjectData.class, new ExcelSubjectDataListener(baseMapper))
                .excelType(ExcelTypeEnum.XLS).sheet().doRead();

    }

    @Override
    public List<SubjectVo> nestedList() {
        return baseMapper.selectNestedListByParentId("0");
    }
}
