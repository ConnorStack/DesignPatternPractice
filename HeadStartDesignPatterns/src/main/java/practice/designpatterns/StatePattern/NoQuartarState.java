package practice.designpatterns.StatePattern;

public class NoQuartarState implements State {
    GumballMachine gumballMachine;

    public NoQuartarState(){

    }

    public NoQuartarState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println();
    }

    public void dispense() {
        System.out.println();
    }
}
