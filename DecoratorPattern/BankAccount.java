package DecoratorPattern;

public interface BankAccount {

    String showAccountType();
    Double getInterestRate();
    Double getBalance();
    String showBenefits(); // Changed the type to String from Double since it needs to return string type according to the instruction.
    Double computeBalanceWithInterest();
    String showInfo();

}
