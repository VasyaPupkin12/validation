package com.example.demo.service;

import com.example.demo.service.dto.TestInput;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;


@Validated
public interface TestService {

    void testMethod(@Valid TestInput testInput);

}
