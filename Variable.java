public class Variable {
    public static void main(String[] args) {
        int number1 ;
        boolean status;
        char alphabet;
        float count;
        double number3;

        number1 = 10 ;
        count = 20.5f; // add "f"
        number3 = 2.22;
        alphabet = 'A';
        status = true;

        int aa = 0, bb = 2, cc = 3;


        // ------------------------ Print ------------------------ // 

        int num1 = 10;
        int num2 = 20;
        num1 = 50;
        System.out.println("Value of 1st number " + num1); //Value of 1st number 50
        System.out.println("Value of 2nd number " + num2); //Value of 2nd number 20

        final int NUM3 = 30; // Constants use final and uppercase
        System.out.println("Value of 1st number " + NUM3); //Value of 1st number 30


        // ----------------------- Global & Local variable ------------------------- //

        {
            int ccc = 300; // Local
            System.out.println("Print ccc = " + ccc); // Print ccc = 300
            System.out.println("Print num1 " + num1); // Print num1 50
        }

        // System.out.println("Print ccc = " + ccc); // cannot print out of scope local cariable



        // ----------------------- MIN & MAX Value ------------------------- //

        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.MAX_VALUE); // 2147483647


        // ----------------------- Type Casting ------------------------- //
        double numDouble = 10.0;
        int numInt = (int)numDouble; // numInt = 10
        double numDouble2 = numInt; // numDouble2 = 10.0

        // ----------------------- Check Type ------------------------- //

        Integer ca = 20;
        double cd = 59.00;
        String cs = "Hello";
        boolean cb = true;
        // Character cch = "A";
        float cf = 60.33f;

        boolean result = ca instanceof Integer; //true
        boolean result2 = ca.toString() instanceof String; //true

        System.out.println(result2);

        // ----------------------- Scanner ------------------------- //

        
    }
}
