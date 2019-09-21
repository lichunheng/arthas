package com.demo.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class ElasticSearchEntity implements Serializable {
    private static final long serialVersionUID = -763638353551774166L;

    public static final String INDEX_NAME = "index_entity";

    public static final String TYPE = "tstype";

    private Long id;

    private String name;

}
