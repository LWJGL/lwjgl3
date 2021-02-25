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
 * Instances of this class may be set to the {@code indexDeclaration} field of the {@link IndexerCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     CXClientData client_data,
 *     CXIdxDeclInfo const *info
 * )</code></pre>
 */
public abstract class IndexerIndexDeclaration extends Callback implements IndexerIndexDeclarationI {

    /**
     * Creates a {@code IndexerIndexDeclaration} instance from the specified function pointer.
     *
     * @return the new {@code IndexerIndexDeclaration}
     */
    public static IndexerIndexDeclaration create(long functionPointer) {
        IndexerIndexDeclarationI instance = Callback.get(functionPointer);
        return instance instanceof IndexerIndexDeclaration
            ? (IndexerIndexDeclaration)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static IndexerIndexDeclaration createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code IndexerIndexDeclaration} instance that delegates to the specified {@code IndexerIndexDeclarationI} instance. */
    public static IndexerIndexDeclaration create(IndexerIndexDeclarationI instance) {
        return instance instanceof IndexerIndexDeclaration
            ? (IndexerIndexDeclaration)instance
            : new Container(instance.address(), instance);
    }

    protected IndexerIndexDeclaration() {
        super(CIF);
    }

    IndexerIndexDeclaration(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends IndexerIndexDeclaration {

        private final IndexerIndexDeclarationI delegate;

        Container(long functionPointer, IndexerIndexDeclarationI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long client_data, long info) {
            delegate.invoke(client_data, info);
        }

    }

}