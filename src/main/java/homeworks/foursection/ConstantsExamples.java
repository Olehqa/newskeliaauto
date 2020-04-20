package homeworks.foursection;

public class ConstantsExamples {
    private final int NEW_PRIVATE_CONSTANT = 3;
    private static final int NEW_PRIVATE_STATIC_CONSTANT = 3;
    double ty = Math.PI;


    class InnerConstandsExamples{
        ConstantsExamples ce = new ConstantsExamples ();
        int a = ce.NEW_PRIVATE_CONSTANT;
//        int a = ConstantsExamples.NEW_PRIVATE_CONSTANT;

        int b = ConstantsExamples.NEW_PRIVATE_STATIC_CONSTANT;

        }
    }
