package com.demo.fact;

import com.alibaba.fastjson.JSON;
import com.demo.dto.ResultDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public  class First {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public String getJosn(){
        String str = "{'code':200,'data':{'incre':20},'errMessage':'失败'}";
        try {
            JSON.parseObject(str,ResultDto.class);
        } catch (Exception e) {
            logger.error("json to bean is err!, exp: ",e);
            return "失败了";
        }
        return "成功了";
    }
}
