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
 * void (*) (
 *     struct aiFileIO *pFileIO,
 *     struct aiFile *pFile
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("aiFileCloseProc")
public interface AIFileCloseProcI extends CallbackI.V {

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

    /**
     * File close procedure
     *
     * @param pFileIO FileIO system pointer
     * @param pFile   File pointer to close
     */
    void invoke(@NativeType("struct aiFileIO *") long pFileIO, @NativeType("struct aiFile *") long pFile);

}