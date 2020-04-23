package homeworks.foursection.overloadexample;

public class OverloadExample1  extends OverloadExamples2{
    private int a;
    private int b;
    private boolean c;
    private long d;

    static {
        System.out.println ("New object has been created");
    }

    public OverloadExample1() {
    }

    public OverloadExample1(int a, int e) {
        super(e);
        this.a = a;
        Printing (  a, e );
        System.out.println ("Constructor is used");

    }
    {
        System.out.println ("second init block has been triggered");

        Printing ( a, e );
        System.out.println ("block ends");
    }



    public OverloadExample1(int a , int b , boolean c) {
//
    }

    public OverloadExample1(int a , int b , boolean c , long d) {
    }

    public void Printing(int a) {
        System.out.println ( " a: " + a );
    }

    public void Printing(int a , int b) {
        System.out.println ( " a: " + a + ", b: " + b );

    }

    public void Printing(int a , boolean c) {
        System.out.println ( " a: " + a + ", c: " + c );
    }

    public static void main(String[] args) {
        OverloadExample1 oe11 = new OverloadExample1 ( 1,2 );
        OverloadExample1 oe12 = new OverloadExample1 ( 1,2 );
    }

}
