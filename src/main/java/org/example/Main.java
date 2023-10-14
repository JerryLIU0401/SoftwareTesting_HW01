package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Test triangle choose t, Person choose p"); // 輸入t進入Triangle, p進入Person
    String choice = scn.nextLine();
    if (choice.equals("t")) {
      // Triangle
      System.out.println("Triangle");
      int a = scn.nextInt();
      int b = scn.nextInt();
      int c = scn.nextInt();
      try {
        System.out.println(Triangle.getTriangle(a, b, c)); // 將結果做輸出，並測試有無錯誤
      } catch (Triangle.TriangleException e) {
        throw new RuntimeException(e); // 拋出自訂例外
      }
    } else if (choice.equals("p")) {
      // Person
      System.out.println("Person");
      System.out.print("name: ");
      String name = scn.nextLine();
      System.out.print("Birth year: ");
      int birthYear = scn.nextInt();
      Person person = new Person(name, birthYear);
      System.out.print("Weight (kg) : ");
      person.setWeight(scn.nextDouble());
      System.out.print("Height (cm) : ");
      person.setHeight(scn.nextDouble());
      try {
        person.testPersonData(); // 測試資料
      } catch (Person.PersonException e) {
        throw new RuntimeException(e); // 拋出自訂例外
      }
      System.out.print("Your BMI is " + person.getBMI()); // 輸出BMI
    }


  }
}