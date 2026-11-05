import java.util.Scanner;
class Day65 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Berapa baris? ");
    int b = input.nextInt();
    
    for (int i = 1; i <= b; i++) {
      System.out.println("*");
    }
    
    input.close();
  }
}
