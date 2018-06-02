/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * aiReturn (*) (
 *     struct aiFile *pFile,
 *     size_t offset,
 *     aiOrigin origin
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("aiFileSeek")
public interface AIFileSeekI extends CallbackI.I {

    String SIGNATURE = "(ppi)i";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default int callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args)
        );
    }

    /**
     * File seek procedure
     *
     * @param pFile  File pointer to seek to
     * @param offset Number of bytes to shift from origin
     * @param origin Position used as reference for the offset.
     */
    @NativeType("aiReturn") int invoke(@NativeType("struct aiFile *") long pFile, @NativeType("size_t") long offset, @NativeType("aiOrigin") int origin);

}