import java.util.Scanner;
class Day50 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan angka: ");
    int angka = input.nextInt();
    
    String hasil = (angka % 2 == 0) ? "GENAP" : "GANJIL";
    System.out.println(angka + " adalah " + hasil);
    
    input.close();
  }
}
