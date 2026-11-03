import java.util.Scanner;
class Day63 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan angka (M): ");
    int M = input.nextInt();
    System.out.print("Masukkan pangkat (N): ");
    int N = input.nextInt();
    
    long hasil = 1;
    for (int i = 1; i <= N; i++) {
      hasil *= M;
    }
    
    System.out.print("Hasil: ");
    for (int i = 1; i <= N; i++) {
      if (i < N) System.out.print(M + " x ");
      else System.out.print(M + " = " + hasil);
    }
    
    input.close();
  }
}
