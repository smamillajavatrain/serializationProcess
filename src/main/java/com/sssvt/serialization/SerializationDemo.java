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
public class SerializationDemo {

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Rat r1 = new Rat();
		String fileName = "abc.ser";

		FileOutputStream fos = new FileOutputStream(fileName);
		try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(d1);
			oos.writeObject(c1);
			oos.writeObject(r1);

			try (FileInputStream fis = new FileInputStream(fileName);
					ObjectInputStream ois = new ObjectInputStream(fis)) {
				Dog d2 = (Dog) ois.readObject();
				System.out.println(d2.i);
				Cat c2 = (Cat) ois.readObject();
				System.out.println(c2.i);
				Rat r2 = (Rat) ois.readObject();
				System.out.println(r2.i);

				for (int i = 0; i < 3; i++) {
					Object o = ois.readObject();
					if (o instanceof Dog) {
						Dog d3 = (Dog) ois.readObject();
						System.out.println(d3.i);
					}

					if (o instanceof Dog) {
						Cat c3 = (Cat) ois.readObject();
						System.out.println(c3.i);
					}

					if (o instanceof Dog) {
						Rat r3 = (Rat) ois.readObject();
						System.out.println(r3.i);
					}
				}

			}

		}
	}
}