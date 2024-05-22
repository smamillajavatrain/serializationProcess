/**
 * 
 */
package com.sssvt.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author pmw80941
 *
 */
public class CustAccount implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String userName = "smamilla";
	transient String password = "sai";

	private void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		String epwd = "123" + password;
		out.writeObject(epwd);
	}

	private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
		in.defaultReadObject();
		String epwd = (String) in.readObject();
		password = epwd.substring(3);
	}
}
