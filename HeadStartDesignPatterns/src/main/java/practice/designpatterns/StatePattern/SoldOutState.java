package practice.designpatterns.StatePattern;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    
    public void insertQuarter() {
        System.out.println("Sold out");
    }

    public void ejectQuarter() {
        System.out.println("Sold out");
    }

    public void turnCrank() {
        System.out.println("Sold out");
    }

    public void dispense() {
        System.out.println("Sold out");
    }
}
