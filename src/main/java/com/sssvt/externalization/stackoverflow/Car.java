/**
 * 
 */
package com.sssvt.externalization.stackoverflow;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @author smamilla
 *
 */
public class Car implements Externalizable {
	static int age;
    String name;
    int year;
 
    public Car()
    {
        System.out.println("Default Constructor called");
    }
 
    Car(String n, int y)
    {
        this.name = n;
        this.year = y;
        age = 10;
    }
 
    @Override
    public void writeExternal(ObjectOutput out) throws IOException
    {
        out.writeObject(name);
        out.writeInt(age);
        out.writeInt(year);
    }
 
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
    {
        name = (String)in.readObject();
        year = in.readInt();
        age = in.readInt();
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [name=");
		builder.append(name);
		builder.append(", year=");
		builder.append(year);
		builder.append("]");
		return builder.toString();
	}
}