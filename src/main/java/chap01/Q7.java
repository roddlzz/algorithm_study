package chap01;

import java.util.Scanner;

public class Q7 {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("1부터 n까지의 합을 구합니다.");
    System.out.print("n값: ");
    int n = stdIn.nextInt();

    int sum = (n + 1) * (n / 2);

    System.out.println(sum);
  }
}
