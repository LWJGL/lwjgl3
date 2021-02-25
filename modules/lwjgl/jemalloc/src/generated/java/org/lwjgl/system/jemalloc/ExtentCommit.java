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
 *     size_t offset,
 *     size_t length,
 *     unsigned int arena_ind
 * )</code></pre>
 */
public abstract class ExtentCommit extends Callback implements ExtentCommitI {

    /**
     * Creates a {@code ExtentCommit} instance from the specified function pointer.
     *
     * @return the new {@code ExtentCommit}
     */
    public static ExtentCommit create(long functionPointer) {
        ExtentCommitI instance = Callback.get(functionPointer);
        return instance instanceof ExtentCommit
            ? (ExtentCommit)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ExtentCommit createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ExtentCommit} instance that delegates to the specified {@code ExtentCommitI} instance. */
    public static ExtentCommit create(ExtentCommitI instance) {
        return instance instanceof ExtentCommit
            ? (ExtentCommit)instance
            : new Container(instance.address(), instance);
    }

    protected ExtentCommit() {
        super(CIF);
    }

    ExtentCommit(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ExtentCommit {

        private final ExtentCommitI delegate;

        Container(long functionPointer, ExtentCommitI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long extent_hooks, long addr, long size, long offset, long length, int arena_ind) {
            return delegate.invoke(extent_hooks, addr, size, offset, length, arena_ind);
        }

    }

}