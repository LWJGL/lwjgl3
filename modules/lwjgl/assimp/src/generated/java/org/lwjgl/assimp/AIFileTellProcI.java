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
 * size_t (*) (
 *     struct aiFile *pFile
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("aiFileTellProc")
public interface AIFileTellProcI extends CallbackI.P {

    String SIGNATURE = "(p)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args)
        );
    }

    /**
     * File tell procedure.
     *
     * @param pFile File pointer to find ftell() on
     */
    @NativeType("size_t") long invoke(@NativeType("struct aiFile *") long pFile);

}