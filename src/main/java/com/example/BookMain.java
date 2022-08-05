package com.example;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        //Main Function to Call the Respective Function for the Address Book Operations
        BookOperation bookOperation=new BookOperation();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            //Manual Driven code to Prompt the User to Create a Address Book
            System.out.println("Enter 1 to Create AddressBook");
            System.out.println("Enter 2 to Search in AddressBook");
            System.out.println("Enter 3 to View AddressBook");
            System.out.println("Enter 4 to Sort AddressBook");
            int input=sc.nextInt();
            switch (input){
                case 1:
                    bookOperation.createAddressBook();
                    break;
                case 2:
                    bookOperation.search();
                    break;
                case 3:
                    bookOperation.viewPerson();
                    break;
                case 4:
                    bookOperation.sortPerson();
                    break;

                default:
                    System.exit(0);
                    break;
            }
        }

    }
}
