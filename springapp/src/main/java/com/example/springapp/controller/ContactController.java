package com.example.springapp.controller;


import com.example.springapp.model.Contact;
import com.example.springapp.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contacts")
public class ContactController {
   
    @Autowired
    public ContactService contactService;

    @PostMapping
    public boolean addContact(@RequestBody Contact contact) {
        return contactService.addContact(contact);
    }
    
    @GetMapping("/{contactId}")
    public Optional<Contact> getContactById(@PathVariable int contactId) {
        return contactService.getContactById(contactId);
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }
}
