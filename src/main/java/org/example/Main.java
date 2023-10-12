package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    try {
      System.out.println(Triangle.getTriangle(a, b, c));
    } catch (Triangle.TriangleException e) {
      throw new RuntimeException(e);
    }
  }
}