/**
 * 
 */
package com.sssvt.serialization.finaldemo;

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
	static String companyName = "INTRADO";
	transient final String address = "HYD";
	static transient String companyCEO = "vnvihas";
}
