package oop;

public class CDAccount extends BankAccount implements IRate{
    String InterestRates;
    void compound(){
        System.out.println("Compounding interest");
    }
}
