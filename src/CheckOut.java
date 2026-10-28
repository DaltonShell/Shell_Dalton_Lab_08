import java.util.Scanner;
public class CheckOut {
    public static void main() {
        Scanner in = new Scanner(System.in);
        double totalPrice = 0;
        boolean done = false;
        do {
            totalPrice += SafeInput.getRangedDouble(in, "enter price of item",0.5,10.0);
            done = SafeInput.getYNConfirm(in, "You done?");
        }while(!done);
        IO.print("The total cost is ");
        System.out.printf("%.2f", totalPrice);
    }
}
