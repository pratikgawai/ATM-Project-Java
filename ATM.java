import java.util.Scanner;



public class ATM {

    private int Pin ;
    private double balance ;

    public int getPin() 
    {
        return Pin ;
    }

    public void setPin(int Pin) 
    {
        this.Pin = Pin ;

    }
    public double getBalance()
    {
        return balance ;
    }

    public void setBalance(double balance)
    {
        this.balance = balance ;

    }
    public void deposit (double bal)
    {
        balance = balance+bal ;
    }
     public void withdrawl(double bal) {
        balance = balance - bal;
    }

    public void CheckBalance()
    {
        System.out.println("Available Balance : " + getBalance());

    }
    public static void main (String[] ars )
    {
        ATM a = new ATM();
        a.setPin(1234);
        a.setBalance(0.00);
    
    Scanner sc = new Scanner(System.in) ;
    System.out.println("Enter the pin : ") ;

    if (sc.nextInt() == a.getPin()) 
    {
        System.out.println(" login Success....") ;

        for(;;) {
        System.out.println("Enter Your choice number choice : ");
        System.out.println("For Deposits Press 1    For withdrawl Press 2     For checkbalance Press 3    For Exit Press 4 ");

        switch (sc.nextInt()) {
            case 1 :
                System.out.println("Enter the amount for Deposit : ");
                a.deposit(sc.nextDouble());
                System.out.println("Deposit success....");
                break;


            case 2 :

                System.out.println("Enter the amount for withdrawl : ");
                double bal = (sc.nextDouble());

                if (bal> a.getBalance())
                {
                    System.out.println("Insufficient funds...");
                }
                else
                {
                    a.withdrawl(bal);
                    System.out.println("Withdrawl Success...");
                }
                break ;


            case 3 :


                a.CheckBalance();
                break ;

           
                

            case 4 :
                System.out.println("Logout...");
                System.exit(0);
                break ;

         default :
                System.out.println("Enter the valid choice.... ");
        }

        }
    }
    else {
        System.out.println("Inavlid Pin....");
    }

}

}

