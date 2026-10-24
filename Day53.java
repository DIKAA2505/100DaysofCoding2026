import java.util.Scanner;
class Day53 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i = 1;
    
    System.out.print("Mau ulang berapa kali? ");
    int jumlah = input.nextInt();
    
    do {
      System.out.println("Perulangan ke-" + i);
      i++;
    } while (i <= jumlah);
  }
}
