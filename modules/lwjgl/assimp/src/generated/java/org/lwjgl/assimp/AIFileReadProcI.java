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
 *     struct aiFile *pFile,
 *     char *pBuffer,
 *     size_t size,
 *     size_t count
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("aiFileReadProc")
public interface AIFileReadProcI extends CallbackI.P {

    String SIGNATURE = "(pppp)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /**
     * File read procedure
     *
     * @param pFile   File pointer to read from
     * @param pBuffer The buffer to read the values
     * @param size    Size in bytes of each element to be read
     * @param count   Number of elements to be read
     */
    @NativeType("size_t") long invoke(@NativeType("struct aiFile *") long pFile, @NativeType("char *") long pBuffer, @NativeType("size_t") long size, @NativeType("size_t") long count);

}