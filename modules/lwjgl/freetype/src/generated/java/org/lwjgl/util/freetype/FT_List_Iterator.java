/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * FT_Error (*{@link #invoke}) (
 *     FT_ListNode node,
 *     void *user
 * )</code></pre>
 */
public abstract class FT_List_Iterator extends Callback implements FT_List_IteratorI {

    /**
     * Creates a {@code FT_List_Iterator} instance from the specified function pointer.
     *
     * @return the new {@code FT_List_Iterator}
     */
    public static FT_List_Iterator create(long functionPointer) {
        FT_List_IteratorI instance = Callback.get(functionPointer);
        return instance instanceof FT_List_Iterator
            ? (FT_List_Iterator)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_List_Iterator createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_List_Iterator} instance that delegates to the specified {@code FT_List_IteratorI} instance. */
    public static FT_List_Iterator create(FT_List_IteratorI instance) {
        return instance instanceof FT_List_Iterator
            ? (FT_List_Iterator)instance
            : new Container(instance.address(), instance);
    }

    protected FT_List_Iterator() {
        super(CIF);
    }

    FT_List_Iterator(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_List_Iterator {

        private final FT_List_IteratorI delegate;

        Container(long functionPointer, FT_List_IteratorI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long node, long user) {
            return delegate.invoke(node, user);
        }

    }

}