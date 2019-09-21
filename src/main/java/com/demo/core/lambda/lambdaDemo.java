package com.demo.core.lambda;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public  class lambdaDemo {
    /*public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("a");
            }
        }).start();

        new Thread(() -> System.out.println("a")).start();

        // 参数声明
        sayHello((a,b) -> a+b);

        // 单行表达式
        sayHello((int a,int b) -> a + b);

        // 语句块：要加return
        sayHello((a,b) -> {
            return a + b;
        });

        // 静态方法引用
        sayHello(lambdaDemo::sum);

        // 非静态方法引用
        sayHello(new lambdaDemo()::sum1);

        // 参数对象引用
        sayHello(Integer::sum);

        System.out.println("===========================");
        Stream.of(getList()).forEach(System.out::println);

        System.out.println("=============");
        getMap().forEach((k,v) -> {
            System.out.println("Key: " + k + ", Value: " + v);
        });
    }*/

    public int sum1(int a,int b){
        return a + b;
    }

    public static int sum(int a,int b){
        return a + b;
    }

    public static List<Integer> getList(){
        return Arrays.asList(1,2,3,4,5,6,7);
    }

    public static interface MyInteface{
        int say(int a, int b);
    }

    public static void sayHello(MyInteface myInteface){
        myInteface.say(2,3);
    }

    public static Map<String, Integer> getMap(){
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        map.put("f",6);

        return map;
    }
}
