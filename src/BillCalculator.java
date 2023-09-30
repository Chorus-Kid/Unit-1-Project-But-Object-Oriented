import java.lang.Math;
public class BillCalculator {
    public double bill;
    public double tip;
    public int party;


    public BillCalculator(double actualBill, double actualTip, int actualParty) {
        bill = actualBill;
        tip = actualTip;
        party = actualParty;
    }

    public void everything() {
        double wheeeTip = tip * bill;
        double total = wheeeTip + bill;
        double tipPerPerson = wheeeTip / party;
        double billPerPerson = total / party;
        System.out.println("Now here comes the fun part!!");
        System.out.println("The total tip comes to $" + Math.round(wheeeTip * 100.0) / 100.0);
        System.out.println("That added to the bill will be $" + Math.round(total * 100.0) / 100.0);
        System.out.println("For the tips, everyone will have to pay $" + Math.round(tipPerPerson * 100.0) / 100.0);
        System.out.println("And for everything in total, everyone will have to pay $" + Math.round(billPerPerson * 100.0) /100.0);
        System.out.println("Just save yourself time and use google next time, ok?");
    }


}

