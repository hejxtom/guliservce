package com.hejx.guli.service.edu.feign.fallback;

import com.hejx.guli.common.base.result.R;
import com.hejx.guli.service.edu.feign.OssFileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Classname OssFileServiceFallBack
 * @Description TODO
 * @Date 13:59 2021/2/2
 * @Created by hejx
 *
 * 容错回调类
 *
 */

@Service
@Slf4j
public class OssFileServiceFallBack implements OssFileService {

    @Override
    public R test() {
        return R.error();
    }

    @Override
    public R removeFile(String url) {
        log.info("熔断保护");
        return R.error();
    }
}
