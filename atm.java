


package oasisintern;
import java.util.Scanner;  


public class atm {
    public static void main(String args[] )  
    {  
        
        Scanner sc =new Scanner(System.in);

    int balance=10000,withdraw, deposit,transfer;
    
    System.out.println("ENTER YOUR CHOICE");
   
    System.out.println("1 for Withdraw");
    System.out.println("2 for Deposit ");
    System.out.println("3 for Transfer");
    System.out.println("4 to quit ");



    int choice=sc.nextInt();
    switch(choice)  
    {  case 1:
        System.out.println("enter the amount to be withdrawn");
        withdraw = sc.nextInt();  
        if(withdraw<balance){
         balance =balance-withdraw;
         System.out.println("Your amount was successfully withdrawn");
         System.out.print("current balance:"+balance);
        }
         else {
         System.out.println("INSUFFICIENT BALANCE");
         System.out.print("current balance:"+balance);
         }

         System.out.println("");  
         break; 
 


         case 2:
         System.out.println("Enter the amount to be deposited");

         deposit=sc.nextInt();
         System.out.println("Your Money has been successfully depsited");  
         balance=balance+deposit;
         System.out.print("current balance:"+balance);
         break;
         case 3:
         System.out.println("Enter the bank details to transfer ");

         System.out.println("Enter the name of the beneficiary ");

         String str= sc.nextLine();  

         System.out.println("and enter the name of the Bank ");
         String bank = sc.nextLine();
           
         System.out.println("Enter the amount to be transferred");
        transfer = sc.nextInt(); 
        if(transfer<balance){
         balance =balance-transfer;
         System.out.println("Transfer was succesfully done");
         System.out.print("current balance:"+balance);
        }
         else {
         System.out.println("INSUFFICIENT BALANCE");
         System.out.print("current balance:"+balance);
         }

         System.out.println("");  
         break; 
         case 4:  
        
        System.exit(0);  
        




    }
}
}
