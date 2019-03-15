package threeCorePrincipalsOfOO.Pprojects;

//Encapsulation  is a process of wrapping code and data together into a single unit.
public class PersonEncapsulationClass {
    private String  Surname;
    private double height;

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
