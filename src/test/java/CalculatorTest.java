
import org.junit.jupiter.api.Test;
import sun.awt.X11.XInputMethod;
import sun.jvm.hotspot.utilities.Assert;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    void Add() {
//        Calculator calc = new Calculator();
       assertEquals (Calculator.Add(1,2),3);

    }
    @Test
    void multiply() {
       assertEquals (Calculator.multiply(2,2),4);
    }
}