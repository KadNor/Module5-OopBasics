/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package exceptions;

/**
 * It is thrown whenever the storage process fails.
 */
public class StoreException extends RuntimeException {

    public StoreException(final String message) {
        super(message);
    }

    public StoreException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
