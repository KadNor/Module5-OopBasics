/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package models;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Contact implements Serializable {

    private String name;
    private List<ContactData> contactData;

    public Contact(@NotNull final String name) {
        this.name = name;
        this.contactData = new ArrayList<>();
    }

    public Contact(@NotNull final String name, final List<ContactData> contactData) {
        this.name = name;
        this.contactData = new ArrayList<>(contactData);
    }

    public String getName() {
        return name;
    }

    public void setName(@NotNull final String name) {
        this.name = name;
    }

    public List<ContactData> getContactData() {
        return new ArrayList<>(contactData);
    }

    public void setContactData(final List<ContactData> contactData) {
        this.contactData = new ArrayList<>(contactData);
    }
}
