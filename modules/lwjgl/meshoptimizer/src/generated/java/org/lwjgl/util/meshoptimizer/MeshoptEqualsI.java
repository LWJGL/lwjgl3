/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meshoptimizer;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke (* anonymous)} */
@FunctionalInterface
@NativeType("int (*) (void *, unsigned int, unsigned int)")
public interface MeshoptEqualsI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_uint32, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code int (*) (void * context, unsigned int index_a, unsigned int index_b)} */
    int invoke(@NativeType("void *") long context, @NativeType("unsigned int") int index_a, @NativeType("unsigned int") int index_b);

}