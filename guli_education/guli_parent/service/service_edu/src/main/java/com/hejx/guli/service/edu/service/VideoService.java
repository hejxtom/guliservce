package com.hejx.guli.service.edu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hejx.guli.service.edu.entity.Video;

/**
 * <p>
 * 课程视频 服务类
 * </p>
 *
 * @author hejx
 * @since 2020-09-26
 */
public interface VideoService extends IService<Video> {
    void removeMediaVideoById(String id);
    void removeMediaVideoByChapterId(String chapterId);
    void removeMediaVideoByCourseId(String courseId);
}
