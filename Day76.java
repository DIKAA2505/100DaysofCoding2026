import java.util.Scanner;
class Day76 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan kalimat: ");
    String teks = input.nextLine();
    
    System.out.println("hapus 3 huruf: " + teks.substring(3));
    System.out.println("Ganti huruf a jadi o: " + teks.replace('a','o'));
    System.out.println("Hilangkan Spasi depan belakang: " + teks.trim());
    
    input.close();
  }
}
