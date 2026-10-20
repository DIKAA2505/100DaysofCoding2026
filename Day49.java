import java.util.Scanner;
class Day49 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan angka: ");
    int angka = input.nextInt();
    
    String hasil = (angka % 2 == 0) ? "GENAP" : "GANJIL";
    System.out.println(angka + " adalah " + hasil);
    
    System.out.print("\nMasukkan umur: ");
    int umur = input.nextInt();
    
    String status = (umur >= 17) ? "Dewasa" : "Belum cukup umur";
    System.out.println("Status: " + status);
    
    input.close();
  }
}
