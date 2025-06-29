package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    // Setup - runs before each test
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup complete");
    }

    // Teardown - runs after each test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown complete");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testMultiplication() {
        // Arrange
        int a = 5;
        int b = 6;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(30, result);
    }
}
