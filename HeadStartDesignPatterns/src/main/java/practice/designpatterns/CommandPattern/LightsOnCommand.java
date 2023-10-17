package practice.designpatterns.CommandPattern;

public class LightsOnCommand implements Command{
    Light light;

    //The constructor is passed the specific light that this command is going to control
    //Stashes it in the light instance variable. When execute is called, this is the receiver of the request
    public LightsOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute(){
        light.on();
    }
    
}
