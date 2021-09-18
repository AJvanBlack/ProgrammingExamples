class arrays {

  public static void main(String[] args) {
    String[] names = {"stringA", "stringB", "stringC", "stringD", "stringE"};
    int[] numbers = {1, 2, 3, 4, 5};
    char[] letters = {'A', 'B', 'C', 'D', 'E'};
    double[] floating = {1.1, 2.2, 3.3, 4.4, 5.5};
    int[] count = new int[42];
      System.out.println(names[1]);               /* Java always starts counting from zero */
      System.out.println(numbers[2]);
      System.out.println(letters[3]);
      System.out.println(floating[4]);
      System.out.println(count.length);
  }
}
