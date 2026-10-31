import java.util.Scanner;
class Day59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan N\t\t: ");
        int n = in.nextInt();
        int b = 0;
        
        for (int i = 1; i <= n; i++) {
            b += i;
            if (i < n) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = " + b);
            }
        }
        
        in.close();
    }
}

