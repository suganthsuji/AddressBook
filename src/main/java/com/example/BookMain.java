package com.example;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        BookOperation bookOperation=new BookOperation();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter 1 to Create AddressBook");
            int input=sc.nextInt();
            switch (input){
                case 1:
                    bookOperation.createAddressBook();
                    break;

                default:
                    System.exit(0);
                    break;
            }
        }

    }
}
