/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * KTX_error_code (*{@link #invoke}) (
 *     ktxStream *str,
 *     ktx_off_t * const offset
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ktxStream_getpos")
public interface ktxStream_getposI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** Type for a pointer to a stream position query function. */
    @NativeType("KTX_error_code") int invoke(@NativeType("ktxStream *") long str, @NativeType("ktx_off_t * const") long offset);

}