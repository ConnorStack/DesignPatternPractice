package practice.designpatterns.Introduction;

public class WilburDog extends Dog {
    public WilburDog(){
        barkBehavior = new GrumbleBark();
        playBehavior = new PlayNice();
    }
}
