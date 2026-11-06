class PolaAlter {
    public static void main(String[] args) {
        int baris = 5;
        int kolom = 10;

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
