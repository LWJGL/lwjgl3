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
public abstract class IndexerAbortQuery extends Callback implements IndexerAbortQueryI {

    /**
     * Creates a {@code IndexerAbortQuery} instance from the specified function pointer.
     *
     * @return the new {@code IndexerAbortQuery}
     */
    public static IndexerAbortQuery create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable IndexerAbortQuery createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code IndexerAbortQuery} instance that delegates to the specified {@code IndexerAbortQueryI} instance. */
    public static IndexerAbortQuery create(IndexerAbortQueryI instance) { return create(instance, instance.address()); }

    private static IndexerAbortQuery create(IndexerAbortQueryI instance, long functionPointer) {
        return instance instanceof IndexerAbortQuery
            ? (IndexerAbortQuery)instance
            : new IndexerAbortQuery(functionPointer) {
                @Override public int invoke(long client_data, long reserved) {
                    return instance.invoke(client_data, reserved);
                }
            };
    }

    protected IndexerAbortQuery() {
        super(DESCRIPTOR);
    }

    IndexerAbortQuery(long functionPointer) {
        super(functionPointer);
    }

}