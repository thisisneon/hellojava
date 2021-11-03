package Nov_03_E2_Storage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Car_Info {
    public static void main(String[] args) throws IOException {
        
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("D:\\testout.txt"));
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            Car car_1[] = new Car[n];
            System.out.println("Nhap so luong xe: ");
            for (int i = 0; i < n; i++) {
                car_1[i].input();
            }
            oos.writeObject(car_1);
            System.out.println("Success...");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("D:\\testout.txt"));
            Car car_1 = (Car) ois.readObject();
            System.out.println(car_1.toString());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
    
}
