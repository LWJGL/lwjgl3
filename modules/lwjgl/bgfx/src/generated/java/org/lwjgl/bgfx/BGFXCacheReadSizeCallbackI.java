/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Returns the size of a cached item. Returns 0 if no cached item was found.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * uint32_t (*) (
 *     bgfx_callback_interface_t *_this,
 *     uint64_t _id
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("uint32_t (*) (bgfx_callback_interface_t *, uint64_t)")
public interface BGFXCacheReadSizeCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_uint64
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetLong(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * Will be called to determine size of cached item.
     *
     * @param _this the callback interface
     * @param _id   cache id
     *
     * @return number of bytes to read
     */
    @NativeType("uint32_t") int invoke(@NativeType("bgfx_callback_interface_t *") long _this, @NativeType("uint64_t") long _id);

}