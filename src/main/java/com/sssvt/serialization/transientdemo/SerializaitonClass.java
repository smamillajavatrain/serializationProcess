/**
 * 
 */
package com.sssvt.serialization.transientdemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author smamilla
 *
 */
public class SerializaitonClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.firstName = "Srikanth";
		emp.lastName = "Mamilla";
		emp.companyName = "INTRADO";
		//Below part needs to be removed in case address field is made final
		emp.address = "HYD";
		emp.companyCEO = "ME CEO";

		try {
			FileOutputStream fileOut = new FileOutputStream("./employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in ./employee.txt file");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
