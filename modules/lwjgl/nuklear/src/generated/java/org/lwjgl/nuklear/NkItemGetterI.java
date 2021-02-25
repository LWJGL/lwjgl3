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
 * Instances of this interface may be passed to the {@link Nuklear#nk_combo_callback combo_callback} and {@link Nuklear#nk_combobox_callback combobox_callback} functions.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * float (*) (
 *     void *userdata,
 *     int selected,
 *     char const **item
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("nk_item_getter")
public interface NkItemGetterI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_float,
        ffi_type_pointer, ffi_type_sint32, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        float __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    float invoke(@NativeType("void *") long userdata, int selected, @NativeType("char const **") long item);

}