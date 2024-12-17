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
    public static IndexerIndexEntityReference create(long functionPointer) {
        IndexerIndexEntityReferenceI instance = Callback.get(functionPointer);
        return instance instanceof IndexerIndexEntityReference
            ? (IndexerIndexEntityReference)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable IndexerIndexEntityReference createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code IndexerIndexEntityReference} instance that delegates to the specified {@code IndexerIndexEntityReferenceI} instance. */
    public static IndexerIndexEntityReference create(IndexerIndexEntityReferenceI instance) {
        return instance instanceof IndexerIndexEntityReference
            ? (IndexerIndexEntityReference)instance
            : new Container(instance.address(), instance);
    }

    protected IndexerIndexEntityReference() {
        super(CIF);
    }

    IndexerIndexEntityReference(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends IndexerIndexEntityReference {

        private final IndexerIndexEntityReferenceI delegate;

        Container(long functionPointer, IndexerIndexEntityReferenceI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long client_data, long info) {
            delegate.invoke(client_data, info);
        }

    }

}