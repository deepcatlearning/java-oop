import java.util.Scanner;

public class bankSorting {
    public static void main(String[] args) {
        Scanner insertMoney = new Scanner(System.in);
        System.out.println("Please insert your money");
        float money = insertMoney.nextFloat();
        insertMoney.close();

        if(money >= 1000)
        {
            System.out.println("Your money in 1,000 BHT Bank : "+((int)money/1000));
            money%=1000;
            System.out.println("Leftover : "+money);
        }

    }
}
