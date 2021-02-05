package com.hejx.guli.service.oss.service;

import java.io.InputStream;

/**
 * @Classname FileService
 * @Description TODO
 * @Date 15:47 2021/1/30
 * @Created by hejx
 */

public interface FileService {

    /**
     * 文件上传至阿里云
     */
    String upload(InputStream inputStream, String module, String originalFilename);

    /**
     * 删除文件
     */
    void removeFile(String url);

}
