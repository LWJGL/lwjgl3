/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class IndexerDiagnostic extends Callback implements IndexerDiagnosticI {

    /**
     * Creates a {@code IndexerDiagnostic} instance from the specified function pointer.
     *
     * @return the new {@code IndexerDiagnostic}
     */
    public static IndexerDiagnostic create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable IndexerDiagnostic createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code IndexerDiagnostic} instance that delegates to the specified {@code IndexerDiagnosticI} instance. */
    public static IndexerDiagnostic create(IndexerDiagnosticI instance) { return create(instance, instance.address()); }

    private static IndexerDiagnostic create(IndexerDiagnosticI instance, long functionPointer) {
        return instance instanceof IndexerDiagnostic
            ? (IndexerDiagnostic)instance
            : new IndexerDiagnostic(functionPointer) {
                @Override public void invoke(long client_data, long diagnosticSet, long reserved) {
                    instance.invoke(client_data, diagnosticSet, reserved);
                }
            };
    }

    protected IndexerDiagnostic() {
        super(DESCRIPTOR);
    }

    IndexerDiagnostic(long functionPointer) {
        super(functionPointer);
    }

}