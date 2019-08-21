/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package stores;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import exceptions.StoreException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import services.AddressBook;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class JsonStore implements Store {

    @Override
    public void store(final AddressBook book) {
        // Due to the abstract ContactData class json serialization is not possible without code pollution.
        throw new NotImplementedException();

//        Gson gson = new Gson();
//
//        try (FileWriter fileWriter = new FileWriter(Store.LOCATION + ".json")) {
//
//            GsonBuilder gsonBuilder = new GsonBuilder();
//            gsonBuilder.excludeFieldsWithModifiers(Modifier.STATIC, Modifier.FINAL);
//            gson.toJson(book, fileWriter);
//        } catch (IOException | JsonIOException e) {
//            throw new StoreException("Cannot store data to JsonStore!", e);
//        }
    }

    @Override
    public AddressBook load() {
        Gson gson = new Gson();

        try (Reader reader = new FileReader(Store.LOCATION + ".json")) {
            return gson.fromJson(reader, AddressBook.class);
        } catch (IOException e) {
            throw new StoreException("Cannot read JsonStore!", e);
        } catch (JsonSyntaxException | JsonIOException e) {
            throw new StoreException("The stored data is invalid!", e);
        }
    }
}
