/**
 * 
 */
package com.sssvt.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.sssvt.serialization.transientdemo.Person;

/**
 * @author pmw80941
 *
 */
public class InheritenceSerializationDemo {

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ContractEmployee a1 = new ContractEmployee();
		String fileName = "contractEmployee.ser";
		FileOutputStream fos = new FileOutputStream(fileName);
		try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(a1);
			try (FileInputStream fis = new FileInputStream(fileName);
					ObjectInputStream ois = new ObjectInputStream(fis)) {
				ContractEmployee a2 = (ContractEmployee) ois.readObject();
				System.out.println("empId is "+a2.empId +" contractId is "+a2.contractId);
			}
		}
	}
}