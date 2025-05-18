/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke spng_realloc_fn} */
public abstract class spng_realloc_fn extends Callback implements spng_realloc_fnI {

    /**
     * Creates a {@code spng_realloc_fn} instance from the specified function pointer.
     *
     * @return the new {@code spng_realloc_fn}
     */
    public static spng_realloc_fn create(long functionPointer) {
        spng_realloc_fnI instance = Callback.get(functionPointer);
        return instance instanceof spng_realloc_fn
            ? (spng_realloc_fn)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable spng_realloc_fn createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code spng_realloc_fn} instance that delegates to the specified {@code spng_realloc_fnI} instance. */
    public static spng_realloc_fn create(spng_realloc_fnI instance) {
        return instance instanceof spng_realloc_fn
            ? (spng_realloc_fn)instance
            : new Container(instance.address(), instance);
    }

    protected spng_realloc_fn() {
        super(CIF);
    }

    spng_realloc_fn(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends spng_realloc_fn {

        private final spng_realloc_fnI delegate;

        Container(long functionPointer, spng_realloc_fnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long ptr, long size) {
            return delegate.invoke(ptr, size);
        }

    }

}