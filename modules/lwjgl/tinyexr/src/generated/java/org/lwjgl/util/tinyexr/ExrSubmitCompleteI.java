/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke ExrSubmitComplete} */
@FunctionalInterface
@NativeType("ExrSubmitComplete")
public interface ExrSubmitCompleteI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        ExrSubmitCompleteI.class,
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_void,
            ffi_type_pointer, ffi_type_uint32
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE))
        );
    }

    /** {@code void (* ExrSubmitComplete) (void * userdata, ExrResult result)} */
    void invoke(@NativeType("void *") long userdata, @NativeType("ExrResult") int result);

}