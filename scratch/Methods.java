/*
Exception in thread "main" java.lang.NullPointerException
	at Methods.third(Methods.java:16)
	at Methods.second(Methods.java:11)
	at Methods.first(Methods.java:7)
	at Methods.main(Methods.java:3)
 * */
public class Methods {
  public static void main(String... args) {
    first();
  }

  private static void first() {
    second();
  }

  private static void second() {
    third();
  }

  private static void third() {
    Object o = null;     // Oops
    o.toString();
  }
}
