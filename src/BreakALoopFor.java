public class MyClass {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        break;//instead of continue the for loop, it will break if find the result.
      }
      System.out.println(i);
    }  
  }
}

