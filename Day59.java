import java.util.Scanner;
class Day59 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan N\t\t:");
    int n = in.nextInt();
    System.out.print("Masukkan kelipatan M\t:");
    int m = in.nextInt();
    System.out.println("Bialngan kelipatan "+ m +" Sampai "+ n +":");
    for ( int i = 1 ; i <= n ; i++ ){
    if( i % m == 0){
        System.out.print(i+" ");
    }
    }
    in close;
  }
}
