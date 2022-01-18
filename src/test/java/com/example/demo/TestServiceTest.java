package com.example.demo;

import com.example.demo.service.TestService;
import com.example.demo.service.dto.TestInput;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolationException;

@SpringBootTest
class TestServiceTest {

    @Autowired
    TestService testService;

    @Test
    void testMethodTestOk() {
        TestInput input = TestInput.builder()
                .test("Danya mudak")
                .count(3L)
                .build();

        Assertions.assertDoesNotThrow(() -> testService.testMethod(input));
    }

    @Test
    void testMethodIncorrectCount() {
        TestInput input = TestInput.builder()
                .test("Danya mudak")
                .count(0L)
                .build();

        Assertions.assertThrows(ConstraintViolationException.class, () -> testService.testMethod(input));
    }


     @Test
    void testMethodIncorrectTestString() {
        TestInput input = TestInput.builder()
                .count(3L)
                .build();

        Assertions.assertThrows(ConstraintViolationException.class, () -> testService.testMethod(input));
    }

}
