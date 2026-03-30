package com.soulinku.demo2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.soulinku.demo2.dto.MainDto;

//https://marshmello.tistory.com/8
//https://needjarvis.tistory.com/771

@Mapper
public interface MainMapper {
    List<MainDto> selectMainAll();
}
