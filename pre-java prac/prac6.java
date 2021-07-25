////Name Prapakorn Saelim
//ID : 6388145

import java.util.Scanner;

public class prac6 {
 public static void main(String[] args) {
    Scanner scanNumber = new Scanner(System.in);

     int num1 = scanNumber.nextInt();
     int num2 = scanNumber.nextInt();
    
    scanNumber.close();

    System.out.println(num1 + " + " + num2 + " = " +(num1+num2));
    System.out.println(num1 + " - " + num2 + " = " +(num1-num2));
    System.out.println(num1 + " x " + num2 + " = " +(num1*num2));
    System.out.println(num1 + " / " + num2 + " = " +(num1/num2));
    System.out.println(num1 + " % " + num2 + " = " +(num1%num2));
 }   
}
