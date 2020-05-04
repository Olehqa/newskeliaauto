package homeworks.foursection.access.modifiers;

public class PrivateExamples {

    public static void main(String[] args) {
        PrivateExamples pec = new PrivateExamples ();
        pec.newMethod();
    }


    private void privateMethodFromPrivateExamplesClass() {
        System.out.println ( "Private method" );
    }

    void newMethod() {
        ProtectedExamples pe = new ProtectedExamples ();
        pe.protectedMethodExample ();
    }

    class InnerPrivateExamplesClass {
        PrivateExamples pxc = new PrivateExamples ();
        void method(){
            pxc.privateMethodFromPrivateExamplesClass();
            pxc.newMethod();
        }

    }
}


//class SecondPrivateExamplesClass {
//    PrivateExamplesClass pxc = new PrivateExamplesClass ();
//    void method23(){
//        pxc.privateMethodFromPrivateExamplesClass(); // - not valid due to private method
//    }
//}
