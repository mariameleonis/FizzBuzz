package org.example.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    @DisplayName("Divisible By Three")
    @Test
    @Order(1)
    void testForDivisibleByThree() {
        fail("fail");
    }
}
