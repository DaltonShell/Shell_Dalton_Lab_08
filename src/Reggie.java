import java.util.Scanner;
public class Reggie {
    public static void main() {
        Scanner in = new Scanner(System.in);
        String SSN = SafeInput.getRegExString(in,"SSN","^\\d{3}-\\d{2}-\\d{4}$" );
        String ID = SafeInput.getRegExString(in,"UC ID","^(M|m)\\d{5}$" );
        String MENU = SafeInput.getRegExString(in,"Menu choice","^[OoSsVvQq]$" );
        System.out.println("Your SSN is " + SSN + ". " + "Your UC ID is " + ID + ". " + "Your menu choice is " + MENU + ". ");
    }
}