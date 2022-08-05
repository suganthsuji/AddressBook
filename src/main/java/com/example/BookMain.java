package com.example;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        BookOperation bookOperation=new BookOperation();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter 1 to Create AddressBook");
            System.out.println("Enter 2 to Search in AddressBook");
            System.out.println("Enter 3 to View AddressBook");
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


                default:
                    System.exit(0);
                    break;
            }
        }

    }
}
