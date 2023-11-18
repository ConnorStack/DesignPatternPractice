package practice.designpatterns.StatePattern;

public class SoldState implements State {
	GumballMachine gumballMachine;

	public SoldState(){

	}

	public SoldState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("Hold yer horses, still getting gumball");
	}

	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}

	public void turnCrank() {	
		System.out.println("Turn away, but no more gumballs");
	}

	public void dispense() {

	}
}

