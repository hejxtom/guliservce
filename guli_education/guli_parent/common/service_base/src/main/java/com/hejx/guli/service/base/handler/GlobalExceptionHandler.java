package com.hejx.guli.service.base.handler;

import com.hejx.guli.common.base.result.R;
import com.hejx.guli.common.base.result.ResultCodeEnum;
import com.hejx.guli.common.base.util.ExceptionUtils;
import com.hejx.guli.service.base.exception.GuliException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname GlobalExceptionHandler
 * @Description TODO
 * @Date 2020/10/26 19:34
 * @Created by hejx
 *
 * 异常处理器
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    //所有异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e){
        //e.printStackTrace();
        //log.error(e.getMessage());
        log.error(ExceptionUtils.getMessage(e));
        return R.error();
    }

    //sql异常
    @ExceptionHandler(BadSqlGrammarException.class)
    @ResponseBody
    public R error(BadSqlGrammarException e){
        //e.printStackTrace();
        //log.error(e.getMessage());
        log.error(ExceptionUtils.getMessage(e));
        return R.setResult(ResultCodeEnum.BAD_SQL_GRAMMAR);
    }

    //http异常
    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    public R error(HttpMessageNotReadableException e){
       // e.printStackTrace();
//        log.error(e.getMessage());
        log.error(ExceptionUtils.getMessage(e));
        return R.setResult(ResultCodeEnum.JSON_PARSE_ERROR);
    }

    @ExceptionHandler(GuliException.class)
    @ResponseBody
    public R error(GuliException e){
        log.error(ExceptionUtils.getMessage(e));
        return R.error().message(e.getMessage()).code(e.getCode());
    }

}
