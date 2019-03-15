package threeCorePrincipalsOfOO.Pprojects;


//Polymorphism is one of the OOPs feature that allows us to perform a single action in different ways.
public class PersonPolymorphismClass {
    public void voice(){
        System.out.println("Person has a voice");
    }
}
  class FemaleClass extends PersonPolymorphismClass{
    @Override
   public void voice (){
        System.out.println("Female has a soft sweet voice");
    }

}
class MaleClass extends PersonPolymorphismClass{
    @Override
    public void voice(){
        System.out.println("Male has big voice");
    }
}
