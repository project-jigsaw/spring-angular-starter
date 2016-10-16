package com.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactsController {

    @Autowired
    ContactRepository contactRepository;

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public Iterable<Contact> getContacts() {
        return contactRepository.findAll();
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.POST)
    public Iterable<Contact> addContact(@RequestBody Contact contact) {
        contactRepository.save(contact);
        return contactRepository.findAll();
    }
}
