package src.learnPackageAndClass;

public class learnDataType {
    //To know the Default value of datatype
    static byte a;
    public static void main(String[] args) {
        // --------- * SIZE * -----------
        // To know SIZE of DataTypes we use wrapper class with dot extension SIZE gives size unit in bits
            System.out.println(Short.SIZE); // 16 bits
        // To convert into bytes
            System.out.println(Short.SIZE/8);// 2 bytes

        // ------------ * RANGE * -----------
            // For Boolean we don't need of range it store true or false
            // For Char we store one ASCII values in ASCII Table

            // But for Integer we need the range
                // To know minimum value that we can store we use Wrapper class with dot extension MIN_VALUE gives a value number.
                System.out.println(Byte.MIN_VALUE); //-128
                // To know maximum value that we can store we use Wrapper class with dot extension MAX_VALUE gives a value number.
                System.out.println(Byte.MAX_VALUE); // 127

                // Range of Byte is -128 to 127 (minimum to maximum value)
                // * MIN_VALUE & MAX_VALUE you can use for Integer only

        // By using above concept we get to know which datatype we can use for store data
            // * EX:- in byte you can store up to 127 number 128 can store in int not in byte like that all datatypes

        // ---------- *  CREATING VARIABLES WITH DIFFERENT DATATYPES  * ---------------
            // datatype variableName using assigning operator value ;
            byte b = 50;
            short s = 250;
            int i = 2145345443;
            long l = 7660873035L;
            float f = 3.14f;
            double d = 88.75643;
            boolean b1 = true;
            boolean b2 = false;
            char c = 'r';

            // To know Default value datatype
                // declared in line number 5
                System.out.println(a); // 0
                // * Integer            -  0
                // * Boolean             -  true
                // * Char                -  Space
                // * Non-Primitive       - null

    }
}
