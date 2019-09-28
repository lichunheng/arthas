package com.demo.utils;

import com.alibaba.fastjson.JSON;
import com.demo.dto.ResultDto;

import java.util.HashMap;
import java.util.Map;

public class GetJsonStr {

    public static String getJson(){
        ResultDto resultDto = new ResultDto();
        resultDto.setCode(200);
        resultDto.setErrMessage("失败了");
        Map<String,Boolean> map = new HashMap<>();
        map.put("success", true);
        resultDto.setData(map);
        return JSON.toJSONString(resultDto);
    }
}
