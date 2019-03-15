package threeCorePrincipalsOfOO.Pprojects;

import org.junit.Test;

public class PersonPolymorphismClassTest {
    private FemaleClass female = new FemaleClass();
    private MaleClass male = new MaleClass();

    @Test
    public void voice() {
        female.voice();
        male.voice();


    }
}