/**
 * 
 */
package com.sssvt.serialization;

import java.io.Serializable;

/**
 * @author pmw80941
 *
 */
public class Account implements Serializable{
 String userName = "smamilla";
 transient String password = "123456";
 
}
