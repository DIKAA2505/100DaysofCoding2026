import java.util.Scanner;
class day73besok{
  public static void main (String []args){
  Scanner in = new Scanner (System.in);
  int a;
  int hasil = 0; 
  System.out.println("(negatif untuk berhenti)");
  while ( true) {
  System.out.println("Angkaa :"); 
  a = in.nextInt();
  if( a<0 ) break;
  hasil += a;
 }
  System.out.println("Total jumlah = "+hasil); 
 in.close();
  }
}
