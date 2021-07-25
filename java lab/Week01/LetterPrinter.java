
public class LetterPrinter {

	public static void main(String[] args) {
		printLong();
        for(int i = 0; i < 2; ++i)
        {
          System.out.println("X     X"); 
        }
        printLong();

        for(int i = 0; i < 3; ++i)
        {
          System.out.println("X"); 
        }
    }
    public static void printLong() {
        System.out.println("XXXXXXX");
    }

}
