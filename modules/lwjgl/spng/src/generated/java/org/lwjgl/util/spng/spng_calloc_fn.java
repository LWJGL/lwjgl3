/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke spng_calloc_fn} */
public abstract class spng_calloc_fn extends Callback implements spng_calloc_fnI {

    /**
     * Creates a {@code spng_calloc_fn} instance from the specified function pointer.
     *
     * @return the new {@code spng_calloc_fn}
     */
    public static spng_calloc_fn create(long functionPointer) {
        spng_calloc_fnI instance = Callback.get(functionPointer);
        return instance instanceof spng_calloc_fn
            ? (spng_calloc_fn)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable spng_calloc_fn createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code spng_calloc_fn} instance that delegates to the specified {@code spng_calloc_fnI} instance. */
    public static spng_calloc_fn create(spng_calloc_fnI instance) {
        return instance instanceof spng_calloc_fn
            ? (spng_calloc_fn)instance
            : new Container(instance.address(), instance);
    }

    protected spng_calloc_fn() {
        super(DESCRIPTOR);
    }

    spng_calloc_fn(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends spng_calloc_fn {

        private final spng_calloc_fnI delegate;

        Container(long functionPointer, spng_calloc_fnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long count, long size) {
            return delegate.invoke(count, size);
        }

    }

}