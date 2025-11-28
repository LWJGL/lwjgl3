/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke nk_plugin_filter} */
@FunctionalInterface
@NativeType("nk_plugin_filter")
public interface NkPluginFilterI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_uint8,
            ffi_type_pointer, ffi_type_uint32
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        boolean __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code nk_bool (* nk_plugin_filter) (struct nk_text_edit const * edit, nk_rune unicode)} */
    @NativeType("nk_bool") boolean invoke(@NativeType("struct nk_text_edit const *") long edit, @NativeType("nk_rune") int unicode);

}