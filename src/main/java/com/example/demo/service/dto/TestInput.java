package com.example.demo.service.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
public class TestInput {

    @Min(2)
    @Max(10)
    Long count;

    @NotNull
    String test;
}
