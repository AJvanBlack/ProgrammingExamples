class incrementDecrement {
  public static void main(String[] args) {
    int sum = 1 + 1;
    ++sum;
    --sum;
  System.out.println(sum);
  }
}

class incrementDecrement1 {
  public static void main(String[] args) {
    int sum = 1 + 1;
  System.out.println(++sum);                    // Pre-fix: Increments var sum by 1. Output = 3 //
  }
}

class incrementDecrement2 {
  public static void main(String[] args) {
    int sum = 1 + 1;
  System.out.println(sum++);                    // Post-fix: Value of sum remains the same //
  }
}
