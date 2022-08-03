package com.example;

import java.util.List;

public interface IAddressBook {

    void addContacts();
    void editContact(String firstName);
    void deleteContact(String firstName);
    List<Contacts> returnContact();


}
