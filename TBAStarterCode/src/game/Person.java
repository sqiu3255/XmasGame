package game;

import rooms.Room;

public abstract class Person {

	String firstName,
			lastName;
	
	public Person (String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName()
	{
			return this.firstName;
	}
	
	public String getLastName()
	{
			return this.lastName;
	}
	
	
}
