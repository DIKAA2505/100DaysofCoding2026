import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== MENU MAKAN ===");
        System.out.println("1. NASGOR");
        System.out.println("2. NASKUN");
        System.out.println("3. BECKSAW");
        System.out.println("4. KAYU");
        
        System.out.print("Masukkan pilihan menu : ");
        int menu = in.nextInt();

        System.out.println();
        switch (menu) {
            case 1:
                System.out.println("Anda memilih NASGOR");
                break;

            case 2:
                System.out.println("Anda memilih NASKUN");
                break;

            case 3:
                System.out.println("Anda memilih BECKSAW");
                break;

            case 4:
                System.out.println("Anda memilih KAYU");
                break;

            default:
                System.out.println("Pilihan Tidak Tersedia");

        }

    }
}
