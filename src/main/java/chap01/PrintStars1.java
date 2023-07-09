package chap01;

import java.util.Scanner;

public class PrintStars1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, w;

    System.out.println("n값 : ");
    n = sc.nextInt();
    System.out.println("w값 : ");
    w = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.print("*");
      if (i % w == w - 1) {
        System.out.println();
      }
    }
    if (n % w != 0) {
      System.out.println();
    }
  }
}
