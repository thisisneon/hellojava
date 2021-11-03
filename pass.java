* @author USER
 */


package Chapter_4;

import java.util.Scanner;
/**
 *
 * @author admin
 */
public class pass {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username;
        int password;
        System.out.println("Username: ");
        username = input.nextLine();
        System.out.println("Password: ");
        password = input.nextInt();
        if ((username == "HuyHoang") && (password == 2021)) {
            System.out.println("Ban da nhap sai username va password ");}
        else {
            System.out.println("Ban da nhap dung username va password ");}
        
    }
}
