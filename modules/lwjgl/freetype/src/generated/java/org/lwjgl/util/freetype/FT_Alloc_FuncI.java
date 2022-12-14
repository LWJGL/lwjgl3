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

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*{@link #invoke}) (
 *     FT_Memory memory,
 *     long size
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("FT_Alloc_Func")
public interface FT_Alloc_FuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_slong
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetCLong(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** A function used to allocate {@code size} bytes from {@code memory}. */
    @NativeType("void *") long invoke(@NativeType("FT_Memory") long memory, long size);

}