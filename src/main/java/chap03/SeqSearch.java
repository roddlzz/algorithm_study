package chap03;

import java.util.Scanner;

public class SeqSearch {
  static int seqSerarch(int[] a, int n, int key) {
    for (int i = 0; i < n; i++) {
      if (a[i] == key) {
        return i;
      }
    }
    return -1;

//    int i = 0;
//    while (true) {
//      if (i == n) {
//        return -1;
//      }
//      if (a[i] == key) {
//        return i;
//      }
//      i++;
//    }

  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("요솟수: ");
    int num = stdIn.nextInt();
    int[] x = new int[num];

    for (int i = 0; i < num; i++) {
      System.out.println("x[" + i + "]: ");
      x[i] = stdIn.nextInt();
    }

    System.out.println("검색할 값: ");
    int key = stdIn.nextInt();

    int idx = seqSerarch(x, num, key);

    if (idx == -1) {
      System.out.println("그 값의 요소가 없다");
    } else {
      System.out.println("그 값의 요소: " + idx);
    }
  }
}
