/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@code diagnostic} field of the {@link IndexerCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     CXClientData client_data,
 *     CXDiagnosticSet diagnosticSet,
 *     void *reserved
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (CXClientData, CXDiagnosticSet, void *)")
public interface IndexerDiagnosticI extends CallbackI.V {

    String SIGNATURE = "(ppp)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /** The {@code IndexerCallbacks.diagnostic} callback. */
    void invoke(@NativeType("CXClientData") long client_data, @NativeType("CXDiagnosticSet") long diagnosticSet, @NativeType("void *") long reserved);

}