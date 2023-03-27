package online.javafun.valid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ValidationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ValidationApplication.class, args);
        PersonService personService = context.getBean(PersonService.class);
        Person person1 = new Person("Łukasz", "Górski", "sialala@pm.me", 35);
        System.out.println("Adding " + person1);
        personService.addPerson(person1);

        Person person2 = new Person("Anna", null, "sidsdsaalala@pm.me", 22);
        System.out.println("Adding " + person2);
        personService.addPerson(person2);

        Person person3 = new Person("Piotr", "Nowosądzki", "złyemail", 0);
        System.out.println("Adding " + person3);
        personService.addPerson(person3);

        System.out.println(personService);
    }

}
