/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke op_read_func} */
@FunctionalInterface
@NativeType("op_read_func")
public interface OPReadFuncI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_sint32,
            ffi_type_pointer, ffi_type_pointer, ffi_type_sint32
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code int (* op_read_func) (void * _stream, unsigned char * _ptr, int _nbytes)} */
    int invoke(@NativeType("void *") long _stream, @NativeType("unsigned char *") long _ptr, int _nbytes);

}