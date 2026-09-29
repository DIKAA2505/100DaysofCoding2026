import java.util.Scanner;
 class main{
  public static void main(String[] args) {
  Scanner in = new Scanner (System.in);
  int a = in.nextInt();
  int b = in.nextInt();
  int c = in.nextInt();


    System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    
    System.out.println(" Sama dengan");
    System.out.println("a == b : " + (a == b));
    System.out.println("a == c : " + (a == c));

    System.out.println(" Tidak sama dengan");
    System.out.println("a != b : " + (a != b)); 
    System.out.println("a != c : " + (a != c));

    System.out.println(" Pakai variabel boolean");
    boolean sama = (a == b);
    boolean beda = (a != c);
    System.out.println("SAMA \t:"+sama);
    System.out.println("BEDA \t:"+beda);
  }
}
