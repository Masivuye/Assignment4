package theInterfaceSegregationPrinciple;

public class AthleteObeys {
    public interface Athlete {
        void compete();
    }
    public interface SwimmingAthlete extends Athlete {
        void swim();
    }
    public interface JumpingAthlete extends Athlete {
        void highJump();
        void longJump();
    }
    public class JohnDoe implements SwimmingAthlete {
        @Override
        public void compete() {

            System.out.println("John Doe started competing");
        }
        @Override
        public void swim() {

            System.out.println("John Doe started swimming");
        }
    }
}
