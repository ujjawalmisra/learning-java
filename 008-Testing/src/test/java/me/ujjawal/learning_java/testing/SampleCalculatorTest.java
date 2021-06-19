package me.ujjawal.learning_java.testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SampleCalculatorTest {

    private static final Logger LOGGER = LogManager.getLogger(SampleCalculatorTest.class);

    private UsingJUnit.SampleCalculator calculator;

    public SampleCalculatorTest() {
        super();
        calculator = new UsingJUnit.SampleCalculator();
    }

    @BeforeAll
    static void setup() {
        LOGGER.info("In setup");
    }

    @AfterAll
    static void teardown() {
        LOGGER.info("In teardown");
    }

    static Stream<Arguments> args_sum() {
        return Stream.of(
                arguments(1, 2, 3),
                arguments(4, 5, 9)
        );
    }

    static Stream<Arguments> args_sum_exceptions() {
        return Stream.of(
                arguments(null, 2),
                arguments(4, null)
        );
    }

    @BeforeEach
    void setupEach() {
        LOGGER.info("In setupEach");
    }

    @AfterEach
    void tearEach() {
        LOGGER.info("In teardownEach");
    }

    @ParameterizedTest
    @MethodSource("args_sum")
    void test_sum(Integer x, Integer y, Integer result) {
        try {
            assertEquals(result, calculator.sum(x, y));
        } catch (UsingJUnit.CalculatorException e) {
            fail(e);
        }
    }

    @ParameterizedTest
    @MethodSource("args_sum_exceptions")
    void test_sum_exceptions(Integer x, Integer y) {
        try {
            int s = calculator.sum(x, y);
            fail("Wasn't expecting a result");
        } catch (UsingJUnit.CalculatorException e) {
            //succeeded
        }
    }

}