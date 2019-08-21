/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package models;

/**
 * Most of the data that the {@link ContactData} classes store have different types. The stored data might refer to personal or work related information as
 * well. This enum provides the types which can be used by the {@link ContactData} classes.
 */
public enum ContactDataType {
    MAIN,
    HOME,
    WORK
}
