package aKash;

public class BankAccount {
    public int ID;
    String name;
    double balance;

    public BankAccount(int acID, String acName, double acBalance)
    {
      ID = acID;
      name = acName;
      balance = acBalance;
    }



    public void deposit(double depositAmount)
    {
      balance = balance + depositAmount;
    }

    public void withdraw(double withdrawAmount)
    {
      balance = balance - withdrawAmount;
    }

      public void transfer_add(double transfer_add_Amount)
    {
      balance = balance + transfer_add_Amount;
    }

          public void transfer_sub(double transfer_sub_Amount)
    {
      balance = balance - transfer_sub_Amount;
    }
}
