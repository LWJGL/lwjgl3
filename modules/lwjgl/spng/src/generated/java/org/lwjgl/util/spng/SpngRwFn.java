/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke spng_rw_fn} */
public abstract class SpngRwFn extends Callback implements SpngRwFnI {

    /**
     * Creates a {@code SpngRwFn} instance from the specified function pointer.
     *
     * @return the new {@code SpngRwFn}
     */
    public static SpngRwFn create(long functionPointer) {
        SpngRwFnI instance = Callback.get(functionPointer);
        return instance instanceof SpngRwFn
            ? (SpngRwFn)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SpngRwFn createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SpngRwFn} instance that delegates to the specified {@code SpngRwFnI} instance. */
    public static SpngRwFn create(SpngRwFnI instance) {
        return instance instanceof SpngRwFn
            ? (SpngRwFn)instance
            : new Container(instance.address(), instance);
    }

    protected SpngRwFn() {
        super(CIF);
    }

    SpngRwFn(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SpngRwFn {

        private final SpngRwFnI delegate;

        Container(long functionPointer, SpngRwFnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long ctx, long user, long dest, long length) {
            delegate.invoke(ctx, user, dest, length);
        }

    }

}