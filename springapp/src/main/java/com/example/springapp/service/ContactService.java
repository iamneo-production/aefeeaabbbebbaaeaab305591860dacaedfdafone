package com.example.springapp.service;


import com.example.springapp.model.Contact;
import com.example.springapp.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    public ContactRepository contactRepository;

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Optional<Contact> getContactById(int contactId) {
        return contactRepository.findById(contactId);
    }

    public boolean addContact(Contact contact) {
        return contactRepository.save(contact)!=null?true:false;
    }
    
}
