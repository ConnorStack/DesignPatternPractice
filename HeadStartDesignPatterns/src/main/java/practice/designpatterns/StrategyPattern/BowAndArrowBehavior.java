package practice.designpatterns.StrategyPattern;

public class BowAndArrowBehavior implements WeaponBehavior {
    public void useWeapon(){
        System.out.println("Shoot bow and arrow.");
    }
}
