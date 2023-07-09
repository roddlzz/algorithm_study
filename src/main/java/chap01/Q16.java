package chap01;

import java.util.Scanner;

public class Q16 {

  static void npira(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(' ');
      }
      for (int k = 1; k <= (i - 1) * 2 + 1; k++) {
        System.out.print(i % 10);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("n: ");
    n = sc.nextInt();
    npira(n);
  }
}