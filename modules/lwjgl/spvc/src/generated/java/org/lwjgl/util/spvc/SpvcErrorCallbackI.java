/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spvc;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link Spvc#spvc_context_set_error_callback context_set_error_callback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     void *userdata,
 *     char const *error
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("spvc_error_callback")
public interface SpvcErrorCallbackI extends CallbackI.V {

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

    /** Get notified in a callback when an error triggers. Useful for debugging. */
    void invoke(@NativeType("void *") long userdata, @NativeType("char const *") long error);

}