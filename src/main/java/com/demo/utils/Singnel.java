package com.demo.utils;

public class Singnel {
    private static Singnel singnel = new Singnel();

    private Singnel(){}

    private static Singnel getInstance(){
        return singnel;
    }

    private void show(){
        System.out.println("hello world!");
    }

    public static void main(String[] args) {
        Singnel singnel = Singnel.getInstance();
        singnel.show();
    }
}

