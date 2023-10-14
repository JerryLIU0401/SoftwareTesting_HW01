package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
  @Test
  void edgesTest(){
    System.out.println("Testing...");
    assertAll("Triangle",
            () -> assertEquals("equilateral triangle", Triangle.getTriangle(2, 2, 2)),
            () -> assertEquals("isosceles triangle", Triangle.getTriangle(1, 3, 3)),
            () -> assertEquals("triangle", Triangle.getTriangle(2, 3, 4))
    );
  }
}