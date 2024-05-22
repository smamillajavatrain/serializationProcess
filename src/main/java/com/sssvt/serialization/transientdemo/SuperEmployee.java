/**
 * 
 */
package com.sssvt.serialization.transientdemo;

import java.io.Serializable;

/**
 * @author DELL
 *
 */
public class SuperEmployee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String lastName;
	static  String companyName;
	transient  String address;
	static transient String companyCEO;
}
