/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@code indexEntityReference} field of the {@link IndexerCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     CXClientData client_data,
 *     CXIdxEntityRefInfo const *info
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (CXClientData, CXIdxEntityRefInfo const *)")
public interface IndexerIndexEntityReferenceI extends CallbackI.V {

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

    /** The {@code IndexerCallbacks.indexEntityReference} callback. */
    void invoke(@NativeType("CXClientData") long client_data, @NativeType("CXIdxEntityRefInfo const *") long info);

}