/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package services;

import exceptions.InvalidContactException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import models.Contact;

public class AddressBook implements Serializable {

    private Map<String, Contact> contacts;

    public AddressBook() {
        this.contacts = new HashMap<>();
    }

    public AddressBook(final Map<String, Contact> contacts) {
        this.contacts = new HashMap<>(contacts);
    }

    public void add(final Contact contact) {
        String contactName = contact.getName();

        if (!contacts.containsKey(contactName)) {
            contacts.put(contactName, new Contact(contactName, contact.getContactData()));
        } else {
            throw new InvalidContactException("Name duplication is not permitted!");
        }
    }

    public boolean delete(final String contactName) {
        if (contactName == null) {
            throw new InvalidContactException("Cannot delete contact with name: null");
        }

        boolean result = false;

        if (contacts.containsKey(contactName)) {
            contacts.remove(contactName);
            result = true;
        }

        return result;
    }

    public Optional<Contact> find(final String contactName) {
        if (contactName == null) {
            throw new InvalidContactException("Cannot find contact with name: null");
        }

        Optional<Contact> result = Optional.empty();

        if (contacts.containsKey(contactName)) {
            Contact contact = contacts.get(contactName);

            result = Optional.of(new Contact(contactName, contact.getContactData()));
        }

        return result;
    }
}
