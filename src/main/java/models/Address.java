/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package models;

import com.sun.istack.internal.NotNull;

public class Address extends ContactData {

    private String city;
    private String street;
    private int number;
    private int postalCode;

    public Address(
            @NotNull final String city,
            @NotNull final String street,
            final int number,
            final int postalCode,
            final ContactDataType type) {
        super(type);

        this.city = city;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
    }

    public Address(
            @NotNull final String city,
            @NotNull final String street,
            final int number,
            final int postalCode) {
        super();

        this.city = city;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(@NotNull final String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(@NotNull final String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(final int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String getContactInformation() {
        return String.format("City: %s, Str: %s, Nr: %d, Postal code: %d, %s", city, street, number, postalCode, super.getContactInformation());
    }
}
