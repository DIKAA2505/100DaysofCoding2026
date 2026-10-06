mport java.util.Scanner;

public class dika {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.printf("Masukkan bintang:");
    int a = in.nextInt();
    System.out.printf("Masukkan Umur\t:");
    int b = in.nextInt();

    if (a >= 100) {
      System.out.println("Mythic Imortal ");

      if (b >= 17) {
        System.out.println("Cukup Umur");
      } else {
        System.out.println("Masih bocil nda bisa");
      }

    } else {
      System.out.println("TIDAK DITERIMA");
    }
  }

}
