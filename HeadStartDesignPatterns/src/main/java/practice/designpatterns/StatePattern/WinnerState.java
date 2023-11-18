package practice.designpatterns.StatePattern;

public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine){
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
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.releaseBall();
            System.out.println("Winner winner chicken dinner");
            if(gumballMachine.getCount() <= 0){
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }else{
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }
        }
    }
}
