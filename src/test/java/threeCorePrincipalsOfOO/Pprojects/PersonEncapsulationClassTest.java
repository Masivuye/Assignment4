package threeCorePrincipalsOfOO.Pprojects;

import org.junit.Test;

public class PersonEncapsulationClassTest {
    private PersonEncapsulationClass eps = new PersonEncapsulationClass();

    @Test
    public void getSurname() {
        eps.setSurname("Bheme");
        System.out.println("My Surname is:  "+eps.getSurname());


    }

    @Test
    public void getHeight() {
        eps.setHeight(1.8);
        System.out.println("The Height is: "+eps.getHeight());
    }


}