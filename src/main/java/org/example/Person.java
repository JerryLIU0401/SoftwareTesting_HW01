package org.example;

public class Person {
  private String name;
  private int birthYear;
  private double weight;
  private double height;
  private int age;

  // 建構子
  public Person(String name, int birthYear) {
    this.name = name;
    this.birthYear = birthYear;
    this.age = 2023 - birthYear;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBirthYear() {
    return birthYear;
  }

  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public int getAge() {
    return age;
  }

  // 獲取BMI的方法
  double getBMI() {
    double w = getWeight();
    double h = getHeight();
    return w / (h/100 * h/100);
  }

  static class PersonException extends Exception {
    public PersonException(String title) {
      super(title);
    }
  }

  // 設定特定條件拋出特定例外的文字
  void testPersonData() throws PersonException {
    if (birthYear > 2023 ) {
      throw new PersonException("Birth year must less than 2023");
    }
    if (birthYear < 0 ) {
      throw new PersonException("Birth year must more than 0");
    }
    if (weight <= 0 || height <= 0) {
      throw new PersonException("Weight or Height must more than 0");
    }
    if (name.isEmpty()) {
      throw new PersonException("Name can not be empty");
    }
  }
}
