package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookOperations implements IAddressBook{
    ArrayList<Contacts> ContactList=new ArrayList();
    Scanner sc=new Scanner(System.in);
    @Override
    public void addContacts() {


        System.out.println("Enter FirstName");
        String firstname=sc.next();

        System.out.println("Enter Lastname");
        String lastname=sc.next();

        System.out.println("Enter city");
        String city=sc.next();

        System.out.println("Enter state");
        String state=sc.next();

        System.out.println("Enter email");
        String email=sc.next();

        System.out.println("Enter Address");
        String address=sc.next();

        System.out.println("Enter phonenumber");
        int phonenumber=sc.nextInt();

        System.out.println("Enter zip");
        int zip=sc.nextInt();


        Contacts contacts=new Contacts(firstname,lastname,city,state,address,email,zip,phonenumber);
        ContactList.add(contacts);

        System.out.println(ContactList);

    }

    @Override
    public void editContact(String firstName) {
        boolean flag= false;
        for(Contacts contact : ContactList){
            if(contact.getFirstName().equals(firstName)){
                flag= true;
                System.out.println("Enter First Name");
                String FirstName = sc.next();
                System.out.println("Enter Last Name");
                String lastName = sc.next();
                sc.nextLine();
                System.out.println("Enter Address");
                String address = sc.nextLine();
                System.out.println("Enter City");
                String city = sc.next();
                System.out.println("Enter State");
                String state = sc.next();
                System.out.println("Enter Zip Code");
                int zip = sc.nextInt();
                System.out.println("Enter Phone Number");
                int phNo = sc.nextInt();
                System.out.println("Enter email");
                String email = sc.next();
                contact.setFirstName(FirstName);
                contact.setLastName(lastName);
                contact.setAddress(address);
                contact.setCity(city);
                contact.setState(state);
                contact.setZip(zip);
                contact.setPhoneNumber(phNo);
                contact.setEmail(email);
                break;
            }
        }
        if(flag==false){
            System.out.println("Contact not present in the book");
        }
        System.out.println(ContactList);
    }

    @Override
    public void deleteContact(String firstName) {

        boolean flag= false;
        for(Contacts contacts : ContactList){
            if(contacts.getFirstName().equals(firstName)){
                flag= true;
                ContactList.remove(contacts);
                System.out.println("Contact deleted");
                break;
            }
        }
        if(flag==false){
            System.out.println("Contact not present in the book");
        }
        System.out.println(ContactList);
    }

}
