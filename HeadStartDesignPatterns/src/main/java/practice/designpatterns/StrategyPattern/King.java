package practice.designpatterns.StrategyPattern;

public class King extends Characters {
    public King(){
        weaponBehavior = new KnifeBehavior();
    }
}
