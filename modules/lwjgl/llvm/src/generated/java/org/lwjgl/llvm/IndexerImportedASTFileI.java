/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@code importedASTFile} field of the {@link IndexerCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * CXIdxClientASTFile (*) (
 *     CXClientData client_data,
 *     CXIdxImportedASTFileInfo const *info
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("CXIdxClientASTFile (*) (CXClientData, CXIdxImportedASTFileInfo const *)")
public interface IndexerImportedASTFileI extends CallbackI.P {

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

    /** The {@code IndexerCallbacks.importedASTFile} callback. */
    @NativeType("CXIdxClientASTFile") long invoke(@NativeType("CXClientData") long client_data, @NativeType("CXIdxImportedASTFileInfo const *") long info);

}