package com.demo.api;

import com.alibaba.fastjson.JSON;
import com.demo.common.ValidationResult;
import com.demo.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class JsonTest {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/index")
    @ResponseBody
    public String test() {
        String json = replacStr();
        return json;
    }

    public List<User> getString(){
        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setAddRess("深圳小房村");
        user1.setName("小芳");
        user1.setAge(23);
        user1.setEmai("1122232@QQ.COM");

        User user2 = new User();
        user2.setAddRess("深圳湾");
        user2.setName("小明");
        user2.setAge(30);
        user2.setEmai("jsjh@163.COM");

        list.add(user1);
        list.add(user2);

        return list;
    }

    public String replacStr(){
        List<User> list = getString();
        logger.info("thie list res: -> {}",JSON.toJSONString(list));

        for (User user : list) {
            if (user.getAge() < 30){
                user.setAge(99);
            }
        }

        String str = null;
        try {
            str = JSON.toJSONString(list);

        } catch (Exception e) {
            logger.error("object turn string is fail! ",e);
            return "对象转字符串异常";
        }
        return str;
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public String param(@RequestParam Integer start,
                        @RequestParam Integer end){
        if (StringUtils.isEmpty(start) || StringUtils.isEmpty(end)){
            return "the param id is null!";
        }
        logger.info("the requestParam start is [start={}],end is [end={}]",start,end);

        List<User> string = getString();

        return JSON.toJSONString(string);

    }

    @RequestMapping("/common")
    @ResponseBody
    public String string(){
        Map<String,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");

        String join = org.apache.commons.lang3.StringUtils.join(map.values().toArray(), ",");
        return join;
    }
}
