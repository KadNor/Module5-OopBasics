/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package stores;

import services.AddressBook;

public interface Store {

    String LOCATION = "storeFile";

    void store(AddressBook book);

    AddressBook load();
}
