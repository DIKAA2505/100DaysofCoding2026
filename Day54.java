class Day55 {
  public static void main(String[] args) {
    
    System.out.println("=== 1. break ===");
    for (int i = 1; i <= 5; i++) {
      if (i == 3) break;
      System.out.println(i);
    }
    
    System.out.println("\n=== 2. continue ===");
    for (int i = 1; i <= 5; i++) {
      if (i == 3) continue;
      System.out.println(i);
    }
    
    System.out.println("\n=== 3. return ===");
    for (int i = 1; i <= 5; i++) {
      if (i == 3) return;
      System.out.println(i);
    }
    System.out.println("Baris ini tidak tampil");
  }
}
