/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link Shaderc#shaderc_compile_options_set_include_callbacks compile_options_set_include_callbacks} function.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * shaderc_include_result * (*) (
 *     void *user_data,
 *     char const *requested_source,
 *     int type,
 *     char const *requesting_source,
 *     size_t include_depth
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("shaderc_include_resolve_fn")
public interface ShadercIncludeResolveI extends CallbackI.P {

    String SIGNATURE = "(ppipp)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
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