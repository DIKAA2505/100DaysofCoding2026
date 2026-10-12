import java.util.Scanner;
class Day41 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan suhu ruangan (°C): ");
    int suhu = input.nextInt();

    if (suhu <= 18) {
      System.out.println("Suhu: DINGIN ");
    } else if (suhu <= 25) {
      System.out.println("Suhu: NYAMAN ");
    } else if (suhu <= 32) {
      System.out.println("Suhu: PANAS ");
    } else {
      System.out.println("Suhu: SANGAT PANAS ");
    }
    
    input.close();
  }
}
