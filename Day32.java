import java.util.Scanner;
class Day32 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Nilai: ");
    int nilai = input.nextInt();
    System.out.print("Kehadiran: ");
    int hadir = input.nextInt();

    boolean lulus = (nilai >= 70 && nilai <= 100) && (hadir >= 12);
    System.out.println("Lulus? " + lulus);

    input.close();
  }
}
