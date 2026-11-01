import java.util.Scanner;
class Day61 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan nilai N: ");
    int N = input.nextInt();
    
    long hasil = 1;
    for (int i = 1; i <= N; i++) {
      hasil *= i;
    }
    
    System.out.print("Hasil: ");
    for (int i = 1; i <= N; i++) {
      if (i < N) System.out.print(i + " × ");
      else System.out.print(i + " = " + hasil);
    }
    
    input.close();
  }
}
