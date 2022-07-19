package com.example;

import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        IAddressBook iAddressBook=new AddressBookOperations();

        while(true){
            System.out.println("Enter 1 to Add contact");
            System.out.println("Enter 0 to Exit");
            int input=sc.nextInt();
            if(input==0){
                break;
            }
            switch(input){
                case 1:
                    iAddressBook.addContacts();
                    break;
                case 2:
                    String firstname = sc.next();
                    iAddressBook.editContact(firstname);
                    break;
                case 3:
                    String firstName=sc.next();
                    iAddressBook.deleteContact(firstName);
                    break;

            }
        }
    }
}
