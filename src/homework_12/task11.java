package homework_12;


    public class task11 {
        public static void main(String[] args) {

            int var1 = 0;
            int var2 = 1;
            int var3 = 2;
            int var4 = 3;

            int sum = var1 + var2 + var3 + var4;
            int average = sum / 4;

            int rest = sum % 4;

            System.out.println("average is " + average);
            System.out.println("rest is " + rest);

            double restDouble = (double) sum / 4 - average;
            System.out.println("restDouble is " + restDouble);



        }
    }

