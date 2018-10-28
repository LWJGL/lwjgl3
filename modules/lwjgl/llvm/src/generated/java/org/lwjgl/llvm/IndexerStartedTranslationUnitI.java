/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@code startedTranslationUnit} field of the {@link IndexerCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * CXIdxClientContainer (*) (
 *     CXClientData client_data,
 *     void *reserved
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("CXIdxClientContainer (*) (CXClientData, void *)")
public interface IndexerStartedTranslationUnitI extends CallbackI.P {

    String SIGNATURE = "(pp)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /** The {@code IndexerCallbacks.startedTranslationUnit} callback. */
    @NativeType("CXIdxClientContainer") long invoke(@NativeType("CXClientData") long client_data, @NativeType("void *") long reserved);

}