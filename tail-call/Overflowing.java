public class Overflowing {
  public static void main(String... args) {
    overflow(0);
  }

  public static void overflow(int current) {
    overflow(current + 1);
  }
}
