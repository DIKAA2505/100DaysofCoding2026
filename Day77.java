import java.util.Scanner;
class Day77 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan kalimat: ");
    String kalimat = input.nextLine();
    
    String awal = kalimat.trim();
    String besar = awal.toUpperCase();
    int panjang = awal.length();
    boolean Java = awal.contains("Java");
    String potongan = awal.substring(0,4);
    
    System.out.println("Kalimat awal: " + awal);
    System.out.println("Huruf besar: " + besar);
    System.out.println("Panjang teks: " + panjang);
    System.out.println("Mengandung 'Java'? " + Java);
    System.out.println("4 karakter pertama: " + potongan);
    
    input.close();
  }
}
