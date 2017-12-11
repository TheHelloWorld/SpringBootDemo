package com.lzk.spring.boot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestDao {

    Integer countAll();
}
