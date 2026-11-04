import java.util.Scanner;
class Day64 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan nilai n: ");
    int n = input.nextInt();
    
    long faktorial = 1;
    System.out.print(n + "! = ");
    
    for (int i = 1; i <= n; i++) {
      faktorial *= i;
      if (i < n) System.out.print(i + " × ");
      else System.out.print(i + " = " + faktorial);
    }
    
    input.close();
  }
}
