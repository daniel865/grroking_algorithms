package com.grooking.algorithms.chapter3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTest {

    @Test
    public void shouldReturnFactorial() {
        int n = 5;
        assertThat(Factorial.factorial(n)).isEqualTo(120);
    }

}
