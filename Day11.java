import java.util.Scanner;
public class susah{
public static void main(String [] args){
  Scanner input = new Scanner(System.in); // Scanner huruf besar S
  //1.BYTE
  System.out.println("masukkan angka Byte:");
  byte angkaByte = input.nextByte();
  //2.Short
  System.out.println("masukkan angka Short:");
  short angkaShort = input.nextShort();
  //3.Int 
  System.out.println("masukkan angka Int:");
  int angkaInt = input.nextInt();
  //4.Long
  System.out.println("masukkan angka Long:");
  long angkaLong = input.nextLong();
  //5.Float
  System.out.println("masukkan angka Float:");
  float angkaFloat = input.nextFloat();
  //6.Double
  System.out.println("masukkan angka double:");
  double angkaDouble = input.nextDouble();
  input.nextLine(); // Bersihkan sisa baris angka

  //7.Char
  System.out.println("masukkan satu huruf Char:"); // System yang benar
  char huruf = input.nextLine().charAt(0); // Baca baris lalu ambil huruf pertama

  //8.Boolean
  System.out.println("masukkan nilai true/false:");
  boolean logika = input.nextBoolean(); // Pakai nextBoolean()
  input.nextLine(); // Bersihkan sisa Enter

  //9.String
  System.out.println("masukkan kata String:");
  String kata = input.nextLine();

  //===== Tampilkan Hasil ======
  System.out.println("\n=== HASIL KEDUA ===");
  System.out.println("Byte.   :" + angkaByte);
  System.out.println("Short.  :" + angkaShort);
  System.out.println("Int.    :" + angkaInt);
  System.out.println("Long.   :" + angkaLong);
  System.out.println("Float.  :" + angkaFloat);
  System.out.println("Double. :" + angkaDouble);
  System.out.println("Char.   :" + huruf);
  System.out.println("Boolean :" + logika);
  System.out.println("String. :" + kata);
  
  input.close();
  }
}
