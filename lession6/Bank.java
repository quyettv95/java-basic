package lession6;

import lession6.exceptions.HetTienException;

public class Bank {
  public static void main(String[] args) {
    String name = "Tran Van Quyet";
    String accountNum = "12345678923456";
    float balance = 100000;
    BankAccount account = new BankAccount(name, accountNum, balance);
    try {
      account.withDraw(99000);
      account.withDraw(1000);
      account.withDraw(1);
    } catch (HetTienException e) {
      System.out.println("Bạn đã hết tiền, bạn thiếu " + e.getAmount() + " tiền");
    }
  }
}
