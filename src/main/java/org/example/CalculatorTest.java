package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testAdd() {
        Assert.assertEquals(calculator.add(10, 20), 10);
    }
    @Test
    public void testSubtract() {
        Assert.assertEquals(calculator.subtract(10, 20), 10);
    }
}
