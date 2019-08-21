/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package exceptions;

/**
 * It is thrown whenever invalid contact information is given to a method.
 */
public class InvalidContactException extends RuntimeException {

    public InvalidContactException(final String message) {
        super(message);
    }

    public InvalidContactException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
