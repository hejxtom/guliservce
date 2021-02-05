package com.hejx.guli.service.edu.feign;

import com.hejx.guli.common.base.result.R;
import com.hejx.guli.service.edu.feign.fallback.OssFileServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Classname OssFileService
 * @Description TODO
 * @Date 14:16 2021/2/1
 * @Created by hejx
 */

@Service
@FeignClient(value = "service-oss", fallback = OssFileServiceFallBack.class)
public interface OssFileService {
     /**
      * 删除文件
      *
      */
    @DeleteMapping("/admin/oss/file/remove")
    R removeFile(@RequestBody String url);


    @GetMapping("/admin/oss/file/test")
    R test();

}
