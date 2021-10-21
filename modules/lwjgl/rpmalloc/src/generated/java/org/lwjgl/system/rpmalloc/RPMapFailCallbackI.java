/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be set to the {@link RPMallocConfig} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * int (*{@link #invoke}) (
 *     size_t size
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("int (*) (size_t)")
public interface RPMapFailCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_sint32,
        ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * Called when a call to map memory pages fails (out of memory).
     * 
     * <p>If this callback is not set or returns zero the library will return a null pointer in the allocation call. If this callback returns non-zero the
     * map call will be retried. The argument passed is the number of bytes that was requested in the map call. Only used if the default system memory map
     * function is used ({@code memory_map} callback is not set).</p>
     */
    int invoke(@NativeType("size_t") long size);

}