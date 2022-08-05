package com.example;

import java.util.*;
import java.util.stream.Collectors;

public class BookOperation {

    AddressBook addressBook=new AddressBook();
    Scanner sc=new Scanner(System.in);
    Map<String, List<Contacts>> book=new HashMap<>();

    //Class Book Operations to Perform Book Operation
    //Method to create a Address Book
    public void createAddressBook(){
        System.out.println("Enter new Book Name");
        String bookName= sc.next();
        book.put(bookName,addressBook.addContactToAddressBook());
        System.out.println("Created Book: "+book);
    }
    public void search(){
        System.out.println("Enter new Book Name");
        String bookName= sc.next();
        System.out.println("Enter City");
        String city = sc.next();
        List<Contacts> contacts=book.get(bookName);
        List<String> name=new ArrayList<>();
        //Using Java Streams to filter out the objects
        List<Contacts> cityDetails=contacts.stream().filter((a)->a.getCity().equals(city)).collect(Collectors.toList());
        for(Contacts contact:cityDetails ){
            name.add(contact.getFirstName());
        }
        System.out.println("The first names are:- "+name);
    }

    //Method to Search inside the Address Book
    public void sortPerson(){
        boolean exit=true;
        while(true){
            System.out.println("Enter 1 to sort by Name");
            System.out.println("Enter 2 to sort by city");
            System.out.println("Enter 3 to sort by State");
            int input=sc.nextInt();

            switch (input){
                case 1:
                    System.out.println("Enter the book Name");
                    List<Contacts>contacts=book.get(sc.next());
                    List<String>nameSort=contacts.stream().map(a->a.toString()).sorted().collect(Collectors.toList());
                    System.out.println(nameSort);
                    break;
                case 2:
                    System.out.println("Enter the book Name");
                    contacts=book.get(sc.next());
                    Comparator<Contacts> city = Comparator.comparing(Contacts::getCity);
                    //Using Java Streams to filter out the objects
                    List<Contacts> citySort = contacts.stream().sorted(city).collect(Collectors.toList());
                    System.out.println(" City "+ citySort);
                    break;
                case 3:
                    System.out.println("Enter the book Name");
                    String bookName= sc.next();
                    contacts=book.get(bookName);
                    Comparator<Contacts> state = Comparator.comparing(Contacts::getState);
                    //Using Java Streams to filter out the objects
                    List<Contacts> stateSort = contacts.stream().sorted(state).collect(Collectors.toList());
                    System.out.println(" State "+ stateSort);
                     break;
                case 4:
                    System.exit(0);
            }

        }
    }

    //    View Person Function to View the Person on city and state
    public void viewPerson(){
        boolean exit=false;
        while (true) {
            System.out.println("Enter 1 for Search Person By City");
            System.out.println("Enter 2 for Search Person By State");
            int count = 0;
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter book Name");
                    String bookName = sc.next();
                    System.out.println("Enter City");
                    String city = sc.next();

                    List<Contacts> contacts = book.get(bookName);
                    //Using Java Streams to filter out the objects
                    List<Contacts> nameOfContact = contacts.stream().filter(a -> a.getCity().equals(city)).collect(Collectors.toList());
                    System.out.println("Person Details In the City " + city + " -> " + nameOfContact);
                    for(Contacts contacts1 : nameOfContact)
                    {
                        count++;
                    }
                    System.out.println("Count of Person in the City " + city + " = " + count);
                    break;
                case 2:
                    System.out.println("Enter book Name");
                    bookName = sc.next();
                    System.out.println("Enter State");
                    String state = sc.next();
                    contacts = book.get(bookName);
                    /*
                    Using Java Streams to filter out the objects that are having State same as the user input
                     */
                    nameOfContact = contacts.stream().filter(a -> a.getState().equals(state)).collect(Collectors.toList());
                    System.out.println("Person Details In the State " + state + " -> " + nameOfContact);
                    for(Contacts contacts1 : nameOfContact)
                    {
                         count++;
                    }
                    System.out.println("Count of Person in the State " + state + " = " + count);
                    break;
                default:
                    exit = true;
                    break;
            }
            /*
            Exit from the loop
             */
            if(exit == true)
            {
                break;
            }
        }

    }


}
