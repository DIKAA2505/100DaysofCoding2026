import java.util.Scanner;
class Day57 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan nilai N: ");
    int N = input.nextInt();
    
    System.out.println("Angka GANJIL 1-" + N + ":");
    for (int i = 1; i <= N; i++) {
      if (i % 2 != 0) {
        System.out.print(i + " ");
      }
    }
    
    System.out.println("\n\nAngka GENAP 1-" + N + ":");
    for (int i = 1; i <= N; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }
    
    input.close();
  }
}
