/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@code skip} field of the {@link STBIIOCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     void *user,
 *     int n
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (void *, int)")
public interface STBISkipCallbackI extends CallbackI.V {

    String SIGNATURE = "(pi)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgInt(args)
        );
    }

    /**
     * The {@code stbi_io_callbacks.skip} callback.
     *
     * @param user a pointer to user data
     * @param n    the number of bytes to skip if positive, or <em>unget</em> the last {@code -n} bytes if negative
     */
    void invoke(@NativeType("void *") long user, int n);

}