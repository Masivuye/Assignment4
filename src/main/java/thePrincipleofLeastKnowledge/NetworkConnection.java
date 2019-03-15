package thePrincipleofLeastKnowledge;


 class Person{
    private String name;
     private String photo;


     public String getName() {
         return name;
     }public String getPhoto() {
         return photo;
     }

 }
public final class NetworkConnection {
    public void send(Person person) {
        sendBytes(person.getName().getBytes());
        sendBytes(person.getPhoto().getBytes());

    }

    private void sendBytes(byte[] bytes) {
    }
}
