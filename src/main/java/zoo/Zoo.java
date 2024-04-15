package zoo;

import animals.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Zoo {
    private List<Animal> animals;

    @Autowired
    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public void makesSound() {
        for (Animal animal : animals) {
            animal.makesSound();
        }
    }
}




























