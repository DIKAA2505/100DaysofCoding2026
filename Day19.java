class Pemaksaan {
    public static void main(String[] args) {
        double nilaiDouble = 9.99;
        float nilaiFloat = 999.9F;
        long nilaiLong = 9999999L;
        int nilaiInt = 99999;
        short nilaiShort = 999;
        System.out.println("Double : " +nilaiDouble);
        float drDouble = (float) nilaiDouble;
        System.out.println( "float : " + drDouble);
        long drFloat = (long) nilaiFloat;
        System.out.println("  long  : " + drFloat);
        int drLong = (int) nilaiLong;
        System.out.println( " int   : " + drLong);
        short drInt = (short) nilaiInt;
        System.out.println("  short : " + drInt);
        byte drShort = (byte) nilaiShort;
        System.out.println(" byte  : " + drShort);
        int kodeHuruf = 99;
        char drIntKeChar = (char) kodeHuruf;
        System.out.println( "  char  : '" + drIntKeChar + "'");
        boolean ok = true;
        System.out.println("\nboolean: " + ok + " tidak bisa di konversii ya apa paoo");
    }
}
 
