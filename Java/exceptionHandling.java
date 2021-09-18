class exceptionHandling {

    public static void main(String[] args) {
      try {
        int [] a = new int[2];
          System.out.println(a[5]);
      } catch (Exception A) {
          System.out.println("An error has occurred");
        }
    }
}
