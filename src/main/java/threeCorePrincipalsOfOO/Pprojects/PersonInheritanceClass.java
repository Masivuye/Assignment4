package threeCorePrincipalsOfOO.Pprojects;

//Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object
public class PersonInheritanceClass {
    private int age = 25 ;
    private String name = "Person";

    public PersonInheritanceClass() {
    }

    public PersonInheritanceClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void details(){
        System.out.println("This is a Person ");
    }

}
 class Female extends PersonInheritanceClass {

      private String clothing = "Dress";


 }

