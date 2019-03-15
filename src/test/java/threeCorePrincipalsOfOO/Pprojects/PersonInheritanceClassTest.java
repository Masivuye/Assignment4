package threeCorePrincipalsOfOO.Pprojects;

import org.junit.Test;

public class PersonInheritanceClassTest {

    private Female person = new Female();

    @Test
    public void getAge() {

        System.out.println(person.getAge());
        person.details();
    }

    @Test
    public void getName() {
        System.out.println(person.getName());
        person.details();
    }

    @Test
    public void details() {
        person.details();
    }
}