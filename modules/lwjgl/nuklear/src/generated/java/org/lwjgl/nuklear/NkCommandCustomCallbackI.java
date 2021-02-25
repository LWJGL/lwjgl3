/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*) (
 *     void *canvas,
 *     short x,
 *     short y,
 *     unsigned short w,
 *     unsigned short h,
 *     nk_handle callback_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("nk_command_custom_callback")
public interface NkCommandCustomCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_sint16, ffi_type_sint16, ffi_type_uint16, ffi_type_uint16, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetShort(memGetAddress(args + POINTER_SIZE)),
            memGetShort(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetShort(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetShort(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    @NativeType("void *") long invoke(@NativeType("void *") long canvas, short x, short y, @NativeType("unsigned short") short w, @NativeType("unsigned short") short h, @NativeType("nk_handle") long callback_data);

}