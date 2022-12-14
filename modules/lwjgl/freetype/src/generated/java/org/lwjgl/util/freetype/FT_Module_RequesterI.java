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
 * FT_Module_Interface (*{@link #invoke}) (
 *     FT_Module module,
 *     char const *name
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("FT_Module_Requester")
public interface FT_Module_RequesterI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** A function used to query a given module for a specific interface. */
    @NativeType("FT_Module_Interface") long invoke(@NativeType("FT_Module") long module, @NativeType("char const *") long name);

}