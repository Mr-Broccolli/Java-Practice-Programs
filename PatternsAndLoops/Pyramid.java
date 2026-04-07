package PatternsAndLoops;

public class Pyramid {
  public static void main() {
    int rows = 24;
    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("+");
      }
      System.out.println();
    }
  }
}
