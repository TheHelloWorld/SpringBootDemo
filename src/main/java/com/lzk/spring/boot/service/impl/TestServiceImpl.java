package com.lzk.spring.boot.service.impl;

import com.lzk.spring.boot.mapper.TestDao;
import com.lzk.spring.boot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;


    @Override
    public Integer countAll() {
        return testDao.countAll();
    }
}
