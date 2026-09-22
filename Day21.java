class Main {
  public static void main(String []args) {
    String b = "99";
    String s = "999";
    String i = "99999";
    String l = "99999999";
    String f = "9.9";
    String d = "99.99";
    String c = "C";
    String bo = "true";

    byte nb = Byte.parseByte(b);
    short ns = Short.parseShort(s);
    int ni = Integer.parseInt(i);
    long nl = Long.parseLong(l);
    float nf = Float.parseFloat(f);
    double nd = Double.parseDouble(d);
    char nc = c.charAt(0);
    boolean nbo = Boolean.parseBoolean(bo);

    System.out.println("Byte\t:" + nb);
    System.out.println("Short\t:" + ns);
    System.out.println("Integer\t:" + ni);
    System.out.println("Long\t:" + nl);
    System.out.println("Float\t:" + nf);
    System.out.println("Double\t:" + nd);
    System.out.println("Char\t:" + nc);
    System.out.println("Boolean\t:" + nbo);
  }
}
