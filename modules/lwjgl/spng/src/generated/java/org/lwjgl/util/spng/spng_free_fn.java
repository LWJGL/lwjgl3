/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke spng_free_fn} */
public abstract class spng_free_fn extends Callback implements spng_free_fnI {

    /**
     * Creates a {@code spng_free_fn} instance from the specified function pointer.
     *
     * @return the new {@code spng_free_fn}
     */
    public static spng_free_fn create(long functionPointer) {
        spng_free_fnI instance = Callback.get(functionPointer);
        return instance instanceof spng_free_fn
            ? (spng_free_fn)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable spng_free_fn createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code spng_free_fn} instance that delegates to the specified {@code spng_free_fnI} instance. */
    public static spng_free_fn create(spng_free_fnI instance) {
        return instance instanceof spng_free_fn
            ? (spng_free_fn)instance
            : new Container(instance.address(), instance);
    }

    protected spng_free_fn() {
        super(DESCRIPTOR);
    }

    spng_free_fn(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends spng_free_fn {

        private final spng_free_fnI delegate;

        Container(long functionPointer, spng_free_fnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long ptr) {
            delegate.invoke(ptr);
        }

    }

}