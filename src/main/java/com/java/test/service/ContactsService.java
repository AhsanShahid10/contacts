package com.java.test.service;

import com.java.test.entity.Contact;
import com.java.test.repository.ContactsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class ContactsService {

    @Autowired
    private ContactsRepository contactsRepository;

    public Contact findByPostalCode(String code)
    {
        Contact contact =null;
        Optional<Contact> contactByAddress_postalCode = contactsRepository.findContactByAddress_PostalCode(code);
        if(contactByAddress_postalCode.isPresent())
        {
            contact= contactByAddress_postalCode.get();
        }
        return contact;
    }
}