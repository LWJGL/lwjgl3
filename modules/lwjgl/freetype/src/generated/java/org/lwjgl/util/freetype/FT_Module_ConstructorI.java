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
 * FT_Error (*{@link #invoke}) (
 *     FT_Module module
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("FT_Module_Constructor")
public interface FT_Module_ConstructorI extends CallbackI {

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

    /** A function used to initialize (not create) a new module object. */
    @NativeType("FT_Error") int invoke(@NativeType("FT_Module") long module);

}