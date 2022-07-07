package ExerciseBankAccount;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public int getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }


    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void depositMoney(int balance){
        this.balance += balance;
        System.out.println("Your new balance is: " + this.balance);
    }

    public void withDrawMoney(int balance){
        if(balance>this.balance){
            System.out.println("Insuficient funds");
        } else {
            this.balance -= balance;
            System.out.println("Your new balance is: " + this.balance);
        }
    }

}
