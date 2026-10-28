public class CtoFTableDisplay {
    static void main() {
        IO.println("   C      F");
        for (int C = -100; C <= 100; C++) {
            System.out.printf("%5s\t%2s\n", C, CtoF(C));
        }
    }

    public static double CtoF(double Celsius){
        return (Celsius * 9/5) + 32;
    }
}
