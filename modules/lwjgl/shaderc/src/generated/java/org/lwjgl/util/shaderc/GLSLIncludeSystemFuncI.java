/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke glsl_include_system_func} */
@FunctionalInterface
@NativeType("glsl_include_system_func")
public interface GLSLIncludeSystemFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** {@code glsl_include_result_t * (* glsl_include_system_func) (void * ctx, char const * header_name, char const * includer_name, size_t include_depth)} */
    @NativeType("glsl_include_result_t *") long invoke(@NativeType("void *") long ctx, @NativeType("char const *") long header_name, @NativeType("char const *") long includer_name, @NativeType("size_t") long include_depth);

}