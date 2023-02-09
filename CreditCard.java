package Class22Task;

public class CreditCard {
    double balance;
    double interest;
    void printCredit(double balance,double interest){
        System.out.println("The interest rate for CteditCard is "+ (balance*interest)/100);
    }
}
class Visa extends CreditCard{

}
class VisaAx extends CreditCard{
    void printCredit(double balance, double inerest){
        System.out.println("The interest rate for CteditCard is "+ (balance*interest)/100);
    }
}

