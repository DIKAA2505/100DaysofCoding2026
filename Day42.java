import java.util.Scanner;
class dyk {
  public static void main(String [] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan gaji kotor:\t");
    double gk = in.nextDouble();
    double p = 0;
    
    if (gk >= 500000) {
      p = 0.10 * gk;
    }
    
    double gb = gk - p;
    System.out.println("Gaji kotor:\t" + gk);
    System.out.println("Pajak 10%:\t" + p);
    System.out.println("Gaji bersih:\t" + gb);
  }
}
