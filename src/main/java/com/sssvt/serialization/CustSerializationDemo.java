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
public class CustSerializationDemo {

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account a1 = new Account();
		String fileName = "account.ser";
		FileOutputStream fos = new FileOutputStream(fileName);
		try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(a1);
			try (FileInputStream fis = new FileInputStream(fileName);
					ObjectInputStream ois = new ObjectInputStream(fis)) {
				Account a2 = (Account) ois.readObject();
				System.out.println("userName is "+a2.userName +" password is "+a2.password);
			}
		}
		
		CustAccount ca = new CustAccount();
		String fileName1 = "accountCa.ser";
		FileOutputStream fos1 = new FileOutputStream(fileName1);
		try (ObjectOutputStream oos = new ObjectOutputStream(fos1)) {
			oos.writeObject(ca);
			try (FileInputStream fis1 = new FileInputStream(fileName1);
					ObjectInputStream ois = new ObjectInputStream(fis1)) {
				CustAccount ca2 = (CustAccount)ois.readObject();
				System.out.println("userName is "+ca2.userName +" password is "+ca2.password);
				
				
			}

		}
	}
}
