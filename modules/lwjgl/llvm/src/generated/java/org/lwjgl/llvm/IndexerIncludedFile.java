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
    public static IndexerIncludedFile create(long functionPointer) {
        IndexerIncludedFileI instance = Callback.get(functionPointer);
        return instance instanceof IndexerIncludedFile
            ? (IndexerIncludedFile)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable IndexerIncludedFile createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code IndexerIncludedFile} instance that delegates to the specified {@code IndexerIncludedFileI} instance. */
    public static IndexerIncludedFile create(IndexerIncludedFileI instance) {
        return instance instanceof IndexerIncludedFile
            ? (IndexerIncludedFile)instance
            : new Container(instance.address(), instance);
    }

    protected IndexerIncludedFile() {
        super(CIF);
    }

    IndexerIncludedFile(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends IndexerIncludedFile {

        private final IndexerIncludedFileI delegate;

        Container(long functionPointer, IndexerIncludedFileI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long client_data, long info) {
            return delegate.invoke(client_data, info);
        }

    }

}