import java.util.Scanner;
public class BirthDateTime {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in,"Enter your birth year",1950,2015);
        int day = 0;
        int month = SafeInput.getRangedInt(in,"Enter your birth month [1-12]",1,12);
        switch(month){
            case 2:
                day = SafeInput.getRangedInt(in, "Enter the day",1,29);
                break;
            case 10:
                day = SafeInput.getRangedInt(in, "Enter the day",1,31);
                break;
            default:
                day = SafeInput.getRangedInt(in, "Enter the day",1,30);
                break;
        }
        int hour = SafeInput.getRangedInt(in, "Enter the hour",1,24);
        int minute = SafeInput.getRangedInt(in, "Enter the minute",1,60);
        IO.println("You were born on minute " + minute + " of hour " + hour + " in the day " + day + " of month " + month +  " of the year " + year);
    }
}