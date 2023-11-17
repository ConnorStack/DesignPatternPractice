package practice.designpatterns.StrategyPattern;

public class AxeBehavior implements WeaponBehavior{
    public void useWeapon(){
        System.out.println("Chop chop");
    }
}
