package com.hejx.guli.service.vod.service;


import com.aliyuncs.exceptions.ClientException;

import java.io.InputStream;
import java.util.List;

/**
 * @Classname VideoService
 * @Description TODO
 * @Date 15:41 2021/2/21
 * @Created by hejx
 */

public interface VideoService {
    String uploadVideo(InputStream file, String originalFilename);

    void removeVideo(String videoId) throws ClientException;

    void removeVideoByIdList(List<String> videoIdList) throws ClientException;

    String getPlayAuth(String videoSourceId) throws ClientException;
}