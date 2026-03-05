public class typecon {
    public static void main(String[] args) {
        int myInt = 5;
        windering conversion (automatically done)

        //implicit conversion from int to double 

        double mydouble = myInt;
        System.out.println("my double value is" + mydouble);

        //narrowing conversion (manually done)

        double myd = 10.00d;
        //explicit conversion from double to int
        int myInt = (int) myd;
        System.out.println("my double value is "+ myInt);
    }
}
