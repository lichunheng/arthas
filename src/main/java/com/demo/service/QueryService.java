package com.demo.service;

import com.demo.Model.Es;

import java.util.List;
import java.util.Map;

public interface QueryService {
    List<Map<String, Object>> queryListFromES(Es es, int storeId, String storeName, String startDate, String endDate);
}
