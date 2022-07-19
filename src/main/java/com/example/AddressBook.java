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
            if(input==1){
                iAddressBook.addContacts();
                break;
            }
            else{
                System.exit(0);
            }
        }
    }
}
