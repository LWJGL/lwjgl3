/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke FT_Generic_Finalizer} */
@FunctionalInterface
@NativeType("FT_Generic_Finalizer")
public interface FT_Generic_FinalizerI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_void,
            ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args))
        );
    }

    /** {@code void (* FT_Generic_Finalizer) (void * object)} */
    void invoke(@NativeType("void *") long object);

}