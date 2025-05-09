/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke extent_merge_t} */
public abstract class ExtentMerge extends Callback implements ExtentMergeI {

    /**
     * Creates a {@code ExtentMerge} instance from the specified function pointer.
     *
     * @return the new {@code ExtentMerge}
     */
    public static ExtentMerge create(long functionPointer) {
        ExtentMergeI instance = Callback.get(functionPointer);
        return instance instanceof ExtentMerge
            ? (ExtentMerge)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExtentMerge createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ExtentMerge} instance that delegates to the specified {@code ExtentMergeI} instance. */
    public static ExtentMerge create(ExtentMergeI instance) {
        return instance instanceof ExtentMerge
            ? (ExtentMerge)instance
            : new Container(instance.address(), instance);
    }

    protected ExtentMerge() {
        super(CIF);
    }

    ExtentMerge(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ExtentMerge {

        private final ExtentMergeI delegate;

        Container(long functionPointer, ExtentMergeI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long extent_hooks, long addr_a, long size_a, long addr_b, long size_b, boolean committed, int arena_ind) {
            return delegate.invoke(extent_hooks, addr_a, size_a, addr_b, size_b, committed, arena_ind);
        }

    }

}