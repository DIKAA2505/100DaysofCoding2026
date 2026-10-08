import java.util.Scanner;
class Day37 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan angka: ");
    int angka = input.nextInt();

    if (angka > 0) {
      System.out.println(angka + " POSITIF");
    } else if (angka < 0) {
      System.out.println(angka + " NEGATIF");
    } else {
      System.out.println("Angka NOL");
    }
    
    input.close();
  }
}
