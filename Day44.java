import java.util.Scanner;
class dayyy444{
  public static void main(String []args){
  Scanner in = new Scanner (System.in);
  System.out.print("Masukkan Nilai\t:");
  int a = in.nextInt();
  if (a >= 85){
    System.out.println("Predikat : (A)");
  } else if (a >= 75 ){
    System.out.println("Predikat : (B)"); 
  } else if (a >= 65 ){
    System.out.println("Predikat : (C)");
  } else if (a >= 55 ) {
    System.out.println("Predikat : (D)");
  } else {
    System.out.println("Predikat : (Error)"); 
  }
  }
}
