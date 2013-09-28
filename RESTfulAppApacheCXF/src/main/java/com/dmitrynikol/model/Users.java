package com.dmitrynikol.model;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Wrapper class which map a collection of User elements into JSON.
 * 
 * @author Dmitry Nikolaenko
 *
 */
@XmlRootElement
@XmlType(name = "users")
public class Users {
	private Collection<User> users;
	
	public Users(Collection<User> users) {
		this.users = users;
	}
	
	@XmlElement(name = "user")
	@XmlElementWrapper(name = "users")
	public Collection<User> getUsers() {
		return users;
	}

	public void setUsers(Collection<User> users) {
		this.users = users;
	}
}