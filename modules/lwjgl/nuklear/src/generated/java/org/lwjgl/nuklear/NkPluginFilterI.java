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
 * Instances of this interface may be set to the {@link NkTextEdit} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * nk_bool (*{@link #invoke}) (
 *     struct nk_text_edit const *edit,
 *     nk_rune unicode
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("nk_plugin_filter")
public interface NkPluginFilterI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint8,
        ffi_type_pointer, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        boolean __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    @NativeType("nk_bool") boolean invoke(@NativeType("struct nk_text_edit const *") long edit, @NativeType("nk_rune") int unicode);

}