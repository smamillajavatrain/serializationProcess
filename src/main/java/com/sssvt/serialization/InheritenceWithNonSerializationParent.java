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
 * @author pmw80941
 *
 */
public class InheritenceWithNonSerializationParent {

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		RegularEmployee a1 = new RegularEmployee();
		String fileName = "regularEmployee.ser";
		FileOutputStream fos = new FileOutputStream(fileName);
		try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(a1);
			try (FileInputStream fis = new FileInputStream(fileName);
					ObjectInputStream ois = new ObjectInputStream(fis)) {
				RegularEmployee a2 = (RegularEmployee) ois.readObject();
				System.out.println("RegularEmployee is "+a2.regEmpId+ " and deptId is "+a2.deptId);
			}
		}
	}
}