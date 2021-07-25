import java.util.Scanner;

public class plusMethod {
    static int plus(int x, int y){
    return x+y;
    }
    static float plus(float x, float y){
    return x+y;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease insert first number (Int): ");
        int intInput1 = input.nextInt();
        System.out.print("Please insert second number (Int): ");
        int intInput2 = input.nextInt();
        
        int intResult = plus(intInput1, intInput2);
        System.out.println("\nThe answer is " +intResult +" (This is int)");


        System.out.print("\nPlease insert first number (Float): ");
        float floatInput1 = input.nextFloat();
        System.out.print("Please insert second number (Float): ");
        float floatInput2 = input.nextFloat();
        input.close();
        
        float floatResult = plus(floatInput1, floatInput2);
        System.out.println("\nThe answer is " +floatResult +" (Float)\n");
    }
}
