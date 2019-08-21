/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package models;

import com.sun.istack.internal.NotNull;

public class Phone extends ContactData {

    private String number;

    public Phone(@NotNull final String number, final ContactDataType type) {
        super(type);

        this.number = number;
        this.type = type;
    }

    public Phone(@NotNull final String number) {
        super();

        this.number = number;
        this.type = ContactDataType.MAIN;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(@NotNull final String number) {
        this.number = number;
    }

    @Override
    public String getContactInformation() {
        return String.format("Phone number: %s", number);
    }
}
