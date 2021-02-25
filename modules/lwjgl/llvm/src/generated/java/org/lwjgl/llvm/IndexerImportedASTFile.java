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
 * Instances of this class may be set to the {@code importedASTFile} field of the {@link IndexerCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * CXIdxClientASTFile (*) (
 *     CXClientData client_data,
 *     CXIdxImportedASTFileInfo const *info
 * )</code></pre>
 */
public abstract class IndexerImportedASTFile extends Callback implements IndexerImportedASTFileI {

    /**
     * Creates a {@code IndexerImportedASTFile} instance from the specified function pointer.
     *
     * @return the new {@code IndexerImportedASTFile}
     */
    public static IndexerImportedASTFile create(long functionPointer) {
        IndexerImportedASTFileI instance = Callback.get(functionPointer);
        return instance instanceof IndexerImportedASTFile
            ? (IndexerImportedASTFile)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static IndexerImportedASTFile createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code IndexerImportedASTFile} instance that delegates to the specified {@code IndexerImportedASTFileI} instance. */
    public static IndexerImportedASTFile create(IndexerImportedASTFileI instance) {
        return instance instanceof IndexerImportedASTFile
            ? (IndexerImportedASTFile)instance
            : new Container(instance.address(), instance);
    }

    protected IndexerImportedASTFile() {
        super(CIF);
    }

    IndexerImportedASTFile(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends IndexerImportedASTFile {

        private final IndexerImportedASTFileI delegate;

        Container(long functionPointer, IndexerImportedASTFileI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long client_data, long info) {
            return delegate.invoke(client_data, info);
        }

    }

}