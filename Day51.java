import java.util.Scanner;
class Day51 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Mau ulang berapa kali? ");
    int jumlah = input.nextInt();
    
    for (int i = 1; i <= jumlah; i++) {
      System.out.println("Perulangan ke-" + i);
    }
    
    input.close();
  }
}
