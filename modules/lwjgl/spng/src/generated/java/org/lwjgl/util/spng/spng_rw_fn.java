/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke spng_rw_fn *} */
public abstract class spng_rw_fn extends Callback implements spng_rw_fnI {

    /**
     * Creates a {@code spng_rw_fn} instance from the specified function pointer.
     *
     * @return the new {@code spng_rw_fn}
     */
    public static spng_rw_fn create(long functionPointer) {
        spng_rw_fnI instance = Callback.get(functionPointer);
        return instance instanceof spng_rw_fn
            ? (spng_rw_fn)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable spng_rw_fn createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code spng_rw_fn} instance that delegates to the specified {@code spng_rw_fnI} instance. */
    public static spng_rw_fn create(spng_rw_fnI instance) {
        return instance instanceof spng_rw_fn
            ? (spng_rw_fn)instance
            : new Container(instance.address(), instance);
    }

    protected spng_rw_fn() {
        super(CIF);
    }

    spng_rw_fn(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends spng_rw_fn {

        private final spng_rw_fnI delegate;

        Container(long functionPointer, spng_rw_fnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long ctx, long user, long dest, long length) {
            delegate.invoke(ctx, user, dest, length);
        }

    }

}