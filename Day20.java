class main {
  public static void main(String []args) {
  byte b = 99;
  short s = 999;
  int i = 99999;
  long l = 99999999;
  float f = 9.9f;
  double d = 99.99;
  char c = 'C';
  boolean bo = true;
  String sbyte = String.valueOf(b);
  String sshort = String.valueOf(s);
  String sint = String.valueOf(i);
  String slong = String.valueOf(l);
  String sfloat = String.valueOf(f);
  String sdouble = String.valueOf(d); 
  String schar = String.valueOf(c);
  String sboolean = String.valueOf(bo);
  System.out.println("Byte\t:"+sbyte);
  System.out.println("Short\t:"+sshort);
  System.out.println("Integer\t:"+sint);
  System.out.println("Long\t:"+slong);
  System.out.println("Float\t:"+sfloat);
  System.out.println("Double\t:"+sdouble);
  System.out.println("Char\t:"+schar);
  System.out.println("Boolean:"+sboolean);
  }
}
