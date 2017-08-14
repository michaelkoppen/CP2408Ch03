/**
 * Created by jc428209 on 14/08/17.
 */
public class NumbersDemo {
    public static void main(String[] args) {
        int a = 6;
        int b = 9;
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
