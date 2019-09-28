package com.demo.dto;

import lombok.Data;

import java.util.Map;

@Data
public class ResultDto {
    private int code;
    private Map<String,Boolean> data;
    private String errMessage;
}
