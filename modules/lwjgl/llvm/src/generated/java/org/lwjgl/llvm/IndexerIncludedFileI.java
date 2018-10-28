/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@code ppIncludedFile} field of the {@link IndexerCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * CXIdxClientFile (*) (
 *     CXClientData client_data,
 *     CXIdxIncludedFileInfo const *info
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("CXIdxClientFile (*) (CXClientData, CXIdxIncludedFileInfo const *)")
public interface IndexerIncludedFileI extends CallbackI.P {

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

    /** The {@code IndexerCallbacks.ppIncludedFile} callback. */
    @NativeType("CXIdxClientFile") long invoke(@NativeType("CXClientData") long client_data, @NativeType("CXIdxIncludedFileInfo const *") long info);

}