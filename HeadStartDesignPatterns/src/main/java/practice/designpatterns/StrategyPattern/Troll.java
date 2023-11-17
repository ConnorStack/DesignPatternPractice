package practice.designpatterns.StrategyPattern;

public class Troll extends Characters{
    public Troll(){
        weaponBehavior = new AxeBehavior();
    }
    
}
