package homeworks.foursection.access.modifiers;

public class PublicExamples {


    public void publicMethod() {
        System.out.println ( "publicMethodFromPublicExamplesClass"
//                + this.getClass().getSimpleName()
        );
    }

    void newMethod2() {
        PublicExamples pe = new PublicExamples ();
        pe.publicMethod ();
    }

    class InnerPublicExample {
        PublicExamples pe = new PublicExamples ();

        void method() {
            pe.publicMethod ();
        }
    }
}

class SecondPublicExample {
    PublicExamples pe2 = new PublicExamples ();

    void method3545() {
        pe2.publicMethod ();
    }


}


