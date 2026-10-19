import java.util.Scanner;
class Day48 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Angka pertama: ");
    double a = input.nextDouble();
    
    System.out.print("Operator (+, -, *, /): ");
    char op = input.next().charAt(0);
    
    System.out.print("Angka kedua: ");
    double b = input.nextDouble();
    
    double hasil;
    
    switch (op) {
      case '+':
        hasil = a + b;
        System.out.println("Hasil: " + hasil);
        break;
      case '-':
        hasil = a - b;
        System.out.println("Hasil: " + hasil);
        break;
      case '*':
        hasil = a * b;
        System.out.println("Hasil: " + hasil);
        break;
      case '/':
        if (b != 0) {
          hasil = a / b;
          System.out.println("Hasil: " + hasil);
        } else {
          System.out.println("Error: Pembagi tidak boleh nol!");
        }
        break;
      default:
        System.out.println("Operator tidak valid!");
    }
    
    input.close();
  }
}
