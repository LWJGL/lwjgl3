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
public abstract class IndexerIndexDeclaration extends Callback implements IndexerIndexDeclarationI {

    /**
     * Creates a {@code IndexerIndexDeclaration} instance from the specified function pointer.
     *
     * @return the new {@code IndexerIndexDeclaration}
     */
    public static IndexerIndexDeclaration create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable IndexerIndexDeclaration createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code IndexerIndexDeclaration} instance that delegates to the specified {@code IndexerIndexDeclarationI} instance. */
    public static IndexerIndexDeclaration create(IndexerIndexDeclarationI instance) { return create(instance, instance.address()); }

    private static IndexerIndexDeclaration create(IndexerIndexDeclarationI instance, long functionPointer) {
        return instance instanceof IndexerIndexDeclaration
            ? (IndexerIndexDeclaration)instance
            : new IndexerIndexDeclaration(functionPointer) {
                @Override public void invoke(long client_data, long info) {
                    instance.invoke(client_data, info);
                }
            };
    }

    protected IndexerIndexDeclaration() {
        super(DESCRIPTOR);
    }

    IndexerIndexDeclaration(long functionPointer) {
        super(functionPointer);
    }

}