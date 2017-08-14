/**
 * Created by jc428209 on 14/08/17.
 */
import java.util.Scanner;
public class NumbersDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number for a ");
        int a = input.nextInt();
        System.out.println("Enter number for b");
        int b = input.nextInt();

        displayTwiceTheNumber(a);
        displayTwiceTheNumber(b);
        displayNumberPlusFive(a);
        displayNumberPlusFive(b);
        displayNumberSquared(a);
        displayNumberSquared(b);
    }
    public static void displayTwiceTheNumber(int a) {
        System.out.println(a + " Doubled is " + a*2);
    }
    public static void displayNumberPlusFive(int a) {
        System.out.println(a + " Plus 5 is " + (a + 5));
    }
    public static void displayNumberSquared(int a) {
        System.out.println(a + " Squared is " + (a*a));
    }

}
