package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    private final Sample sample = new Sample();

    @Test
    void test_add() {
        int result = sample.op(Sample.Operation.ADD, 1, 1);
        Assertions.assertEquals(2, result);
    }

    @Test
    void test_fact() {
        int result = sample.fact(3);
        Assertions.assertEquals(6, result);
    }

    @Test
    void test_error_fact() {
        org.assertj.core.api.Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(-1)).withMessage("N should be positive");
    }

    @Test
    void test_multi() {
        int result = sample.op(Sample.Operation.MULT, 3, 4);
        Assertions.assertEquals(12, result);
    }
}
