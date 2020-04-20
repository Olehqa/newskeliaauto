package homeworks.foursection.access.modifiers;

public class NoAccessModifiersExample {

    void noAccessModifiersMethod() {
        System.out.println ( "no access modifiers method" );
    }


    class InnerNoAccessModifiersExample {
        NoAccessModifiersExample nam = new NoAccessModifiersExample ();
        void method4543() {
            nam.noAccessModifiersMethod();
        }

    }
}
