package homeworks.foursection;

public class StaticMethods {

    static void staticMethodExample(){
        System.out.println ("Static method");

    }

}

class SecondStaticMethodsExample{
    void method34(){
        StaticMethods.staticMethodExample (); //  no need class instance
    }

}
