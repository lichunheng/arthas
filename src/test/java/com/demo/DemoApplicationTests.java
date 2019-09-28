package com.demo;

import com.alibaba.fastjson.JSON;
import com.demo.dto.ResultDto;
import com.demo.utils.GetJsonStr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		ResultDto resultDto = null;
        try {
            resultDto = JSON.parseObject(GetJsonStr.getJson(), ResultDto.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(resultDto.getCode());
        System.out.println(resultDto.getErrMessage());
        System.out.println(resultDto.getData().get("success"));
    }

}
