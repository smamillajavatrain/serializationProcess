/**
 * 
 */
package com.sssvt.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author smamilla
 *
 */
public class ExternalizableTest {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.name = "Reyan Ali";
		e.age = 30;
		try (FileOutputStream fileOut = new FileOutputStream("test.txt");
				ObjectOutputStream out = new ObjectOutputStream(fileOut);) {
			out.writeObject(e);
		} catch (IOException i) {
			System.out.println(i.getMessage());
		}
		try (FileInputStream fileIn = new FileInputStream("test.txt");
				ObjectInputStream in = new ObjectInputStream(fileIn);) {
			e = (Employee) in.readObject();
			System.out.println(e.name);
			System.out.println(e.age);
		} catch (IOException i) {
			System.out.println(i.getMessage());
		} catch (ClassNotFoundException e1) {
			System.out.println(e1.getMessage());
		}
	}
}
