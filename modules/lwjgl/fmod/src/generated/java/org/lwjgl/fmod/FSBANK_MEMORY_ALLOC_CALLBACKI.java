/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke FSBANK_MEMORY_ALLOC_CALLBACK} */
@FunctionalInterface
@NativeType("FSBANK_MEMORY_ALLOC_CALLBACK")
public interface FSBANK_MEMORY_ALLOC_CALLBACKI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_pointer,
        ffi_type_uint32, ffi_type_uint32, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetInt(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** {@code void * (* FSBANK_MEMORY_ALLOC_CALLBACK) (unsigned int size, unsigned int type, char const * sourceStr)} */
    @NativeType("void *") long invoke(@NativeType("unsigned int") int size, @NativeType("unsigned int") int type, @NativeType("char const *") long sourceStr);

}