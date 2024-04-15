import animals.Lion;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import zoo.Zoo;

@Configuration
@ComponentScan (basePackages = {"animals", "zoo"})
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        Zoo zoo = context.getBean(Zoo.class);
        zoo.makesSound();

        Lion lion = context.getBean(Lion.class);
        lion.makesSound();

        context.close();
    }
}



















