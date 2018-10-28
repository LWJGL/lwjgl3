/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@code abortQuery} field of the {@link IndexerCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * int (*) (
 *     CXClientData client_data,
 *     void *reserved
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("int (*) (CXClientData, void *)")
public interface IndexerAbortQueryI extends CallbackI.I {

    String SIGNATURE = "(pp)i";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default int callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /** The {@code IndexerCallbacks.abortQuery} callback. */
    int invoke(@NativeType("CXClientData") long client_data, @NativeType("void *") long reserved);

}