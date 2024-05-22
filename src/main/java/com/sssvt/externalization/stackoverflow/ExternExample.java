/**
 * 
 */
package com.sssvt.externalization.stackoverflow;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author smamilla
 *
 */
public class ExternExample {

	/**
	 * @param args
	 */
	public static void main(String[] args)
    {
        Car car = new Car("Ritz", 2010);
        Car newcar = null;
        // Serialize the car
        try {
            FileOutputStream fo = new FileOutputStream("gfg.txt");
            ObjectOutputStream so  = new ObjectOutputStream(fo);
            so.writeObject(car);
            so.flush();
        }
        catch (Exception e) {
            System.out.println(e);
        }
 
        // Deserialization the car
        try {
            FileInputStream fi = new FileInputStream("gfg.txt");
            ObjectInputStream si = new ObjectInputStream(fi);
            newcar = (Car)si.readObject();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("The original car is:\n" + car);
        System.out.println("The new car is:\n" + newcar);
    }
}
