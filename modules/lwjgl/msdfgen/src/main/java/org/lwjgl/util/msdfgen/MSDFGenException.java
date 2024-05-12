/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.msdfgen;

/**
 * A general exception type used by {@link MSDFGenUtil} and {@link MSDFGenFont}.
 *
 * @author Alexander Hinze
 */
public class MSDFGenException extends RuntimeException {
    public MSDFGenException() {
        super();
    }
    public MSDFGenException(String message) {
        super(message);
    }
    public MSDFGenException(String message, Throwable cause) {
        super(message, cause);
    }
    public MSDFGenException(Throwable cause) {
        super(cause);
    }
    protected MSDFGenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
