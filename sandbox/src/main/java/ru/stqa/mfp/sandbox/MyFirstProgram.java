package ru.stqa.mfp.sandbox;

public class MyFirstProgram {

  public static void main (String[] args) {
    hello("World");
    hello("User");
    hello("Alexey");

    double l = 5;
    System.out.println("Площадь квадрата со стороной " + l + "=" + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Площадь теругольника со сторонами "+ a + " и " + b + " = " + area(a,b));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area (double len) {
    return len*len;
  }

  public static double area (double a, double b){
    return a * b;
  }
}
