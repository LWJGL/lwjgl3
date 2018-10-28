/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@code enteredMainFile} field of the {@link IndexerCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * CXIdxClientFile (*) (
 *     CXClientData client_data,
 *     CXFile mainFile,
 *     void *reserved
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("CXIdxClientFile (*) (CXClientData, CXFile, void *)")
public interface IndexerEnteredMainFileI extends CallbackI.P {

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

    /** The {@code IndexerCallbacks.enteredMainFile} callback. */
    @NativeType("CXIdxClientFile") long invoke(@NativeType("CXClientData") long client_data, @NativeType("CXFile") long mainFile, @NativeType("void *") long reserved);

}