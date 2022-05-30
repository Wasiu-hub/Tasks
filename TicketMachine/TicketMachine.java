
/**
 * Write a description of class TicketMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicketMachine
{
    private int price;
    private int balance;
    private int total;
    private boolean testMode; // this added later

    public TicketMachine(int price){
        this.price = price;
        this.balance = 0;
        this.total = 0;
        testMode = true; // added later
    }
    public void printSampleTicket(){
        if(testMode == true){
            doPrint();
        }
    }
    
    // cohesive - only prints a ticket
    public void doPrint(){
        System.out.println("Purchase confirmed," + " Your ticket costs " + price + " pounds.");
        System.out.println("Your change is " + balance + " .");
    }

    public void printTicket(){
        // have we put in enough?
        // print the ticket and
        // update total and balance
        if(balance >= price){
            balance -= price;
            total += price;
            doPrint();
        } else {
            System.out.println("Please enter more money!");
        }

    }

    public void insertMoney(int amount){
        balance += amount;
    }

    // extra behaviour of getting back change
    public int getChange(){
        int change = balance;
        balance = 0;
        System.out.println("Your change is " + change + ".");
        return change;
    }

    public int getPrice(){
        // not sensible to do anything else here
        return price;
    }

    public int getBalance(){
        return balance;
    }

    public int getTotal(){
        return total;
    }
}
