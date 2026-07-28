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
public abstract class IndexerIndexEntityReference extends Callback implements IndexerIndexEntityReferenceI {

    /**
     * Creates a {@code IndexerIndexEntityReference} instance from the specified function pointer.
     *
     * @return the new {@code IndexerIndexEntityReference}
     */
    public static IndexerIndexEntityReference create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable IndexerIndexEntityReference createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code IndexerIndexEntityReference} instance that delegates to the specified {@code IndexerIndexEntityReferenceI} instance. */
    public static IndexerIndexEntityReference create(IndexerIndexEntityReferenceI instance) { return create(instance, instance.address()); }

    private static IndexerIndexEntityReference create(IndexerIndexEntityReferenceI instance, long functionPointer) {
        return instance instanceof IndexerIndexEntityReference
            ? (IndexerIndexEntityReference)instance
            : new IndexerIndexEntityReference(functionPointer) {
                @Override public void invoke(long client_data, long info) {
                    instance.invoke(client_data, info);
                }
            };
    }

    protected IndexerIndexEntityReference() {
        super(DESCRIPTOR);
    }

    IndexerIndexEntityReference(long functionPointer) {
        super(functionPointer);
    }

}