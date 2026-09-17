import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah Kue Dika: ");
        int jumlah = input.nextInt();

        int sisa = jumlah % 3;

        System.out.println("Sisa Kue dika: " + sisa);

        input.close();
    }
}
