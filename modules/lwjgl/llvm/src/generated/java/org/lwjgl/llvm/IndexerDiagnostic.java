/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to the {@code diagnostic} field of the {@link IndexerCallbacks} struct.
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
public abstract class IndexerDiagnostic extends Callback implements IndexerDiagnosticI {

    /**
     * Creates a {@code IndexerDiagnostic} instance from the specified function pointer.
     *
     * @return the new {@code IndexerDiagnostic}
     */
    public static IndexerDiagnostic create(long functionPointer) {
        IndexerDiagnosticI instance = Callback.get(functionPointer);
        return instance instanceof IndexerDiagnostic
            ? (IndexerDiagnostic)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static IndexerDiagnostic createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code IndexerDiagnostic} instance that delegates to the specified {@code IndexerDiagnosticI} instance. */
    public static IndexerDiagnostic create(IndexerDiagnosticI instance) {
        return instance instanceof IndexerDiagnostic
            ? (IndexerDiagnostic)instance
            : new Container(instance.address(), instance);
    }

    protected IndexerDiagnostic() {
        super(CIF);
    }

    IndexerDiagnostic(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends IndexerDiagnostic {

        private final IndexerDiagnosticI delegate;

        Container(long functionPointer, IndexerDiagnosticI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long client_data, long diagnosticSet, long reserved) {
            delegate.invoke(client_data, diagnosticSet, reserved);
        }

    }

}