import java.util.Scanner;

public class durianbonyoo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.print("Masukkan jumlah kotak durian: ");
        int jumlahKotak = input.nextInt();
        
        System.out.print("Masukkan jumlah durian per kotak: ");
        int durianPerKotak = input.nextInt();
        
        System.out.print("Masukkan jumlah tetangga: ");
        int jumlahTetangga = input.nextInt();
        
        int totaldurian = jumlahKotak * durianPerKotak;
        int perTetangga = totaldurian / jumlahTetangga;
    
        System.out.println("Total seluruh durian Pak Budi : " + totaldurian + " buah");
        System.out.println("Setiap tetangga mendapatkan : " + perTetangga + " buah");
        
        input.close();
    }
}
