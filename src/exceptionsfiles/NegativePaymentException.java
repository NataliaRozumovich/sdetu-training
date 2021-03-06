package exceptionsfiles;

public class NegativePaymentException extends Exception {
    //Define class
    double payment;

    //1. Constructor that takes the value that would throw exception
    //2.Assign value of local variable class variable
    public NegativePaymentException(double payment) {
        this.payment = payment;
    }

    //3. Override the toString() method to include the specific exception message
    public String toString() {
        return "Error:Cannot take negative payment " + payment;
    }
}
