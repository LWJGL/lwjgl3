/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.system.libffi.*;

/**
 * Interface for dynamically created native functions that call into Java code (upcalls).
 *
 * <p>Pointers to such functions can be passed to native APIs as callbacks.</p>
 */
public interface CallbackI extends Pointer {

    /**
     * Returns the libffi Call Interface for this callback function. [INTERNAL API]
     *
     * @return the CIF structure for this callback function
     */
    FFICIF getCallInterface();

    @Override
    default long address() {
        return Callback.create(getCallInterface(), this);
    }

    /**
     * The Java method that will be called from native code when the native callback function is invoked.
     *
     * @param ret  a pointer to the memory used for the function's return value.
     *
     *             <p>If the function is declared as returning {@code v}oid, then this value is garbage and should not be used.</p>
     *
     *             <p>Otherwise, the callback must fill the object to which this points, following the same special promotion behavior as
     *             {@link LibFFI#ffi_call}.  That is, in most cases, {@code ret} points to an object of exactly the size of the type specified when {@code CIF}
     *             was constructed.  However, integral types narrower than the system register size are widened. In these cases your program may assume that
     *             {@code ret} points to an {@code ffi_arg} object.</p>
     * @param args a vector of pointers to memory holding the arguments to the function
     */
    void callback(long ret, long args);

}
