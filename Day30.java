import java.util.Scanner;
class main{
public static void main(String[]args){
Scanner in = new Scanner (System.in);
int a = in.nextInt();
int b = in.nextInt();
System.out.printf("Sama atau lebih \t:%d",(a>=b));
System.out.printf("Sama atau kurang\t:%d",(a<=b));
}
}
