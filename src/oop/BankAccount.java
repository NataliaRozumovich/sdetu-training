package oop;

public class BankAccount implements IRate {

    //Defines variables
    String accountNumber;

    //static >> belongs to the CLASS not the object instance
    //final >> constants (often static Final)
    private static final String routingNumber = "12365";

    //Instance variables
    private String name;
    private String ssn;
    String accountType;
    double balance;


    //Constructor definitions: unique methods:
    // 1. They are used to define / setup / initialize properties of an object
    // 2. Constructors are IMPLICITLY called upon instantiation
    // 3. The same name as the class itself
    // 4. Constructors have NO return type

    BankAccount() {
        System.out.println("NEW ACCOUNT CREATED");
    }

    //Overloading: call method name with the different arguments

    BankAccount(String accountType) {
        System.out.println("NEW ACCOUNT " + accountType);

    }

    BankAccount(String accountType, double initDeposit) {
        //initDeposit, accountType, Msg ae local variables
        System.out.println("NEW ACCOUNT " + accountType);
        System.out.println("INITIAL Deposit of: $ " + initDeposit);
        String Msg = null;
        if (initDeposit < 100) {
            Msg = "ERROR: Minimum deposit must be at least $1,000";
        } else {
            Msg = "Thanks for your initial deposit of: $ " + initDeposit;
        }
        System.out.println(Msg);
        balance = initDeposit;
    }
    // Getters / Setters

    //Allow the users to define the name
    public void setName (String name){
        this.name = "Mr. " + name;
    }
    public String getName(){
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    //Interface methods
    public void setRate(){
        System.out.println("SETTING RATE");
    }
    public void increaseRate() {
        System.out.println("INCREASING RATE");
    }

    //Define methods
    public void deposit(double amount) {
        balance = balance + amount;
        showActivity("DEPOSIT");
    }

    void withdraw(double amount) {
        balance = balance + amount;
        showActivity("WITHDRAW");
    }

    //Private: can only be called from within the class
    private void showActivity(String activity) {
        System.out.println("YOUR RECENT TRANSACTION: " + activity);
        System.out.println("YOUR NEW BALANCE: $" + balance);
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    void getStatus() {

    }

    @Override
    public String toString() {
        return "[NAME " + name + ", ACCOUNT # " + accountNumber + ", ROUTING #" + routingNumber + ", BALANCE: $" + balance + "]";
    }
}
