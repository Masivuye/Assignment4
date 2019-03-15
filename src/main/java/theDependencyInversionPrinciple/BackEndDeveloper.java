package theDependencyInversionPrinciple;

public class BackEndDeveloper {



        public void writeJava() {
        }
    }
    class FrontEndDeveloper {

        public void writeJavascript() {
        }

    }
    class Project {

        private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
        private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();

        public void implement() {

            backEndDeveloper.writeJava();
            frontEndDeveloper.writeJavascript();
        }

    }





