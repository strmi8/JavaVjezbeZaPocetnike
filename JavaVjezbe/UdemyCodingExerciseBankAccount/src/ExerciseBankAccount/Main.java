package ExerciseBankAccount;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BankAccount user1 = new BankAccount();
        VipCustomer user2 = new VipCustomer("Stjepan", 3000);
        VipCustomer user3 = new VipCustomer("Strmi" , "stjepan.strmecki01@gmail.com",100);
        VipCustomer user4 = new VipCustomer();




        System.out.println("Set account number: ");
        user1.setAccountNumber(scan.nextInt());
        System.out.println("Set account balance: ");
        user1.setBalance(scan.nextInt());
        scan.nextLine();
        System.out.println("Set account customer name: ");
        user1.setCustomerName(scan.nextLine());
        System.out.println("Set account phone number: ");
        user1.setPhoneNumber(scan.nextLine());
        System.out.println("Set account email: ");
        user1.setEmail(scan.nextLine());

        System.out.println("Account number: " + user1.getAccountNumber() + " \nwith: " + user1.getBalance() + " $ \nIs owned by: "
                            + user1.getCustomerName() + " \nHis phonen number is: " + user1.getPhoneNumber() + "\nHis email is: " + user1.getEmail());

        System.out.println("How much money do you wish to deposit into your account ?: ");
        user1.depositMoney(scan.nextInt());
        System.out.println("How much money do you wish to withdraw from your account ?:");
        user1.withDrawMoney(scan.nextInt());

        System.out.println(user2.getName() + " " + user2.getEmailAdress() + " "+user2.getCreditLimit());
        System.out.println(user3.getName() + " " + user3.getEmailAdress() + " " + user3.getCreditLimit());
        System.out.println(user4.getName() + " " + user4.getEmailAdress() + " " + user4.getCreditLimit());



    }
}
