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
public abstract class IndexerImportedASTFile extends Callback implements IndexerImportedASTFileI {

    /**
     * Creates a {@code IndexerImportedASTFile} instance from the specified function pointer.
     *
     * @return the new {@code IndexerImportedASTFile}
     */
    public static IndexerImportedASTFile create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable IndexerImportedASTFile createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code IndexerImportedASTFile} instance that delegates to the specified {@code IndexerImportedASTFileI} instance. */
    public static IndexerImportedASTFile create(IndexerImportedASTFileI instance) { return create(instance, instance.address()); }

    private static IndexerImportedASTFile create(IndexerImportedASTFileI instance, long functionPointer) {
        return instance instanceof IndexerImportedASTFile
            ? (IndexerImportedASTFile)instance
            : new IndexerImportedASTFile(functionPointer) {
                @Override public long invoke(long client_data, long info) {
                    return instance.invoke(client_data, info);
                }
            };
    }

    protected IndexerImportedASTFile() {
        super(DESCRIPTOR);
    }

    IndexerImportedASTFile(long functionPointer) {
        super(functionPointer);
    }

}