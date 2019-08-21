/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package models;

import java.io.Serializable;

public abstract class ContactData implements Serializable {

    protected ContactDataType type;

    public ContactData() {
        type = ContactDataType.MAIN;
    }

    public ContactData(final ContactDataType type) {
        this.type = type != null ? type : ContactDataType.MAIN;
    }

    public String getContactInformation() {
        return String.format("Contact type: %s", type);
    }

    public ContactDataType getType() {
        return type;
    }

    public void setType(final ContactDataType type) {
        this.type = type != null ? type : ContactDataType.MAIN;
    }
}
