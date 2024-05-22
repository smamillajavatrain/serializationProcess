/**
 * 
 */
package com.sssvt.serialization.finaldemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author smamilla
 *
 */
public class DeserializationClass {
	public static void main(String[] args) {
		Employee emp = null;
		try {
			FileInputStream fileIn = new FileInputStream("./employee.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			emp = (Employee) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserializing Employee...");
		System.out.println("First Name of Employee: " + emp.firstName);
		System.out.println("Last Name of Employee: " + emp.lastName);
		System.out.println("Company Name: "+emp.companyName);
		System.out.println("Company CEO: "+emp.companyCEO);
		System.out.println("Company Address: "+emp.address);
	}
}
/*
 * A static variable cannot be serialized
 * While de-serializing a value can be available for Static variables if the same is provided while initialization of the base class.
 * If the variable is defined as Static and Transient both than static modifier will govern the behavior of variable and not Transient.
 * Transient variables value will not be saved. Also, it can not be assigned any value while de-serialization process. Which is different from static behavior.
 * 
 */

