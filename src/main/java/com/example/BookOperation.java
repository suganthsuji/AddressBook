package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookOperation {

    AddressBook addressBook=new AddressBook();
    Scanner sc=new Scanner(System.in);
    Map<String, List<Contacts>> book=new HashMap<>();

    public void createAddressBook(){
        System.out.println("Enter new Book Name");
        String bookName= sc.next();
        book.put(bookName,addressBook.addContactToAddressBook());
        System.out.println("Created Book: "+book);
    }


}
