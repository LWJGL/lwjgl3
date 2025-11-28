/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke FT_Incremental_FreeGlyphDataFunc} */
@FunctionalInterface
@NativeType("FT_Incremental_FreeGlyphDataFunc")
public interface FT_Incremental_FreeGlyphDataFuncI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_void,
            ffi_type_pointer, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
    }

    /** {@code void (* FT_Incremental_FreeGlyphDataFunc) (FT_Incremental incremental, FT_Data * data)} */
    void invoke(@NativeType("FT_Incremental") long incremental, @NativeType("FT_Data *") long data);

}