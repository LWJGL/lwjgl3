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
 * ktx_bool_t (*{@link #invoke}) (
 *     ktxTexture *This
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("PFNKTEXNEEDSTRANSCODING")
public interface PFNKTEXNEEDSTRANSCODINGI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_uint8,
        ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        boolean __result = invoke(
            memGetAddress(memGetAddress(args))
        );
        apiClosureRet(ret, __result);
    }

    @NativeType("ktx_bool_t") boolean invoke(@NativeType("ktxTexture *") long This);

}