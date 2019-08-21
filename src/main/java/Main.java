/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */

import java.util.Arrays;
import models.Address;
import models.Contact;
import models.ContactData;
import services.AddressBook;
import stores.SerializerStore;
import stores.Store;

public class Main {

    public static void main(String[] args) {
        Store store = new SerializerStore();
        AddressBook addressBook = new AddressBook();

        Contact contact = new Contact("Norbi");
        ContactData address = new Address("Cluj", "Creative Street", 4, 123456);
        contact.setContactData(Arrays.asList(address));

        addressBook.add(contact);

        store.store(addressBook);
        System.out.println(store.load().find("Norbi").get().getName());
    }
}
