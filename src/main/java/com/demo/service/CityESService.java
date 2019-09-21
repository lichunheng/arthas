package com.demo.service;

import com.demo.domain.ElasticSearchEntity;

import java.util.List;

public interface CityESService {
    void saveEntity(ElasticSearchEntity entity);

    void saveEntity(List<ElasticSearchEntity> entityList);

    List<ElasticSearchEntity> searchEntity(String searchContent);
}
