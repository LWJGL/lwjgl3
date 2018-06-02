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
 * struct aiFile * (*) (
 *     struct aiFileIO *pFileIO,
 *     char const *fileName,
 *     char const *openMode
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("aiFileOpenProc")
public interface AIFileOpenProcI extends CallbackI.P {

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

    /**
     * File open procedure
     *
     * @param pFileIO  FileIO system pointer
     * @param fileName The name of the file to be opened
     * @param openMode The mode in which to open the file
     */
    @NativeType("struct aiFile *") long invoke(@NativeType("struct aiFileIO *") long pFileIO, @NativeType("char const *") long fileName, @NativeType("char const *") long openMode);

}