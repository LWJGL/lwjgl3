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
 * void * (*{@link #invoke}) (
 *     uint64_t allocId
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void * (*) (uint64_t)")
public interface ktxVulkanTexture_subAllocatorFreeMemFuncPtrI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_pointer,
        ffi_type_uint64
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetLong(memGetAddress(args))
        );
        apiClosureRetP(ret, __result);
    }

    /** The free procurement function. */
    @NativeType("void *") long invoke(@NativeType("uint64_t") long allocId);

}