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
 * bool (*) (
 *     extent_hooks_t *extent_hooks,
 *     void *addr,
 *     size_t size,
 *     bool committed,
 *     unsigned int arena_ind
 * )</code></pre>
 */
public abstract class ExtentDalloc extends Callback implements ExtentDallocI {

    /**
     * Creates a {@code ExtentDalloc} instance from the specified function pointer.
     *
     * @return the new {@code ExtentDalloc}
     */
    public static ExtentDalloc create(long functionPointer) {
        ExtentDallocI instance = Callback.get(functionPointer);
        return instance instanceof ExtentDalloc
            ? (ExtentDalloc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ExtentDalloc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ExtentDalloc} instance that delegates to the specified {@code ExtentDallocI} instance. */
    public static ExtentDalloc create(ExtentDallocI instance) {
        return instance instanceof ExtentDalloc
            ? (ExtentDalloc)instance
            : new Container(instance.address(), instance);
    }

    protected ExtentDalloc() {
        super(CIF);
    }

    ExtentDalloc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ExtentDalloc {

        private final ExtentDallocI delegate;

        Container(long functionPointer, ExtentDallocI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long extent_hooks, long addr, long size, boolean committed, int arena_ind) {
            return delegate.invoke(extent_hooks, addr, size, committed, arena_ind);
        }

    }

}