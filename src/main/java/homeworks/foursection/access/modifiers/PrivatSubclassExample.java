package homeworks.foursection.access.modifiers;

public class PrivatSubclassExample extends PrivateExamples{


    void method23(){

        PrivateExamples pxc = new PrivateExamples ();

//            pxc.privateMethodFromPrivateExamplesClass();    // - not valid due to private method
}

}
