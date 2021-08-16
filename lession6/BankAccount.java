package lession6;

import lession6.exceptions.HetTienException;

public class BankAccount {
  private String name;
  private String accountNumber;
  private float balance;
  BankAccount (String name, String accountNum, float balance)
  {
    this.name = name;
    this.accountNumber = accountNum;
    this.balance = balance;
  }
  public void withDraw(float amount) throws HetTienException
  {
    if (amount <= this.balance) {
      this.balance -= amount;
    } else {
      throw new HetTienException(amount - this.balance);
    }
  }

  public float getBalance()
  {
    return this.balance;
  }
}
