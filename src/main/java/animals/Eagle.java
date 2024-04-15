package animals;

import org.springframework.stereotype.Component;

@Component
public class Eagle implements Animal {
    @Override
    public void makesSound() {
        System.out.println("Screech");
    }

}
