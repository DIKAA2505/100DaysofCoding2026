import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();
        int K = input.nextInt();

        if (N < 1 || M < 1 || K < 1) {
            System.out.println("Input tidak valid");
            return;
        }

        int total = 0;
        String halte = "";

        for (int i = 1; i <= N; i++) {
            if (i % M != 0) {
                continue;
            }
            if (i % 7 == 0) {
                continue;
            }

            if (total > 0) {
                halte += " ";
            }
            halte += i;
            total++;

            if (total == K) {
                break;
            }
        }

        if (total == 0) {
            System.out.println("Halte : Tidak ada");
        } else {
            System.out.println("Halte : " + halte);
        }
        System.out.println("Total berhenti : " + total);
    }
}
