/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package stores;

import exceptions.StoreException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import services.AddressBook;

public class SerializerStore implements Store {

    @Override
    public void store(final AddressBook objectToStore) throws StoreException {
        try (FileOutputStream out = new FileOutputStream(Store.LOCATION)) {
            ObjectOutputStream outputStream = new ObjectOutputStream(out);
            outputStream.writeObject(objectToStore);
            outputStream.close();
        } catch (IOException e) {
            throw new StoreException("Cannot store element!", e);
        }
    }

    @Override
    public AddressBook load() {
        try (FileInputStream in = new FileInputStream(Store.LOCATION)) {
            ObjectInputStream inputStream = new ObjectInputStream(in);
            return (AddressBook) inputStream.readObject();
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            throw new StoreException("Cannot load element!", e);
        }
    }
}
