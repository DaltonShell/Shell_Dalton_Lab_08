import java.util.Scanner;

public class SafeInput {


    /**

     *

     * @param pipe a Scanner opened to read from System.in

     * @param prompt prompt for the user

     * @return a String response that is not zero length

     */

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;
    }

    /**

     *

     * @param pipe a Scanner opened to read from System.in

     * @param prompt prompt for the user

     * @return an Int response

     */

    public static int getInt (Scanner pipe, String prompt)
    {

        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                IO.println("You must enter a valid integer, not " + trash);

            }
        }while(!done);
        return retVal;
    }

    /**

     *

     * @param pipe a Scanner opened to read from System.in

     * @param prompt prompt for the user

     * @return a Double response

     */

    public static double getDouble (Scanner pipe, String prompt)
    {

        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                IO.println("You must enter a valid number, not " + trash);

            }
        }while(!done);
        return retVal;
    }

    /**

     *

     * @param pipe a Scanner opened to read from System.in

     * @param prompt prompt for the user

     * @param low the low

     * @param high the high

     * @return an Int response in range

     */

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    IO.println("Input something in range [" + low + "-" + high + "] not " + retVal);
                }
            }
            else
            {
                trash = pipe.nextLine();
                IO.println("You must enter a valid integer, not " + trash);

            }
        }while(!done);
        return retVal;
    }
    /**

     *

     * @param pipe a Scanner opened to read from System.in

     * @param prompt prompt for the user

     * @param low the low

     * @param high the high

     * @return an Double response in range

     */


    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal < low || retVal > high)
                {
                    IO.println("Input something in range [" + low + "-" + high + "] not " + retVal);
                }
                else
                {
                    done = true;
                }
            }
            else
            {
                trash = pipe.nextLine();
                IO.println("You must enter a valid number, not " + trash);

            }
        }while(!done);
        return retVal;
    }
    /**

     *

     * @param pipe a Scanner opened to read from System.in

     * @param prompt prompt for the user

     * @return a String response that is not zero length

     */

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean done = false;
        boolean YorN = false;
        String retString = "";
        do {
            System.out.print("\n" + prompt + " ");
            retString = pipe.nextLine();
            if (retString.equalsIgnoreCase("y")) {
                done = true;
                YorN = true;
            }
            else if (retString.equalsIgnoreCase("n")) {
                done = true;
                YorN = false;
            }
            else {
                IO.println("Enter Y or N not " + retString);
            }
        } while (!done);
        return YorN;
    }

    /**

     *

     * @param pipe a Scanner opened to read from System.in

     * @param prompt prompt for the user

     * @param regEx regEx string

     * @return user input regEx String

     */

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retString = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
            if (retString.matches(regEx))
            {
                done = true;
            }
            else
            {
                IO.println("Please enter a valid regEx");
            }
        } while (!done);
        return retString;
    }
    public static void prettyHeader(String msg) {

        int giveOrTake = msg.length() % 2;
        for(int i = 1; i <= 60; i++){
            System.out.print("*");
        }

        System.out.print("\n"+"***");
        for(int the = 1; the <= (54 - msg.length())/2; the++ ){
            IO.print(" ");
        }
        System.out.print(msg);
        for(int and = 1; and <= (54 - msg.length())/2 + giveOrTake; and++ ){
            IO.print(" ");
        }
        System.out.print("***" + "\n");
        for(int i = 1; i <= 60; i++){
            System.out.print("*");
        }
    }
}

