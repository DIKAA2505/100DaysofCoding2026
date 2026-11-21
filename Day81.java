import java.util.Scanner;
class Day81 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan jumlah elemen: ");
    int jumlah = input.nextInt();
    int[] angka = new int[jumlah];
    
    for (int i = 0; i < angka.length; i++) {
      System.out.print("Elemen ke-" + i + ": ");
      angka[i] = input.nextInt();
    }
    System.out.print("\nIsi array: ");
    for (int i = 0; i < angka.length; i++) {
      System.out.print(angka[i] + " ");
    }
    
    input.close();
  }
}
