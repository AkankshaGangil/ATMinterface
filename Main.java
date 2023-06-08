package ATMproject;

import java.util.Scanner;


public class Main {
          

public static void main(String[] args) {
       
        
        ATMopeImp op=new ATMopeImp(); 

        int atmnumber=1234;
        int atmpin=123;

         System.out.println("           Welcome to SBI ATM");
         System.out.println("*****************************************");
        
         Scanner scan=new Scanner(System.in);
         System.out.print("Enter ATM number: ");
         int atmNumber=scan.nextInt();
         System.out.print("Enter ATM pin: ");
         int pin=scan.nextInt();
        
         if((atmnumber==atmNumber) && (pin==atmpin))
         {  
          
          System.out.println("Enter any number between 10 to 99 Ex.25  ");
          int num=scan.nextInt();
          if ((num>=10) && (num<=99))
          {

            while(true)
            {
            
            System.out.println("1. Check Balance \n2. Withdraw amount \n3. Deposite Amount \n4. Transfer Amount \n5. Quit");
            System.out.print("Enter your valid choice....");
            
            int ch=scan.nextInt();
            
              
               if (ch==1)
               {    
                    op.viewBalance();
                    System.out.println(" ");
               }
               
               else if (ch==2)
               {    
                    System.out.print("Enter Amount to Withdraw : ");
                    double withdrawAmount=scan.nextDouble();
                     op.withdrawAmount(withdrawAmount);
                     System.out.println(" ");
                    
               }
               else if(ch==3)
               {    System.out.println("you can Deposite 1,00,000 Rs at one time..");
                    System.out.print("Enter Amount to Deposite : ");
                    double depositeAmount=scan.nextDouble();
                    op.depositeAmount(depositeAmount);
                    System.out.println(" ");
                    
               }
               else if(ch==4)
               {    System.out.print("Enter Account Number: ");
                    int AN=scan.nextInt();
                    System.out.print("Enter Amount:-");
                    double transferAmount=scan.nextInt();
                    op.transferAmount(transferAmount);
                    System.out.println(" ");
               }
               else if (ch==5)
               {
                    System.out.println("Thankyou for Visiting..... \nplease collect your card......");
                    break;
               }
               else 
               {
                     System.out.println("Please select a valid choice..");
               }
            }
           
         }
         else
         {
          System.out.println("please Enter a valid number...");
         }   
        }
     
  
         else 
         {
            System.out.println("Invalid ATMnumber or pin");
         }

    
   }
}