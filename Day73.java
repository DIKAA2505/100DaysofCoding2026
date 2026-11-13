import java.util.Scanner;
class Day73 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int pilihan;
    
    do {
      System.out.println("\n=== MENU ===");
      System.out.println("1. Tampilkan pesan");
      System.out.println("2. Keluar");
      System.out.print("Pilih menu: ");
      pilihan = input.nextInt();
      
      if (pilihan == 1) {
        System.out.println("Anda memilih menu 1!");
      } else if (pilihan == 2) {
        System.out.println("Program selesai.");
      } else {
        System.out.println("Pilihan tidak valid!");
      }
    } while (pilihan != 2);
    
    input.close();
  }
}
