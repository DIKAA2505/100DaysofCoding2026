import java.util.Scanner;
class Day39 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan angka 1: ");
    double a = input.nextDouble();
    System.out.print("Masukkan operator (+, -, *, /): ");
    char op = input.next().charAt(0);
    System.out.print("Masukkan angka 2: ");
    double b = input.nextDouble();
    double hasil = 0;
    if (op == '+') {
      hasil = a + b;
    } else if (op == '-') {
      hasil = a - b;
    } else if (op == '*') {
      hasil = a * b;
    } else if (op == '/') {
      hasil = a / b;
    } else {
      System.out.println("Salah operator ko");
    }
    System.out.println("Hasil: " + a + " " + op + " " + b + " = " + hasil);
  }
}
