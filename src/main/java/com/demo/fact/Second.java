package com.demo.fact;

public class Second {
    public static void main(String[] args) {
        call();
    }
    public static String call(){
        First first = new First();
        String josn = first.getJosn();
        System.out.println(josn);
        return josn;
    }
}
