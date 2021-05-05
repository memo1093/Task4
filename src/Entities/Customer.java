package Entities;
import java.time.LocalDate;


import Abstract.Entity;

public class Customer implements Entity {
	 int Id;
	 String FirstName;
	 String LastName;
	 LocalDate DateOfBirth;
	 String NationalityId;
public Customer() {
		
	}
public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
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
public LocalDate getDateOfBirth() {
	return DateOfBirth;
}
public void setDateOfBirth(LocalDate dateOfBirth) {
	DateOfBirth = dateOfBirth;
}
public String getNationalityId() {
	return NationalityId;
}
public void setNationalityId(String nationalityId) {
	NationalityId = nationalityId;
}
}

