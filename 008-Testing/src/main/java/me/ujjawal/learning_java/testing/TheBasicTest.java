package me.ujjawal.learning_java.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;

public class TheBasicTest {

    private static final Logger logger = Logger.getLogger(TheBasicTest.class.getName());

    public static void main(String[] args) {

        SampleCalculatorTest sampleCalculatorTest = new SampleCalculatorTest();
        sampleCalculatorTest.beforeTest();
        sampleCalculatorTest.loopThroughTestMethods();
        sampleCalculatorTest.afterTest();

    }

    @FunctionalInterface
    private static interface TestMethod {
        void test() throws Exception;
    }

    private static class SampleCalculator {
        Integer sum(Integer x, Integer y) throws CalculatorException {
            if (null == x) {
                throw new CalculatorException("x is invalid, shouldn't be null");
            }
            if (null == y) {
                throw new CalculatorException("y is invalid, shouldn't be null");
            }
            logger.info("x: " + x + ", y: " + y);
            Integer result = x + y;
            logger.info("result: " + result);
            return result;
        }

        Integer sub(Integer x, Integer y) throws CalculatorException {
            if (null == x) {
                throw new CalculatorException("x is invalid, shouldn't be null");
            }
            if (null == y) {
                throw new CalculatorException("y is invalid, shouldn't be null");
            }
            logger.info("x: " + x + ", y: " + y);
            Integer result = x - y;
            logger.info("result: " + result);
            return result;
        }
    }

    private static class CalculatorException extends Exception {
        CalculatorException(String message) {
            super(message);
        }
    }

    private static class SampleCalculatorTest {

        private static final Logger logger = Logger.getLogger(SampleCalculatorTest.class.getName());
        private SampleCalculator calculator;

        private Object[] currentTestDatum;
        private Integer x;
        private Integer y;
        private Integer resultOfSum;
        private Class<? extends Exception> exceptionClassOfSum;
        private Integer resultOfSub;
        private Class<? extends Exception> exceptionClassOfSub;

        void beforeTest() {
            calculator = new SampleCalculator();
            currentTestDatum = null;
        }

        void afterTest() {
            calculator = null;
            currentTestDatum = null;
        }

        void beforeTestCase() {
            x = (Integer) currentTestDatum[0];
            y = (Integer) currentTestDatum[1];
            resultOfSum = (Integer) currentTestDatum[2];
            exceptionClassOfSum = (Class<? extends Exception>) currentTestDatum[3];
            resultOfSub = (Integer) currentTestDatum[4];
            exceptionClassOfSub = (Class<? extends Exception>) currentTestDatum[5];
        }

        void afterTestCase() {
            x = null;
            y = null;
            resultOfSum = null;
            exceptionClassOfSum = null;
            resultOfSub = null;
            exceptionClassOfSub = null;
        }

        void loopThroughTestMethods() {
            Map<String, TestMethod> testMethods = getTestMethods();
            for (Map.Entry<String, TestMethod> entry : testMethods.entrySet()) {
                loopThroughTestCases(entry.getKey(), entry.getValue());
            }
        }

        void loopThroughTestCases(String testMethodName, TestMethod testMethod) {
            List<Object[]> testData = getTestData();
            for (int i = 0; i < testData.size(); i++) {
                Object[] testDatum = testData.get(i);
                currentTestDatum = testDatum;
                beforeTestCase();
                boolean passed = runTest(testMethod);
                if (passed) {
                    logger.info(String.format("TestMethod [%s] TestCase [%d] passed", testMethodName, i));
                } else {
                    logger.severe(String.format("TestMethod [%s] TestCase [%d] failed", testMethodName, i));
                }
                afterTestCase();
            }
        }

        List<Object[]> getTestData() {
            return new ArrayList<Object[]>() {{
                add(new Object[]{1, 2, 3, null, -1, null});
                add(new Object[]{1, 0, 1, null, 1, null});
                add(new Object[]{0, 4, 4, null, -4, null});
                add(new Object[]{2, null, null, CalculatorException.class, null, CalculatorException.class});
                add(new Object[]{null, 3, 4, null, null, CalculatorException.class});
            }};
        }

        Map<String, TestMethod> getTestMethods() {
            Map<String, TestMethod> testMethods = new TreeMap<>();
            testMethods.put("testSum", this::testSum);
            testMethods.put("testSub", this::testSub);
            return testMethods;
        }

        private boolean runTest(TestMethod testMethod) {
            boolean passed = true;
            try {
                testMethod.test();
                passed = true;
            } catch (Exception e) {
                passed = false;
            }
            return passed;
        }

        void testSum() throws Exception {
            try {
                int sum = calculator.sum(x, y);
                assertEquals(resultOfSum, sum);
            } catch (Exception e) {
                assertException(exceptionClassOfSum, e);
            }
        }

        void testSub() throws Exception {
            try {
                int sum = calculator.sub(x, y);
                assertEquals(resultOfSub, sum);
            } catch (Exception e) {
                assertException(exceptionClassOfSub, e);
            }
        }

        private <T> void assertEquals(T expected, T found) {
            if (expected != found) {
                throw new AssertionError("expected: " + expected + ", found: " + found);
            }
        }

        private void assertException(Class<? extends Exception> expectedExceptionClass, Exception e) {
            boolean passed = (null == expectedExceptionClass && null == e) ||
                    (null != expectedExceptionClass && null != e && expectedExceptionClass.isAssignableFrom(e.getClass()));
            if (!passed) {
                throw new AssertionException("exception expected: " + null + ", found: " + e.getClass().getName());
            }
        }
    }

    private static class AssertionException extends RuntimeException {
        public AssertionException(String message) {
            super(message);
        }
    }
}
