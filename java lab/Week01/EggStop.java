
public class EggStop {
	
	public static void main(String[] args) {
        printTop();
        printBot();

        printTop();
        printBot();
        printLine();

        printTop();
        printStop();
        printBot();
        printLine();
    }

    public static void printTop() {
        System.out.println("  ______  ");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }

    public static void printBot() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }

    public static void printLine() {
        System.out.println("+---------+");
    }

    public static void printStop() {
        System.out.println("|  STOP  |");
    }
	
}

