package com.project.service.Impl;

import com.project.mapper.TestMapper;
import com.project.model.Test;
import com.project.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by clin on 2017/9/3.
 */
@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestMapper testMapper;

    @Override
    public String getTest(){
        Test test = testMapper.getTest();
        String name = test.getName();
        return name;
    }
}
