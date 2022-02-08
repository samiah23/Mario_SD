package com.company;

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  Scanner first = new Scanner(System.in);

  System.out.print("Enter a number from 1 to 8: ");
  int num1 = first.nextInt();

  // String num1 = first.nextLine();

  for (int i = 1; i <= num1; i++) {
   System.out.println(".".repeat(num1) + "#".repeat(num1));



  }
 }
}