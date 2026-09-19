public class main {
  public static void main(String[] args) {
    byte nilaibyte = 99;
    short nilaishort = nilaibyte;
    int nilaiint = nilaishort;
    long nilailong = nilaiint;
    float nilaifloat = nilailong;
    double nilaidouble = nilaifloat;
    char karakter = 'D'; 
    int kodekarakter = karakter;
    boolean status = true;
    System.out.println("×_×HASIL KONVERSI OTOMATIS×_×");
    System.out.println("Byte\t:"+nilaibyte);
    System.out.println("Short\t:"+nilaishort);
    System.out.println("Int\t:"+nilaiint);
    System.out.println("Long\t:"+nilailong);
    System.out.println("Float\t:"+nilaifloat);
    System.out.println("Double\t:"+nilaidouble);
    //konversi char ke int
    System.out.println("Sebelum\t:"+karakter);
    System.out.println("Sesudah\t:"+kodekarakter);
    //boolean hanya bernilai true dan false
    System.out.println("Boolean\t:"+status);
  }
}
