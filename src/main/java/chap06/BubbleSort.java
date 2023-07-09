package chap06;

import java.util.Scanner;

public class BubbleSort {
  static void swap(int[] a, int idx1, int idx2) {
    int t = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = t;
  }

//  뒤에서 부터 버블정렬
//  static void bubbleSort(int[] a, int n) {
//    for (int i = 0; i < n - 1; i++) {
//      for (int j = n - 1; j > i; j--) {
//        if (a[j - 1] > a[j]) {
//          swqp(a, j - 1, j);
//        }
//      }
//    }
//  }

//  앞에서 부터 버블정렬
//  static void bubbleSort(int[] a, int n) {
//    for (int i = n - 1; i >  0; i--) {
//      for (int j = 0; j < i; j++) {
//        if (a[j] > a[j + 1]) {
//          swqp(a, j, j + 1);
//        }
//      }
//    }
//  }

//  정렬이 끝난 상태이면 멈춤
  static void bubbleSort(int[] a, int n) {
    for (int i = 0; i < n - 1; i++) {
      int exchg = 0;
      for (int j = n - 1; j > i; j--) {
        if (a[j - 1] > a[j]) {
          swap(a, j - 1, j);
          exchg++;
        }
        if (exchg == 0) break;
      }
    }
  }

//  static void bubbleSort(int[] a, int n) {
//    int k = 0;
//    while (k < n - 1) {
//      int last = n - 1;
//      for (int j = n - 1; j < k; j--) {
//        if (a[j - 1] > a[j]) {
//          swap(a, j - 1, j);
//          last = j;
//        }
//      }
//      k = last;
//    }
//  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("버블정렬");
    System.out.print("요소수: ");
    int nx = stdIn.nextInt();
    int[] x = new int[nx];

    for (int i = 0; i < nx; i++) {
      System.out.print("x[" + i + "]: ");
      x[i] = stdIn.nextInt();
    }

    bubbleSort(x, nx);

    System.out.println("오름차순으로 정렬");
    for (int i = 0; i < nx; i++) {
      System.out.println("x[" + i + "]= " + x[i]);
    }
  }

}
