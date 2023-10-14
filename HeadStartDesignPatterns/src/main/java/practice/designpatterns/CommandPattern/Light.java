package practice.designpatterns.CommandPattern;

public class Light {
    private boolean on;

    public Light(){
        System.out.println("constructed");
        this.on = false;
    }

    public void on(){
        on = true;
    }

    public boolean isOn(){
        System.out.println("test");
        System.out.println("Status of on ");
        if(on){
            System.out.println("On");
        }else{
            System.out.println("Off");
        }
        return on;
    }
}
