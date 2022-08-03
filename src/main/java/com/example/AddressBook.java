package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    public List<Contacts> addContactToAddressBook() {

        List<Contacts> contact=new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        IAddressBook iAddressBook = new AddressBookOperations();

        while (true) {
            System.out.println("Enter 1 to Add contact");
            System.out.println("Enter 2 to Edit contact");
            System.out.println("Enter 3 to Delete contact");
            System.out.println("Enter 0 to Exit");
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            switch (input) {
                case 1:
                    iAddressBook.addContacts();
                    break;
                case 2:
                    String firstname = sc.next();
                    iAddressBook.editContact(firstname);
                    break;
                case 3:
                    String firstName = sc.next();
                    iAddressBook.deleteContact(firstName);
                    break;

            }
        }
        contact =iAddressBook.returnContact();
        return contact;
    }

}
