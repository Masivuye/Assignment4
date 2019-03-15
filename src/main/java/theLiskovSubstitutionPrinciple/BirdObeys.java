package theLiskovSubstitutionPrinciple;

public class BirdObeys {

    class Bird{
        public void eat(){}
    }
    class FlightBird extends Bird{
        public void fly(){}
    }
    class NonFlight extends Bird{}
}
