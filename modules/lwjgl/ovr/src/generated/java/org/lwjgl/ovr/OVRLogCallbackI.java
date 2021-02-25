/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be passed to the {@code LogCallback} member of the {@link OVRInitParams} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     uintptr_t userData,
 *     int level,
 *     char const *message
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("ovrLogCallback")
public interface OVRLogCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_sint32, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
    }

    /**
     * The logging callback.
     *
     * @param userData an arbitrary value specified by the user of ovrInitParams
     * @param level    one of the {@code ovrLogLevel} constants
     * @param message  a UTF8-encoded null-terminated string
     */
    void invoke(@NativeType("uintptr_t") long userData, int level, @NativeType("char const *") long message);

}