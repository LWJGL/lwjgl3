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
 * void (*) (
 *     void *user_data,
 *     shaderc_include_result *include_result
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("shaderc_include_result_release_fn")
public interface ShadercIncludeResultReleaseI extends CallbackI.V {

    String SIGNATURE = "(pp)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /** An includer callback type for destroying an include result. */
    void invoke(@NativeType("void *") long user_data, @NativeType("shaderc_include_result *") long include_result);

}