* @author USER
 */
import java.util.Scanner;
public class solution2 {
    public static void main(String[] args) {
        int a, b, c;
        double x, y, del;
        Scanner input = new Scanner(System.in);
        System.out.println("a= ");
        a = input.nextInt();
        System.out.println("b= ");
        b = input.nextInt();
        System.out.println("c= ");
        c = input.nextInt();
        del = ((b*b)-(4*a*c));
        if (del < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } 
        else if (del == 0) {
           
            System.out.println("X = y = " + (-b/(2*a)));
        } 
        else {
            x = (-b + (Math.sqrt(del)/(2*a)));
            y = (-b - (Math.sqrt(del)/(2*a)));
            System.out.println("X = " + x);
            System.out.println("y = " + y);
        }
    }
}
