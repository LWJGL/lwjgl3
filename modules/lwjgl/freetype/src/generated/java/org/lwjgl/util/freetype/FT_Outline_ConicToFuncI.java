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

/** Callback function: {@link #invoke FT_Outline_ConicToFunc} */
@FunctionalInterface
@NativeType("FT_Outline_ConicToFunc")
public interface FT_Outline_ConicToFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_sint32,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code int (* FT_Outline_ConicToFunc) (FT_Vector const * control, FT_Vector const * to, void * user)} */
    int invoke(@NativeType("FT_Vector const *") long control, @NativeType("FT_Vector const *") long to, @NativeType("void *") long user);

}