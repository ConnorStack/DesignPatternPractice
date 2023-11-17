package practice.designpatterns.StrategyPattern;

public class Queen extends Characters {
    public Queen(){
        weaponBehavior = new BowAndArrowBehavior();
    }
    
}
