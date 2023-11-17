package practice.designpatterns.Introduction;

public class BulmaDog extends Dog{

    public BulmaDog(){
        playBehavior = new PlayNice();
        barkBehavior = new LoudBark();
    }
    
}
