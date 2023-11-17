package practice.designpatterns.StrategyPattern;

public class KnifeBehavior implements WeaponBehavior {
    public void useWeapon(){
        System.out.println("Stabby stabby");
    }
}
