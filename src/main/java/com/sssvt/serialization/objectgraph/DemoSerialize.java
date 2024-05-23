/**
 * 
 */
package com.sssvt.serialization.objectgraph;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author smamilla
 *
 */
public class DemoSerialize {
	public static void main(String args[]) throws Exception {

		// Creating object of class Serial1
		Serial1 s1 = new Serial1();

		// Serializing object of class Serial1
		// Saving object in file
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// Method for serializing object of class Serial1
		oos.writeObject(s1);

		// Close streams once serialization is done
		fos.close();
		oos.close();

		// De-Serializing object of class Serial1

		// Reading object from file
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		// Method for de-serializing object of class Serial1
		Serial1 serobject = (Serial1) ois.readObject();

		// Close streams once de-serialization is done
		fis.close();
		ois.close();

		// Printing values of i and j after Serialization
		System.out.println("Value of i after Serialization" + " is " + serobject.s2.s3.i);
		System.out.println("Value of j after Serialization" + " is " + serobject.s2.s3.j);
	}
}