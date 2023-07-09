package chap01;

public class Q8 {
  static int sumof(int a, int b) {
    int min;
    int max;

    if (a < b) {
      min = a;
      max = b;
    } else {
      min = b;
      max = a;
    }

    int sum = 0;
    for (int i = min; i <= max; i++) {
      sum = sum + i;
    }
    return sum;
  }
}
