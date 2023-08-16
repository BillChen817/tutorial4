package org.example;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition1() {
    assertEquals(4，c.add(2,2));
    }

    @Test
    void testAddition2() {
        assertEquals(4, c.add(2,2));
    }

}
