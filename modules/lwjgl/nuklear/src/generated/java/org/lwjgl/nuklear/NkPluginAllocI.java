/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*) (
 *     nk_handle handle,
 *     void *old,
 *     nk_size size
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("nk_plugin_alloc")
public interface NkPluginAllocI extends CallbackI.P {

    String SIGNATURE = "(ppp)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    @NativeType("void *") long invoke(@NativeType("nk_handle") long handle, @NativeType("void *") long old, @NativeType("nk_size") long size);

}