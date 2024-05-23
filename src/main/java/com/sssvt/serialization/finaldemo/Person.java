/**
 * 
 */
package com.sssvt.serialization.finaldemo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author smamilla
 *
 */
public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long J = 1L;
	
	private String name;
	
    protected transient int age;
    private transient BigDecimal salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public Person(String name, int age, BigDecimal salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		if(salary!=null) {
			builder.append(", salary=");
			builder.append(salary);
		}
		builder.append("]");
		return builder.toString();
	}
}