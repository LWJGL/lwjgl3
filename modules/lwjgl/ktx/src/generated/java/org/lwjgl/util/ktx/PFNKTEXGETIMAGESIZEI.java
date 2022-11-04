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
 * ktx_size_t (*{@link #invoke}) (
 *     ktxTexture *This,
 *     ktx_uint32_t level
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("PFNKTEXGETIMAGESIZE")
public interface PFNKTEXGETIMAGESIZEI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    @NativeType("ktx_size_t") long invoke(@NativeType("ktxTexture *") long This, @NativeType("ktx_uint32_t") int level);

}