import java.util.Scanner;
class main{
  public static void main(String []args){
  Scanner in = new Scanner (System.in);
  System.out.println("Masukkan bintang rank mythic: ");
  int a = in.nextInt();
  if (a >= 100){
    System.out.println("Mythic Imortal");
  }else if ( a >= 50 ){
    System.out.println("Mythic Glory");
  }else if ( a >= 25 ){
    System.out.println("Mythic Honor");
  }else{
    System.out.println("Mythic pokee");
  }
  }
}
