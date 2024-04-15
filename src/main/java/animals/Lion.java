package animals;

import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal{
    @Override
    public void makesSound(){
        System.out.println("Roar");
    }
}
