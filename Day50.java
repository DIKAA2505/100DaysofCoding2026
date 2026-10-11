import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int pilihan = in.nextInt();
        int jam = in.nextInt();
        int biaya;
        
        if (pilihan == 1) {
            if (jam == 1) {
                biaya = 5000;
            } else {
                biaya = 5000 + (jam - 1) * 3000;
            }
        } else {
            if (jam == 1) {
                biaya = 2000;
            } else {
                biaya = 2000 + (jam - 1) * 1000;
            }
        } System.out.println(biaya);
    }
}
