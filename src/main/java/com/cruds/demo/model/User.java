package com.cruds.demo.model;


public class User {

private String FirstName;
private String LastName;
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public User(String firstName, String lastName) {
	super();
	FirstName = firstName;
	LastName = lastName;
}
@Override
public String toString() {
	return "User [FirstName=" + FirstName + ", LastName=" + LastName + "]";
}

}
