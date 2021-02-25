/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to the {@link ExtentHooks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*) (
 *     extent_hooks_t *extent_hooks,
 *     void *new_addr,
 *     size_t size,
 *     size_t alignment,
 *     bool *zero,
 *     bool *commit,
 *     unsigned int arena_ind
 * )</code></pre>
 */
public abstract class ExtentAlloc extends Callback implements ExtentAllocI {

    /**
     * Creates a {@code ExtentAlloc} instance from the specified function pointer.
     *
     * @return the new {@code ExtentAlloc}
     */
    public static ExtentAlloc create(long functionPointer) {
        ExtentAllocI instance = Callback.get(functionPointer);
        return instance instanceof ExtentAlloc
            ? (ExtentAlloc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ExtentAlloc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ExtentAlloc} instance that delegates to the specified {@code ExtentAllocI} instance. */
    public static ExtentAlloc create(ExtentAllocI instance) {
        return instance instanceof ExtentAlloc
            ? (ExtentAlloc)instance
            : new Container(instance.address(), instance);
    }

    protected ExtentAlloc() {
        super(CIF);
    }

    ExtentAlloc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ExtentAlloc {

        private final ExtentAllocI delegate;

        Container(long functionPointer, ExtentAllocI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long extent_hooks, long new_addr, long size, long alignment, long zero, long commit, int arena_ind) {
            return delegate.invoke(extent_hooks, new_addr, size, alignment, zero, commit, arena_ind);
        }

    }

}