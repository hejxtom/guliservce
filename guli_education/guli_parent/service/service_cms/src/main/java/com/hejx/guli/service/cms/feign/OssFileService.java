package com.hejx.guli.service.cms.feign;

import com.hejx.guli.common.base.result.R;
import com.hejx.guli.service.cms.feign.fallback.OssFileServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Classname OssFileService
 * @Description TODO
 * @Date 15:37 2021/2/24
 * @Created by hejx
 */

@Service
@FeignClient(value = "service-oss", fallback = OssFileServiceFallBack.class)
public interface OssFileService {

    @DeleteMapping("/admin/oss/file/remove")
    R removeFile(@RequestBody String url);
}