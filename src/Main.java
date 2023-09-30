import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("We got a new and improved bill calculator here!");
        System.out.println("Like the other one, I need you to type in your bill amount (without the $): ");
        String bill = s.nextLine();
        double actualBill = Double.parseDouble(bill);
        System.out.println("Ok, now put in your tip amount (as a decimal this time!): ");
        String tip = s.nextLine();
        double actualTip = Double.parseDouble(tip);
        System.out.println("Party time! (type in the amount of people in your party): ");
        String party = s.nextLine();
        int actualParty = Integer.parseInt(party);
        BillCalculator calculator = new BillCalculator(actualBill, actualTip, actualParty);
        calculator.everything();


}
}