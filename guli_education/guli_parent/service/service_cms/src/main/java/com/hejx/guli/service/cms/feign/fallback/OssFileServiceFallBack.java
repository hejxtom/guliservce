package com.hejx.guli.service.cms.feign.fallback;

import com.hejx.guli.common.base.result.R;
import com.hejx.guli.service.cms.feign.OssFileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Classname OssFileServiceFallBack
 * @Description TODO
 * @Date 15:37 2021/2/24
 * @Created by hejx
 */

@Service
@Slf4j
public class OssFileServiceFallBack implements OssFileService {

    @Override
    public R removeFile(String url) {
        log.info("熔断保护");
        return R.error().message("调用超时");
    }
}
