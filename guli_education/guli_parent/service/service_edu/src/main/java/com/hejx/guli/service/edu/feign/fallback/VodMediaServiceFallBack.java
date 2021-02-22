package com.hejx.guli.service.edu.feign.fallback;

import com.hejx.guli.common.base.result.R;
import com.hejx.guli.service.edu.feign.VodMediaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname VodMediaServiceFallBack
 * @Description TODO
 * @Date 10:27 2021/2/22
 * @Created by hejx
 */

@Service
@Slf4j
public class VodMediaServiceFallBack implements VodMediaService {
    @Override
    public R removeVideo(String vodId) {
        log.info("熔断保护");
        return R.error();
    }

    @Override
    public R removeVideoByIdList(List<String> videoIdList) {
        log.info("熔断保护");
        return R.error().message("调用超时");
    }
}
