
// name: yakir pinchas
public class anoitek {

        public static double numThrowing(int floors){
                /*sum of Invoice series is : (n * (n + 1)) / 2 , compare to floors
                 Formula of a quadratic equation => x1 = ( -b + sqrt(b^2 - 4*a*c)) / 2a
                */
                double a = 1, b = 1, c = -1 * floors * 2;

                return Math.round((-b + (Math.sqrt(Math.pow(b,2) - 4 * a * c))) / 2 * a);
        }

        public static void main(String[] args) {

                try {
                        /*convert String to int, But if input
                         is not an int  value then this will throws NumberFormatException.*/
                        int floor = Integer.parseInt(args[0]);
                        //check if number of floor is negative or positive
                        if(floor < 0)
                                System.out.println("Floor can't be negative");
                        else
                                System.out.println(numThrowing(floor));
                } catch(NumberFormatException e) {
                        // Here catch NumberFormatException
                        // So input is not a int.
                        System.out.println("input is not an int value");
                }

        }
}