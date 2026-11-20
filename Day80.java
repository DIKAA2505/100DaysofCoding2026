import java.util.Scanner;
class Day80 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] angka = {10, 20, 30, 40, 50};
    
    System.out.println("Daftar indeks tersedia: 0 - " + (angka.length - 1));
    System.out.print("Masukkan nomor indeks: ");
    int indeks = input.nextInt();
    
    if (indeks >= 0 && indeks < angka.length) {
      System.out.println("Nilai di indeks " + indeks + " = " + angka[indeks]);
    } else {
      System.out.println("Indeks tidak valid!");
    }
    
    input.close();
  }
}
