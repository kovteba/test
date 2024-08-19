import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DataTypeTest {

    @Test
    void dataTypeTest1() {

        // tag::dataTypeTest1[]
        System.out.println((byte) (127 + 1));
        // end::dataTypeTest1[]
        /*
        // tag::dataTypeTest1Variants[]
        1. -127
        2. Помилка компіляції
        3. -128
        4. 128
        // end::dataTypeTest1Variants[]
        // tag::dataTypeTest1Answer[]
        Answer: -128
        Description:
        // end::dataTypeTest1Answer[]
        */
    }

    @Test
    void dataTypeTest2() {

        /*
        // tag::dataTypeTest2[]
        short s1 = 1;
        short s2 = 2;
        short res = s1 + s2;
        // end::dataTypeTest2[]
        // tag::dataTypeTest2Variants[]
        1.
        2.
        3.
        4. Required type: short Provided: int
        // end::dataTypeTest2Variants[]
        // tag::dataTypeTest2Answer[]
        Answer: Required type: short Provided: int
        Description:
        // end::dataTypeTest2Answer[]
        */
    }

    @Test
    void dataTypeTest3() {

        // tag::dataTypeTest3[]
        String a = "value";
        String b = new String("value");
        String c = b.intern();

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);
        // end::dataTypeTest3[]
        /*
        // tag::dataTypeTest3Variants[]
        1. true, true, true
        2. true, true, false
        3. true, false, true
        4. false, false, true
        // end::dataTypeTest3Variants[]
        // tag::dataTypeTest3Answer[]
        Answer: false, false, true
        Description:
        // end::dataTypeTest3Answer[]
        */
    }

    @Test
    void dataTypeTest4() {

        // tag::dataTypeTest4[]
        String s1 = new String("123");
        String s2 = new String("123");
        String s3 = "123";
        String s4 = "123";

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1.equals(s2));
        // end::dataTypeTest4[]
        /*
        // tag::dataTypeTest4Variants[]
        1. false, true, true
        2. false, true, false
        3. true, false, true
        4. false, false, true
        // end::dataTypeTest4Variants[]
        // tag::dataTypeTest4Answer[]
        Answer: 1. false, true, true
        Description:
        // end::dataTypeTest4Answer[]
        */

    }

    @Test
    void dataTypeTest5() {

        // tag::dataTypeTest5[]
        String s1 = new String("123");
        String s2 = new String("123");
        s1 = s2;

        System.out.println(s1 == s2);
        System.out.println("someString" == "someString");
        System.out.println(s1.compareTo(s2));
        System.out.println("C".compareTo("A"));
        System.out.println("A".compareTo("C"));
        // end::dataTypeTest5[]
        /*
        // tag::dataTypeTest5Variants[]
        1. false, true, 1, -1, 2
        2. false, true, 0, 1, -1
        3. true, true, 0, 2, -2
        4. false, false, 0, 1, 1
        // end::dataTypeTest5Variants[]
        // tag::dataTypeTest5Answer[]
        Answer: true, true, 0, 2, -2
        Description:
        // end::dataTypeTest5Answer[]
        */
    }

    @Test
    void dataTypeTest6() {

        // tag::dataTypeTest6[]
        String s1 = "value";
        String s2 = "value";
        s1 += "1";
        s2 += "1";
        System.out.println(s1 == s2);

        s1 = "value1";
        s2 = "value1";
        System.out.println(s1 == s2);
        // end::dataTypeTest6[]
        /*
        // tag::dataTypeTest6Variants[]
        1. false, true
        2. true, false
        3. false, false
        4. true, true
        // end::dataTypeTest6Variants[]
        // tag::dataTypeTest6Answer[]
        Answer: false, true
        Description:
        // end::dataTypeTest6Answer[]
        */
    }

    @Test
    void dataTypeTest7() {

        // tag::dataTypeTest7[]

        // end::dataTypeTest7[]
        /*
        // tag::dataTypeTest7Variants[]
        1.
        2.
        3.
        4.
        // end::dataTypeTest7Variants[]
        // tag::dataTypeTest7Answer[]
        Answer:
        Description:
        // end::dataTypeTest7Answer[]
        */
    }

    @Test
    void dataTypeTest8() {

        // tag::dataTypeTest8[]
        System.out.print("string");
        // end::dataTypeTest8[]
        /*
        // tag::dataTypeTest8Variants[]
        1. Створюється рядок у пулі; Виводит его.
        2. Виводіт рядок на єкран.
        3. Створює рядок але не зберігає в пулі; Виводит его.
        4. Створюється рядок.
        // end::dataTypeTest8Variants[]
        // tag::dataTypeTest8Answer[]
        Answer: Створюється рядок у пулі; Виводит его.
        Description:
        // end::dataTypeTest8Answer[]
        */
    }

    @Test
    void dataTypeTest9() {

        // tag::dataTypeTest9[]
        var d = 1;
        var s = " string";
        var res = d + s;
        System.out.println(res);
        // end::dataTypeTest9[]
        /*
        // tag::dataTypeTest9Variants[]
        1. 1string
        2. 1 string
        3. Не можно поєднувати число з рядком
        4. Помилка компіляції
        // end::dataTypeTest9Variants[]
        // tag::dataTypeTest9Answer[]
        Answer: 1 string
        Description:
        // end::dataTypeTest9Answer[]
        */
    }

    @Test
    void dataTypeTest10() {

        // tag::dataTypeTest10[]
        String s1 = null;
        String s2 = "str";
        String res = s1 + s2;
        System.out.println(res);
        // end::dataTypeTest10[]
        /*
        // tag::dataTypeTest10Variants[]
        1. NullPointerException
        2. nullstr
        3. str
        4. Помилка компіляції
        // end::dataTypeTest10Variants[]
        // tag::dataTypeTest10Answer[]
        Answer: nullstr
        Description:
        // end::dataTypeTest10Answer[]
        */
    }

    @Test
    void dataTypeTest11() {

        // tag::dataTypeTest11[]
        String s1 = "JavaString";
        String s2 = "Java" + "String";

        System.out.println(s1 == s2);
        // end::dataTypeTest11[]
        /*
        // tag::dataTypeTest11Variants[]
        1. NullPointerException
        2. null
        3. true
        4. false
        // end::dataTypeTest11Variants[]
        // tag::dataTypeTest11Answer[]
        Answer: true
        Description:
        // end::dataTypeTest11Answer[]
        */
    }

    @Test
    void dataTypeTest12() {

        // tag::dataTypeTest12[]
        String s1 = "StringJava";
        String s2 = "Java";
        String s3 = "String" + s2;

        System.out.println(s1 == s3);
        // end::dataTypeTest12[]
        /*
        // tag::dataTypeTest12Variants[]
        1. NullPointerException
        2. null
        3. true
        4. false
        // end::dataTypeTest12Variants[]
        // tag::dataTypeTest12Answer[]
        Answer: false
        Description:
        // end::dataTypeTest12Answer[]
        */
    }

    @Test
    void dataTypeTest13() {

        // tag::dataTypeTest13[]
        LocalDateTime localDateTime = LocalDateTime.of(2023, 7, 7, 0, 0);
        String s1 = String.format("%1$tm %1$tB %1$tY", localDateTime);
        System.out.println(s1);
        // end::dataTypeTest13[]
        /*
        // tag::dataTypeTest13Variants[]
        1. 7 7 2023
        2. 07 07 2023
        3. 7 July 23
        4. 07 July 2023
        // end::dataTypeTest13Variants[]
        // tag::dataTypeTest13Answer[]
        Answer: 07 July 2023
        Description:
        // end::dataTypeTest13Answer[]
        */
    }

    @Test
    void dataTypeTest14() {

        // tag::dataTypeTest14[]
        System.out.println(2147483647 + 1);
        // end::dataTypeTest14[]
        /*
        // tag::dataTypeTest14Variants[]
        1. OutOfMemoryError
        2. -2147483648
        3. 2147483648
        4. Помилка компіляції
        // end::dataTypeTest14Variants[]
        // tag::dataTypeTest14Answer[]
        Answer: -2147483648
        Description:
        // end::dataTypeTest14Answer[]
        */
    }

    @Test
    void dataTypeTest15() {

        // tag::dataTypeTest15[]
        int i = 021;
        System.out.println(i);
        // octal восьмеричная система исчесления
        // end::dataTypeTest15[]
        /*
        // tag::dataTypeTest15Variants[]
        1. 021
        2. 17
        3. 21
        4. Помилка компіляції
        // end::dataTypeTest15Variants[]
        // tag::dataTypeTest15Answer[]
        Answer: 17
        Description:
        // end::dataTypeTest15Answer[]
        */
    }

    @Test
    void dataTypeTest16() {

        /*
        // tag::dataTypeTest16[]
        float f = 1.12312312312312312312;
        System.out.println(f);
        // end::dataTypeTest16[]
        // tag::dataTypeTest16Variants[]
        1. Помилки нема
        2. Занадто велике значення
        3. Required type: float Provided: double
        4. Помилка компіляції
        // end::dataTypeTest16Variants[]
        // tag::dataTypeTest16Answer[]
        Answer: Required type: float Provided: double
        Description:
        // end::dataTypeTest16Answer[]
        */
    }

    @Test
    void dataTypeTest17() {

        // tag::dataTypeTest17[]
        Double d = 0.2;
        System.out.println(new BigDecimal(d).equals(d));
        // end::dataTypeTest17[]
        /*
        // tag::dataTypeTest17Variants[]
        1. false
        2. true
        3. Runtime error
        4. Помилка компіляції
        // end::dataTypeTest17Variants[]
        // tag::dataTypeTest17Answer[]
        Answer: false
        Description:
        // end::dataTypeTest17Answer[]
        */
    }

    @Test
    void dataTypeTest18() {

        // tag::dataTypeTest18[]
        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(d1 + d2);
        // end::dataTypeTest18[]
        /*
        // tag::dataTypeTest18Variants[]
        1. 0.30000000000000004
        2. 0.3
        3. 0.30000000000000000
        4. Помилка компіляції
        // end::dataTypeTest18Variants[]
        // tag::dataTypeTest18Answer[]
        Answer: 0.30000000000000004
        Description:
        // end::dataTypeTest18Answer[]
        */
    }

    @Test
    void dataTypeTest19() {

        // tag::dataTypeTest19[]
        String text = "ABC";
        String subString = "";
        System.out.println(text.contains(subString));
        // end::dataTypeTest19[]
        /*
        // tag::dataTypeTest19Variants[]
        1. EmptyStringError
        2. true
        3. Помилка компіляції
        4. false
        // end::dataTypeTest19Variants[]
        // tag::dataTypeTest19Answer[]
        Answer: true
        Description:
        // end::dataTypeTest19Answer[]
        */
    }

    @Test
    void dataTypeTest20() {

        // tag::dataTypeTest20[]
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);
        // end::dataTypeTest20[]
        /*
        // tag::dataTypeTest20Variants[]
        1. false, true
        2. false, false
        3. true, true
        4. true, false
        // end::dataTypeTest20Variants[]
        // tag::dataTypeTest20Answer[]
        Answer: true, false
        Description:
        // end::dataTypeTest20Answer[]
        */
    }

    @Test
    void dataTypeTest21() {

        // tag::dataTypeTest21[]
        Integer i = 1;
        Integer j = i;
        System.out.println(i == j);
        j++;
        System.out.println(i == j);
        // end::dataTypeTest21[]
        /*
        // tag::dataTypeTest21Variants[]
        1. false, true
        2. true, false
        3. true, true
        4. false, false
        // end::dataTypeTest21Variants[]
        // tag::dataTypeTest21Answer[]
        Answer: true, false
        Description:
        // end::dataTypeTest21Answer[]
        */
    }

    @Test
    void dataTypeTest22() {

        // tag::dataTypeTest22[]
        System.out.println(Integer.valueOf(42) == Integer.valueOf(42));
        System.out.println(Integer.valueOf(42).equals(42L));
        System.out.println(new Integer(42) == new Integer(42));
        System.out.println(Long.valueOf(42L).equals(42));
        System.out.println(Long.valueOf(42L).equals(new Long(42L)));
        System.out.println(Long.valueOf(42L).equals(42L));
        // end::dataTypeTest22[]
        /*
        // tag::dataTypeTest22Variants[]
        1. true, false, true, false, true, true
        2. true, false, false, false, true, false
        3. false, false, false, false, true, true
        4. true, false, false, false, true, true
        // end::dataTypeTest22Variants[]
        // tag::dataTypeTest22Answer[]
        Answer: true, false, false, false, true, true
        Description:
        // end::dataTypeTest22Answer[]
        */
    }

    @Test
    void dataTypeTest23() {

        /*
        // tag::dataTypeTest23[]
        byte a = 1;
        byte b = ++a;
        byte c = -a;
        // end::dataTypeTest23[]
        // tag::dataTypeTest23Variants[]
        1. Required type: byte Provided: int в 1 строке
        2. Помилок нема
        3. Runtime error
        4. Required type: byte Provided: int в 3 строке
        // end::dataTypeTest23Variants[]
        // tag::dataTypeTest23Answer[]
        Answer: Required type: byte Provided: int в 3 строке
        Description:
        // end::dataTypeTest23Answer[]
        */
    }

    @Test
    void dataTypeTest24() {

        // tag::dataTypeTest24[]
        if (System.out.printf("Hello world") == null) {
            System.out.println("in");
        }
        // end::dataTypeTest24[]
        /*
        // tag::dataTypeTest24Variants[]
        1. Hello world
        2. in
        3. Hello worldin
        4. Hello world in
        // end::dataTypeTest24Variants[]
        // tag::dataTypeTest24Answer[]
        Answer: Hello world
        Description:
        // end::dataTypeTest24Answer[]
        */
    }

    @Test
    void dataTypeTest25() {

        /*
        // tag::dataTypeTest25[]
        String s1 = null;
        String s2 = "str";
        String res = s2.concat(s1);
        System.out.println(res);
        // end::dataTypeTest25[]
        // tag::dataTypeTest25Variants[]
        1. Помилка компіляції
        2. nullstr
        3. srt
        4. NullPointerException
        // end::dataTypeTest25Variants[]
        // tag::dataTypeTest25Answer[]
        Answer: NullPointerException
        Description:
        // end::dataTypeTest25Answer[]
        */
    }

    @Test
    void dataTypeTest26() {

        // tag::dataTypeTest26[]
        System.out.println("str=" + 4 + 4 * 2);
        // end::dataTypeTest26[]
        /*
        // tag::dataTypeTest26Variants[]
        1. Помилка компіляції
        2. str=48
        3. str=442
        4. str=12
        // end::dataTypeTest26Variants[]
        // tag::dataTypeTest26Answer[]
        Answer: str=48
        Description: Тому що * має вищій пріорітет ніж +
        // end::dataTypeTest26Answer[]
        */
    }

    @Test
    void dataTypeTest27() {

        // tag::dataTypeTest27[]
        String s1 = "1";
        String s2 = "2";
        String s3 = s1 + s2;
        String s4 = s1 + s2;
        String concat = s1.concat(s2);
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s3.hashCode() == s4.hashCode());
        System.out.println(s3.hashCode() == concat.hashCode());
        System.out.println(s4.hashCode() == concat.hashCode());
        // end::dataTypeTest27[]
        /*
        // tag::dataTypeTest27Variants[]
        1. true, false, true, true
        2. false, true, true, true
        3. true, true, true, true
        4. false, true, false, false
        // end::dataTypeTest27Variants[]
        // tag::dataTypeTest27Answer[]
        Answer: false, true, true, true
        Description:
        // end::dataTypeTest27Answer[]
        */
    }
}
