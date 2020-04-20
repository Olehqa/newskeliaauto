package homeworks.foursection.access.modifiers;

class ProtectedExamples {

    protected int protectedMethodExample() {
        System.out.println ( "protected method example" );

        return 0;
    }

    class InnerProtectedMethodExample {
        ProtectedExamples pe = new ProtectedExamples ();

        void newMethod() {
            System.out.println ( pe.protectedMethodExample () );
        }
    }


//    PrivateExamplesClass pxc = new PrivateExamplesClass ();
//      pxc.privateMethodFromPrivateExamplesClass(); // not valid due to private method
}

class SecondClass {

    void newMethod() {
        ProtectedExamples pe = new ProtectedExamples ();
        pe.protectedMethodExample ();

//        NoAccessModifiersExample name = new NoAccessModifiersExample ();
//        name.noAccessModifiersMthod ();
    }



}
