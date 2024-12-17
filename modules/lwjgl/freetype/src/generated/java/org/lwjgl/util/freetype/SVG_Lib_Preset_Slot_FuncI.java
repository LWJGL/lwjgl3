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

/** Callback function: {@link #invoke SVG_Lib_Preset_Slot_Func} */
@FunctionalInterface
@NativeType("SVG_Lib_Preset_Slot_Func")
public interface SVG_Lib_Preset_Slot_FuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_sint32,
        ffi_type_pointer, ffi_type_uint8, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetByte(memGetAddress(args + POINTER_SIZE)) != 0,
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code FT_Error (* SVG_Lib_Preset_Slot_Func) (FT_GlyphSlot slot, FT_Bool cache, FT_Pointer * state)} */
    @NativeType("FT_Error") int invoke(@NativeType("FT_GlyphSlot") long slot, @NativeType("FT_Bool") boolean cache, @NativeType("FT_Pointer *") long state);

}