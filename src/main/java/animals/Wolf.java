package animals;

import org.springframework.stereotype.Component;

@Component
public class Wolf implements Animal{
    @Override
    public void makesSound(){
            System.out.println("Howl");

    }



}
