/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be set to the {@link OpusEncCallbacks}.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * int (*{@link #invoke}) (
 *     void *user_data,
 *     unsigned char const *ptr,
 *     opus_int32 len
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ope_write_func")
public interface OPEWriteFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_pointer, ffi_type_sint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * Called for writing a page.
     *
     * @param user_data user-defined data passed to the callback
     * @param ptr       buffer to be written
     * @param len       number of bytes to be written
     *
     * @return error code; {@code 0: success}, {@code 1: failure}
     */
    int invoke(@NativeType("void *") long user_data, @NativeType("unsigned char const *") long ptr, @NativeType("opus_int32") int len);

}