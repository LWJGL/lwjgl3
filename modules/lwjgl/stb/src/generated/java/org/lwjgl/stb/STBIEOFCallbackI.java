/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@code eof} field of the {@link STBIIOCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * int (*) (
 *     void *user
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("int (*) (void *)")
public interface STBIEOFCallbackI extends CallbackI.I {

    String SIGNATURE = "(p)i";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default int callback(long args) {
        return invoke(
            dcbArgPointer(args)
        );
    }

    /**
     * The {@code stbi_io_callbacks.eof} callback.
     *
     * @param user a pointer to user data
     *
     * @return nonzero if we are at the end of file/data
     */
    int invoke(@NativeType("void *") long user);

}