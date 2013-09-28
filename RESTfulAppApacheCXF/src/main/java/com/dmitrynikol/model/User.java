package com.dmitrynikol.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * A typical User entity. 
 * XmlRootElement annotation enable JAXB to convert to and from JSON.
 * This will map to a JSON object rather than an XML element.  
 * 
 * @author Dmitry Nikolaenko
 *
 */
@XmlRootElement(name = "user")
public class User implements Serializable {
	private static final long serialVersionUID = -1947793985171006217L;
	
	private Integer id;
	private String firstName;
	private String lastName;
	
	public User(){}
	
	public User(Integer id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
