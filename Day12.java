import java.util.Scanner; 

public class BiodataScanner {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 

    System.out.println("=== MASUKKAN BIODATA ANDA ===");
    
    System.out.print("Nama Lengkap: ");
    String nama = input.nextLine();

    System.out.print("Umur: ");
    int umur = input.nextInt();

    input.nextLine();

    System.out.print("Alamat: ");
    String alamat = input.nextLine();

    System.out.print("Berat Badan (kg): ");
    float berat = input.nextFloat();

    System.out.print("Jenis Kelamin (L/P): ");
    char jk = input.next().charAt(0);
    System.out.println("\n=== HASIL BIODATA ANDA ===");
    System.out.println("Nama      : " + nama);
    System.out.println("Umur      : " + umur + " tahun");
    System.out.println("Alamat    : " + alamat);
    System.out.println("Berat     : " + berat + " kg");
    System.out.println("Kelamin   : " + jk);
    
    input.close(); 
  }
}
