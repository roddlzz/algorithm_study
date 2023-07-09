package chap01;

import java.util.Scanner;

public class Q10 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("자리수입력");
    String number = scan.next();

    int cnt = number.length();
    System.out.println("자리수:" + cnt);
  }
}
