import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Atmoperationinterf op = new AtmoperationImpl();
        int Atmnumber = 12345;
        int Atmpin = 123;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome Atm Machine !!");
        System.out.println("Enter Atm Number");
        int atmnumber = in.nextInt();
        System.out.println("Enter Pin");
        int  pin = in.nextInt();
        if((Atmnumber==atmnumber)&&(Atmpin== pin)){
            while (true) {
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch = in.nextInt();
                if (ch == 1) {
                    op.viewBalance();
                }
                else if (ch ==2) {
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount=in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if (ch ==3) {
                    System.out.println("Enter Amount to deposit");
                    double depositAmount = in.nextDouble();  //5000
                    op.depositAmount(depositAmount);
                }
                else if (ch==4) {
                    op.viewminiStatement();
                }
                else if (ch==5) {
                    System.out.println("Collect Your ATM Card\n Thank You For using ATM Machine");
                    op.exit(0);
                }
                else  {
                    System.out.println("Please Enter correct choice");
                }
            }
        }
        else {System.out.println("Incorrect ATM pin or number");
        System.exit(0);
        }
    }
}
