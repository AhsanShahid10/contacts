package com.java.test.controller;

import com.java.test.entity.Contact;
import com.java.test.service.ContactsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@Slf4j
public class ContactsController {

    @Autowired
    private ContactsService contactsService;

    @GetMapping("/contact/findByPostalCode/{code}")
    public ResponseEntity<?> filter(

            @PathVariable String code) {

        Contact contact = null;
        contact = contactsService.findByPostalCode(code);
        if (contact == null) {
           return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(contact);


    }


}