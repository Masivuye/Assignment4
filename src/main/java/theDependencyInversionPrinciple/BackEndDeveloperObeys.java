package theDependencyInversionPrinciple;

import java.util.List;

public class BackEndDeveloperObeys {

    public interface Developer {

        void develop();
    }

    public class BackEndDeveloper implements Developer {

        @Override
        public void develop() {
            writeJava();
        }

        private void writeJava() {
        }

    }

    public class FrontEndDeveloper implements Developer {

        @Override
        public void develop() {

            writeJavascript();
        }

        public void writeJavascript() {
        }

    }


    class Project {

        private List<Developer> developers;

        public Project(List<Developer> developers) {

            this.developers = developers;
        }

        public void implement() {


        }


    }
}
