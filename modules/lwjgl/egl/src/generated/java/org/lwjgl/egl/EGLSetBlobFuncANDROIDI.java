/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke EGLSetBlobFuncANDROID} */
@FunctionalInterface
@NativeType("EGLSetBlobFuncANDROID")
public interface EGLSetBlobFuncANDROIDI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
    }

    /** {@code void (* EGLSetBlobFuncANDROID) (void const * key, EGLsizeiANDROID keySize, void const * value, EGLsizeiANDROID valueSize)} */
    void invoke(@NativeType("void const *") long key, @NativeType("EGLsizeiANDROID") long keySize, @NativeType("void const *") long value, @NativeType("EGLsizeiANDROID") long valueSize);

}