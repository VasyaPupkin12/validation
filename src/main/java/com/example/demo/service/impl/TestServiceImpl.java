package com.example.demo.service.impl;

import com.example.demo.service.TestService;
import com.example.demo.service.dto.TestInput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestServiceImpl implements TestService {

    @Override
    public void testMethod(TestInput testInput) {
        log.info("ALARM!!!");
    }
}
