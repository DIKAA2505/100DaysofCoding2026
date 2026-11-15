import java.util.Scanner;
class Day75 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String kata1 = "BelajarJava";
    System.out.print("Masukkan kata: ");
    String kata2 = input.nextLine();
    
    System.out.println("Sama persis? " + kata1.equals(kata2));
    System.out.println("Sama (abaikan besar‑kecil)? " + kata1.equalsIgnoreCase(kata2));
    System.out.println("Ada kata 'Java' di dalamnya? " + kata1.contains("Java"));
    
    input.close();
  }
}
