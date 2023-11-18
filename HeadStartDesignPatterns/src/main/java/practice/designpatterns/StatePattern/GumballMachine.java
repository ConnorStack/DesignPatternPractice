package practice.designpatterns.StatePattern;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state;
    int count = 0;

    public GumballMachine(int numberOfGumballs){
        noQuarterState = new NoQuarterState(this);
    }

}
