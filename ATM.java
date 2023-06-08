package ATMproject;

public class ATM {

   private double balance=10000.0;
   private double withdrawAmount;
   private double depositeAmount;
   private double transferAmount;
   
  

   public ATM()
   {

   }
    
   public double getBalance() 
   {
           
        return balance;
   }

   public void setBalance(double balance) 
   {
      this.balance = balance;
   }

   public double getWithdrawAmount() 
   {
      return withdrawAmount;
   }
   
   public void setWithdrawAmount(double withdrawAmount) 
   {
      this.withdrawAmount = withdrawAmount;
   }

   public double getDepositeAmount() 
   {
      return depositeAmount;
   }

   public void setDepositeAmount(double depositeAmount) 
   {
      this.depositeAmount = depositeAmount;
   }
   
   public double getTransferAmount() 
   {
      return transferAmount;
   }

   public void setTransferAmount(double transferAmount) {
      this.transferAmount = transferAmount;
   }


}
