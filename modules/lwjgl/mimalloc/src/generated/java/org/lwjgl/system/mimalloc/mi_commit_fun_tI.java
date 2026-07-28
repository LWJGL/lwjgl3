/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.mimalloc;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke mi_commit_fun_t} */
@FunctionalInterface
@NativeType("mi_commit_fun_t")
public interface mi_commit_fun_tI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        mi_commit_fun_tI.class,
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_uint8,
            ffi_type_uint8, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        boolean __result = invoke(
            memGetByte(memGetAddress(args)) != 0,
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code bool (* mi_commit_fun_t) (bool commit, void * start, size_t size, bool * is_zero, void * user_arg)} */
    @NativeType("bool") boolean invoke(@NativeType("bool") boolean commit, @NativeType("void *") long start, @NativeType("size_t") long size, @NativeType("bool *") long is_zero, @NativeType("void *") long user_arg);

}