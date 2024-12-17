/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke FT_Stream_IoFunc} */
@FunctionalInterface
@NativeType("FT_Stream_IoFunc")
public interface FT_Stream_IoFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_ulong,
        ffi_type_pointer, ffi_type_ulong, ffi_type_pointer, ffi_type_ulong
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetCLong(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetCLong(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code unsigned long (* FT_Stream_IoFunc) (FT_Stream stream, unsigned long offset, unsigned char * buffer, unsigned long count)} */
    @NativeType("unsigned long") long invoke(@NativeType("FT_Stream") long stream, @NativeType("unsigned long") long offset, @NativeType("unsigned char *") long buffer, @NativeType("unsigned long") long count);

}