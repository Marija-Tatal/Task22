package Class22Task;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard cr = new CreditCard();
        cr.printCredit(200000, 3.5);
        Visa vAx = new Visa();
        vAx.printCredit(300000, 1.5);
        VisaAx visaAx = new VisaAx();
        visaAx.printCredit(250000, 4.3);
    }
}
