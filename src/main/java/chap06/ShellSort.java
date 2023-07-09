package chap06;

import java.util.Scanner;

public class ShellSort {

//  static void shellSort(int[] a, int n) {
//    for (int h = n / 2; h > 0; h = h / 2) {
//      for (int i = h; i < n; i++) {
//        int j;
//        int tmp = a[i];
//        for (j = i - h; j >= 0 && a[j] > tmp; j = j - h) {
//          a[j + h] = a[j];
//        }
//        a[j + h] = tmp;
//      }
//    }
//  }

  static void shellSort(int[] a, int n) {
    int h;
    for (h = 1; h < n; h = h * 3 + 1) {
      ;
    }
    for (; h > 0; h = h / 3) {
      for (int i = h; i < n; i++) {
        int j;
        int tmp = a[i];
        for (j = i - h; j >= 0 && a[j] > tmp; j = j - h) {
          a[j + h] = a[j];
        }
        a[j + h] = tmp;
      }
    }
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("셸정렬");
    System.out.print("요소수: ");
    int nx = stdIn.nextInt();
    int[] x = new int[nx];

    for (int i = 0; i < nx; i++) {
      System.out.print("x[" + i + "]: ");
      x[i] = stdIn.nextInt();
    }

    shellSort(x, nx);

    System.out.println("오름차순으로 정렬");
    for (int i = 0; i < nx; i++) {
      System.out.println("x[" + i + "]= " + x[i]);
    }
  }

}
