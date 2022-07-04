public class Overflowing {
  public static void main(String... args) {
    run(0);
  }

  public static void run(int current) {
    run(current + 1);
  }
}
