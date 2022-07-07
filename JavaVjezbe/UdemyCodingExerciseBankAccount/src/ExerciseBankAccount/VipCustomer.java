package ExerciseBankAccount;

public class VipCustomer {

    private String name;
    private String emailAdress;
    private int creditLimit;

    public VipCustomer() {
        this.name = "default";
        this.emailAdress= "default";
        this.creditLimit = 0000;
    }

    public VipCustomer(String name,int creditLimit) {
        this.name = name;
        this.emailAdress= "default";
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, String emailAdress, int creditLimit){
        this.name = name;
        this.emailAdress = emailAdress;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
