import java.util.Scanner;
class Day78 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("=== Buat akun molee ===");
    System.out.print("Buat nama: ");
    String nama = input.nextLine().trim();
    System.out.print("Buat sandi: ");
    String sandi = input.nextLine().trim();
    
    System.out.println("\n=== Login coba ===");
    boolean berhasil = false;
    
    while (!berhasil) {
      System.out.print("Masukkan username: ");
      String nMasuk = input.nextLine().trim();
      System.out.print("Masukkan password: ");
      String pMasuk = input.nextLine().trim();
      
      
      if (nMasuk.equals(nama) && pMasuk.equals(sandi)) {
        berhasil = true;
        System.out.println("Selamat datang! login berhasil ");
      } else {
        System.out.println("Username atau sandi salah, coba lagi!");
      }
    }
    
    input.close();
  }
}
