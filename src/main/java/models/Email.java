/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package models;

import com.sun.istack.internal.NotNull;

public class Email extends ContactData {

    private String email;

    public Email(final ContactDataType type, final String email) {
        super(type);
        this.email = email;
    }

    public Email(@NotNull final String email) {
        super();
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(@NotNull final String email) {
        this.email = email;
    }

    @Override
    public String getContactInformation() {
        return String.format("Email: %s, %s", email, super.getContactInformation());
    }
}
