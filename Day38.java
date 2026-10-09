import java.util.Scanner;
class Day38 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("===== MENU =====");
    System.out.println("1. Lihat Profil");
    System.out.println("2. Edit Profil");
    System.out.println("3. Keluar");
    System.out.print("Pilih menu: ");
    int pilih = input.nextInt();

    if (pilih == 1) {
      System.out.println("Nama: Dika");
      System.out.println("Umur: 18");
    } else if (pilih == 2) {
      System.out.println("edit data...");
    } else if (pilih == 3) {
      System.out.println("Terima kasih! Sampai jumpa");
    } else {
      System.out.println("Pilihan tidak tersedia ");
    }
    
    input.close();
  }
}
