class Account {
  private long balance;

  public Account(long balance) {
    this.balance = balance;
  }

  public long getBalance() {
    return this.balance;
  }

  public void transfer(long transferAmount,
                       Account otherAccount) {
    if (balance >= transferAmount) {
      balance -= transferAmount;
      otherAccount.balance += transferAmount;
    }
  }
}
