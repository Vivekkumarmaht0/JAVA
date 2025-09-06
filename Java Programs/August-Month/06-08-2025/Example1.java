class BankAccount {
  String accountHolder; // default access
  long accountNumber;
  private double balance;
  // Setter --> Mutators
  public void setBalance(double balance) {
    if (balance >= 0)
      this.balance = balance;
    else
      System.out.println("Balance can't be set to negative");
  }
  // Getter --> Accessors
  public double getBalance() { 
    return balance;
  }
}
public class Example1 {
  public static void main(String[] args) {
    BankAccount account1 = new BankAccount();
    account1.setBalance(-1000);
    System.out.println(account1.getBalance());
  }
}
