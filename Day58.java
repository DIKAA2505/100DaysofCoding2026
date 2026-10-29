import java.util.Scanner;
class main {
  public static void main (String []args){
  Scanner in = new Scanner (System.in);
  System.out.print("Masukkan angka :");
  int n = in.nextInt();
  System.out.println("Genap");
  for ( int i = n ; i >= 1 ; i--){
    if ( i % 2 == 0){
      System.out.print(i + " ");
    }
  }
  System.out.println("\nGanjil"); 
  for ( int i = n ; i >= 1 ; i--){
    if ( i % 2 != 0){
      System.out.print(i + " "); 
    }
  }
  }
}
