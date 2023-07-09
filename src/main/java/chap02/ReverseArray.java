package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
  static void swap(int[] a, int idx1, int idx2) {
    int t = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = t;
  }

  static void reverse(int[] a) {
    for (int i = 0; i < a.length / 2; i++) {
      swap(a, i, a.length - i - 1);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("n: ");
    int n = sc.nextInt();
    int[] x = new int[n];

    for (int i =0; i<n; i++){
      System.out.print("x["+i+"]: ");
      x[i] =sc.nextInt();
    }

    reverse(x);

    System.out.println("x= "+ Arrays.toString(x));
  }

}
