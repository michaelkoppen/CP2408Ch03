/**
 * Created by jc428209 on 14/08/17.
 */
import java.util.Scanner;
public class BookstoreCredit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your GPA: ");
        float gpa = input.nextFloat();
        displayCredit(name, gpa);
    }
    public static void displayCredit(String name, float gpa) {
        System.out.println(name + ", with a GPA of " + gpa + " gets $" + (gpa*10) + " worth of credit");
    }
}
