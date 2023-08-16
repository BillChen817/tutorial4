package org.example;

public class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
    assertEquals(4，c.add(2,2));
    }

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }

}
