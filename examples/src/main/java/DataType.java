public class DataType {

    // tag::DataType[]
    private static byte b;
    private static Byte aByte;
    private static short aShort;
    private static Short AShort;
    private static int anInt;
    private static Integer integer;
    private static long aLong;
    private static Long ALong;
    private static float aFloat;
    private static Float AFloat;
    private static double aDouble;
    private static Double ADouble;
    private static boolean aBoolean;
    private static Boolean ABoolean;
    private static char aChar;
    private static Character character;
    private static String text;

    public static void main(String[] args) {
        System.out.println(b);// 0
        System.out.println(aByte);// null
        System.out.println(aShort);// 0
        System.out.println(AShort);// null
        System.out.println(anInt);// 0
        System.out.println(integer);// null
        System.out.println(aLong);// 0
        System.out.println(ALong);// null
        System.out.println(aFloat);// 0.0
        System.out.println(AFloat);// null
        System.out.println(aDouble);// 0.0
        System.out.println(ADouble);//null
        System.out.println(aBoolean);// false
        System.out.println(ABoolean);// null
        System.out.println(aChar);//  
        System.out.println(character);// null
        System.out.println(text);// null
    }
    // end::DataType[]
}

