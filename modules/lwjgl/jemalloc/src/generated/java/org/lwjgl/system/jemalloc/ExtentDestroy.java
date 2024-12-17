/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke extent_destroy_t} */
public abstract class ExtentDestroy extends Callback implements ExtentDestroyI {

    /**
     * Creates a {@code ExtentDestroy} instance from the specified function pointer.
     *
     * @return the new {@code ExtentDestroy}
     */
    public static ExtentDestroy create(long functionPointer) {
        ExtentDestroyI instance = Callback.get(functionPointer);
        return instance instanceof ExtentDestroy
            ? (ExtentDestroy)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExtentDestroy createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ExtentDestroy} instance that delegates to the specified {@code ExtentDestroyI} instance. */
    public static ExtentDestroy create(ExtentDestroyI instance) {
        return instance instanceof ExtentDestroy
            ? (ExtentDestroy)instance
            : new Container(instance.address(), instance);
    }

    protected ExtentDestroy() {
        super(CIF);
    }

    ExtentDestroy(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ExtentDestroy {

        private final ExtentDestroyI delegate;

        Container(long functionPointer, ExtentDestroyI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long extent_hooks, long addr, long size, boolean committed, int arena_ind) {
            return delegate.invoke(extent_hooks, addr, size, committed, arena_ind);
        }

    }

}