import java.util.Scanner;
class Day74 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan kalimat: ");
    String teks = input.nextLine();
    
    System.out.println("Panjang karakter: " + teks.length());
    System.out.println("Semua huruf besar: " + teks.toUpperCase());
    System.out.println("Semua huruf kecil: " + teks.toLowerCase());
    
    input.close();
  }
}
