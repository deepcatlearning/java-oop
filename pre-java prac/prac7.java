//Name Prapakorn Saelim
//ID : 6388145

import java.util.Scanner;

public class prac7 {
    public static void main(String[] args) {
        Scanner scanNumber = new Scanner(System.in);
        int input = scanNumber.nextInt();

        scanNumber.close();

        for(int i = 0; i <= 12; ++i)
        {
            System.out.println(input + " x " + i + " = " +(input*i));
        }
    }
}
