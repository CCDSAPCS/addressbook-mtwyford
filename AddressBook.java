//try change
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
	
	//add a contact passed in as a parameter
    public void addContact(Contact c) {
	    friends[numfriends] = c;
	    numfriends++;
    }
	
	//print out infor on all contacts using method in Contact class
    public void printContacts(){
	    for (int i=0;i<numfriends; i++)
		    friends[i].printContact();
    }
	
