package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
  @Test
  void edgesTest(){
    System.out.println("Testing...");
    assertAll("Triangle",
            () -> assertEquals("正三角形", Triangle.getTriangle(2, 2, 2)),
            () -> assertEquals("等腰三角形", Triangle.getTriangle(1, 3, 3)),
            () -> assertEquals("三角形", Triangle.getTriangle(2, 3, 4))
    );
  }
}