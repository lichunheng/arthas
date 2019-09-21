package com.demo.service.impl;

import com.demo.domain.ElasticSearchEntity;
import com.demo.service.CityESService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CityESServiceImpl implements CityESService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CityESServiceImpl.class);

    @Override
    public void saveEntity(ElasticSearchEntity entity) {

    }

    @Override
    public void saveEntity(List<ElasticSearchEntity> entityList) {

    }

    @Override
    public List<ElasticSearchEntity> searchEntity(String searchContent) {
        return null;
    }
}
