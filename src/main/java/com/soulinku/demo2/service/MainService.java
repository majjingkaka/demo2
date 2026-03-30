package com.soulinku.demo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soulinku.demo2.dto.MainDto;
import com.soulinku.demo2.mapper.MainMapper;

@Service
public class MainService {
    //https://frozenpond.tistory.com/85
    
    @Autowired
    MainMapper mainMapper;

    public List<MainDto> selectMainAll(){
        return mainMapper.selectMainAll();
    }
}
