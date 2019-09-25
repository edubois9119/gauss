package edu.cnm.deepdive;

public class Gauss {

  public static void main(String[] args) {
    int sum = 0; //creating local variable for sum, declared and assigned 0 (delaration with initialization)
    for (int i = 1; i <= 100; i++) { //i is recognized as a counting variable
      sum += i; //sum = sum + 1
    }
    System.out.println(sum);
  }
}
