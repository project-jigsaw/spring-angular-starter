package com.starter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ContactsController {

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public List<Contact> getContacts() {
        Contact firstContact = new Contact(1, "Tom", "1-202-555-1212");
        Contact secondContact = new Contact(2, "Dick", "1-900-OHH-YISS");
        Contact thirdContact = new Contact(3, "Harry", "1-800-BIG-GUNZ");

        return Arrays.asList(firstContact, secondContact, thirdContact);
    }
}
