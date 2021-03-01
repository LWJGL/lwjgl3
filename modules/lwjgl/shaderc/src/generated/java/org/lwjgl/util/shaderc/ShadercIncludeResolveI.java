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

/**
 * Instances of this interface may be passed to the {@link Shaderc#shaderc_compile_options_set_include_callbacks compile_options_set_include_callbacks} function.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * shaderc_include_result * (*{@link #invoke}) (
 *     void *user_data,
 *     char const *requested_source,
 *     int type,
 *     char const *requesting_source,
 *     size_t include_depth
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("shaderc_include_resolve_fn")
public interface ShadercIncludeResolveI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer, ffi_type_sint32, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /**
     * An includer callback type for mapping an #include request to an include result.
     * 
     * <p>The {@code user_data} parameter specifies the client context. The {@code requested_source} parameter specifies the name of the source being requested.
     * The {@code type} parameter specifies the kind of inclusion request being made. The {@code requesting_source} parameter specifies the name of the source
     * containing the #include request. The includer owns the result object and its contents, and both must remain valid until the release callback is called
     * on the result object.</p>
     */
    @NativeType("shaderc_include_result *") long invoke(@NativeType("void *") long user_data, @NativeType("char const *") long requested_source, int type, @NativeType("char const *") long requesting_source, @NativeType("size_t") long include_depth);

}