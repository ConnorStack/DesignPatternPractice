package practice.designpatterns.StatePattern;

public class HasQuarterState implements State {
    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Returning quarter");
    }

    public void turnCrank() {
        System.out.println("Quarter accepted");
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

}

