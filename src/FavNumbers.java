import java.util.Scanner;
public class FavNumbers {
    public static void main(){
        Scanner in = new Scanner(System.in);
        int favInt = SafeInput.getInt(in, "enter favorite int");
        double favDouble = SafeInput.getDouble(in, "enter favorite double");
        IO.println("Favorite Int is " + favInt + ". " + "Favorite Double is " + favDouble + ".");
    }
}
