package com.project.mapper;

import com.project.model.Test;

public interface TestMapper {
    int insert(Test record);

    int insertSelective(Test record);

    Test getTest();
}