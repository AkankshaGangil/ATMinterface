package ATMproject;

public class ATMopeImp implements ATMoperation
{
      ATM atm=new ATM();
    @Override
    public void viewBalance() {
        // TODO Auto-generated method stub
         System.out.println("Total Balance is "+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        // TODO Auto-generated method stub
        if(withdrawAmount<=atm.getBalance())
        {
            System.out.println("   Collect the cash " +withdrawAmount);
           atm.setBalance(atm.getBalance()-withdrawAmount);
           viewBalance();
        }
        else 
        {
            System.out.println("insufficient Balance..");
        }
    }

    @Override
    public void depositeAmount(double depositeAmount) {
        // TODO Auto-generated method stub
        System.out.println(depositeAmount+   "    Deposited Successfully....");
        atm.setBalance(atm.getBalance()+depositeAmount);
        viewBalance();
    }

   public void transferAmount(double transferAmount)
   {
      if(transferAmount<=atm.getBalance())
      {
        System.out.println(transferAmount+ " Transfered Successfuly");
      atm.setBalance(atm.getBalance() -transferAmount);
      viewBalance();
      }
      else 
      {
        System.out.println("insufficient balance..");
      }

   } 
    
    
}
