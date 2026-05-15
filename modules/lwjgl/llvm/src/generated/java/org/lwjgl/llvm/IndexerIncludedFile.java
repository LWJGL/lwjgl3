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
public abstract class IndexerIncludedFile extends Callback implements IndexerIncludedFileI {

    /**
     * Creates a {@code IndexerIncludedFile} instance from the specified function pointer.
     *
     * @return the new {@code IndexerIncludedFile}
     */
    public static IndexerIncludedFile create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable IndexerIncludedFile createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code IndexerIncludedFile} instance that delegates to the specified {@code IndexerIncludedFileI} instance. */
    public static IndexerIncludedFile create(IndexerIncludedFileI instance) { return create(instance, instance.address()); }

    private static IndexerIncludedFile create(IndexerIncludedFileI instance, long functionPointer) {
        return instance instanceof IndexerIncludedFile
            ? (IndexerIncludedFile)instance
            : new IndexerIncludedFile(functionPointer) {
                @Override public long invoke(long client_data, long info) {
                    return instance.invoke(client_data, info);
                }
            };
    }

    protected IndexerIncludedFile() {
        super(DESCRIPTOR);
    }

    IndexerIncludedFile(long functionPointer) {
        super(functionPointer);
    }

}