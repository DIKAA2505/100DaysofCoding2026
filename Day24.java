import java.util.Scanner ;
class bot {
public static void main(String []args){
Scanner in = new Scanner (System.in);
  System.out.println("Masukkan panjang");
  double panjang = in.nextDouble();
System.out.println("Masukkan lebar");
  double lebar = in.nextDouble();
double luas = panjang*lebar;
  System.out.println("===Hasil perhitungan===");
  System.out.println("Panjang taman\t:"+panjang+" m");
System.out.println("Lebar taman\t:"+lebar+" m");
System.out.println("Luas taman\t:"+luas+" m2");
}
}
