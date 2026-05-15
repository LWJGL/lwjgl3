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
public abstract class IndexerEnteredMainFile extends Callback implements IndexerEnteredMainFileI {

    /**
     * Creates a {@code IndexerEnteredMainFile} instance from the specified function pointer.
     *
     * @return the new {@code IndexerEnteredMainFile}
     */
    public static IndexerEnteredMainFile create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable IndexerEnteredMainFile createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code IndexerEnteredMainFile} instance that delegates to the specified {@code IndexerEnteredMainFileI} instance. */
    public static IndexerEnteredMainFile create(IndexerEnteredMainFileI instance) { return create(instance, instance.address()); }

    private static IndexerEnteredMainFile create(IndexerEnteredMainFileI instance, long functionPointer) {
        return instance instanceof IndexerEnteredMainFile
            ? (IndexerEnteredMainFile)instance
            : new IndexerEnteredMainFile(functionPointer) {
                @Override public long invoke(long client_data, long mainFile, long reserved) {
                    return instance.invoke(client_data, mainFile, reserved);
                }
            };
    }

    protected IndexerEnteredMainFile() {
        super(DESCRIPTOR);
    }

    IndexerEnteredMainFile(long functionPointer) {
        super(functionPointer);
    }

}