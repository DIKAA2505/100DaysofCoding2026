import java.util.Scanner;
class Day52 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Mau ulang berapa kali? ");
    int jumlah = input.nextInt();
    
    int i = 1;
    while (i <= jumlah) {
      System.out.println("Perulangan ke-" + i);
      i++;
    }
    
    input.close();
  }
}
