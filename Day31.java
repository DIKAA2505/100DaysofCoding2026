public class Day31 {
  public static void main(String[] args) {
    int nilai = 80;
    int absen = 5;
    boolean lulus = (nilai >= 70) && (absen <= 10);
    System.out.println("AND: " + lulus);

    int umur = 16;
    boolean punyaKTP = true;
    boolean bolehMasuk = (umur >= 17) || punyaKTP;
    System.out.println("OR : " + bolehMasuk);

    boolean sudahMakan = false;
    boolean belumMakan = !sudahMakan;
    System.out.println("NOT: " + belumMakan);
  }
}
