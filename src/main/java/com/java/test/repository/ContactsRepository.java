package com.java.test.repository;

import com.java.test.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Repository
@RepositoryRestResource(collectionResourceRel = "contact", path = "contact")
public interface ContactsRepository extends JpaRepository<Contact, Integer> {

    Optional<Contact> findContactByAddress_PostalCode(@Param("postalCode") String postalCode);

}