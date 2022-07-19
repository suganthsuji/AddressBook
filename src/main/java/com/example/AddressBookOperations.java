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

}
