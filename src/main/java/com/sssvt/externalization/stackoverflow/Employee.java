package com.sssvt.externalization.stackoverflow;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * 
 * @author smamilla
 *
 */
public class Employee implements Externalizable {

	 public Employee(){}
	   String name;
	   int age;
	   public void writeExternal(ObjectOutput out) throws IOException {
	      out.writeObject(name);
	      out.writeInt(age);
	   }
	   public void readExternal(ObjectInput in) throws IOException,
	   ClassNotFoundException {
	      name = (String)in.readObject();
	      age = in.readInt();
	   }
}
