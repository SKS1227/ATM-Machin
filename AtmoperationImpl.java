import java.util.HashMap;
import java.util.Map;

public class AtmoperationImpl implements Atmoperationinterf {
    ATM atm = new ATM();
    Map<Double,String> ministmt = new HashMap<>();


    @Override
    public void viewBalance(){
        System.out.println("Available balance is :"+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
            if(withdrawAmount%500==0) {
                if (withdrawAmount <= atm.getBalance()) {
                    ministmt.put(withdrawAmount, " Amount Withdrawn");
                    System.out.println("Collect the Cash " + withdrawAmount);
                    atm.setBalance(atm.getBalance() - withdrawAmount);
                    viewBalance();
                } else {
                    System.out.println("Insufficient Balance !!");
                }
            }
            else {
                System.out.println("Please enter the amount in multiples of 500");
            }

    }

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount," Amount Deposited");
        System.out.println(depositAmount+" Deposited Successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void viewminiStatement() {
        for(Map.Entry<Double,String> m:minifstmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }

    @Override
    public void exit(int i) {

    }

}
