import java.io.*;
import java.util.Scanner;

public class AddressBook {

    private Contact[] friends; // An array of Contacts - each stores info for one friend
    private int numfriends; // Number of friends currently in AddressBook

    // Create an empty AddressBook
    public AddressBook() {
		friends = new Contact[10];
		numfriends = 0;
    }

	public void addContact(Contact c) {
		friends[numfriends] = c;
		numfriends++;
	}
	
	
public void printContacts() {
	for( int i=0; i<numfriends;i++)
		friends[i].printContact90;
}
	
public int numContacts() {
	return numfriends;
}
	
	
public int haveContact(String s) {
	iterate through list of friends i=0 to numfriends
		if (friends[i].getName().equals(s) )
		}
	
	
