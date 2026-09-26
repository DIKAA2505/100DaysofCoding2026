import java.util.Scanner;
class main {
  public static void main(String []args){
  Scanner in = new Scanner (System.in);
  System.out.println("Masukkan diameter");
  double diameter = in.nextDouble();
  final double PHI = 3.14;
  double jari = diameter/2;
  double Luas = PHI*jari*jari;
  System.out.println("×××hasil perhitungan+++");
  System.out.printf("Diameter\t:%.1f m%n",diameter);
  System.out.printf("Jari-jari\t:%.1f m%n",jari);
  System.out.printf("Luas \t:%.2f m2%n",Luas);
  }
}
