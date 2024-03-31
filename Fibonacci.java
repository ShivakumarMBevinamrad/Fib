public class Fibonacci {
  public static void getFibo(double phi, int n) {
      for (int i = 0; i <= n; i++) {
         
          System.out.print(Math.round(Math.pow(phi, i) / Math.sqrt(5)) + ", ");
      }
  }

  public static void main(String[] args) {
      int n = 15;
      double phi = (1 + Math.sqrt(5)) / 2;
      getFibo(phi, n);
  }
}