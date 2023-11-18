package practice.designpatterns.StatePattern;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state;
    int count = 0;

    public GumballMachine(int numberOfGumballs){
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.count = numberOfGumballs;
        if(numberOfGumballs > 0){
            state = noQuarterState;
        }else{
            state = soldOutState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    void setState(State state){
        this.state = state;
    }

    void releaseBall(){
        System.out.println("Releasing gumball");
        if(count > 0){
            count--;
        }
    }

    public State getHasQuarterState(){
        return this.hasQuarterState;
    }

    public State getNoQuarterState(){
        return this.noQuarterState;
    }

    public State getSoldState(){
        return this.soldState;
    }

    public State getSoldOutState(){
        return this.soldOutState;
    }

    
    public State getWinnerState(){
        return this.winnerState;
    }
    
    public int getCount(){
        return this.count;
    }
}
