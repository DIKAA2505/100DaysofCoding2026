import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan predikat (A/B/C/D/E): ");
        String amaaa = in.next();
        String predikat;
        
        switch (amaaa) {
            case "A":
                predikat = "Sangat baik (85-100)";
                break;
            case "B":
                predikat = "Baik (75-84)";
                break;
            case "C":
                predikat = "Cukup (65-74)";
                break;
            case "D":
                predikat = "Kurang (55-64)";
                break;
            case "E":
                predikat = "Mengulang (0-54)";
                break;
            default:
                predikat = "Predikat yang dimasukkan salah";
        }
        
        System.out.println("Predikat " + amaaa + " = " + predikat);
        in.close();
    }
}
