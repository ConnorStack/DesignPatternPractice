package practice.designpatterns.StrategyPattern;

public class Knight extends Characters{
    public Knight(){
        weaponBehavior = new SwordBehavior();
    }
}
