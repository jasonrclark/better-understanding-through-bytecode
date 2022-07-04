import java.util.List;

public class Main {
  public static void main(String... args) throws InterruptedException {
    var account = new Account(10000);
    var otherAccount = new Account(0);

    Runnable transferRunnable = () -> {
      while (account.getBalance() > 0) {
        account.transfer(1, otherAccount);
      }
    };

    var threads = List.of(
      new Thread(transferRunnable),
      new Thread(transferRunnable)
    );

    threads.forEach(Thread::start);
    for (Thread thread : threads) {
      thread.join();
    }

    System.out.println(String.format("account: %d", account.getBalance()));
    System.out.println(String.format("otherAccount: %d", otherAccount.getBalance()));
  }
}
