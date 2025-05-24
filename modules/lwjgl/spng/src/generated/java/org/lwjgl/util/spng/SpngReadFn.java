/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke spng_read_fn} */
public abstract class SpngReadFn extends Callback implements SpngReadFnI {

    /**
     * Creates a {@code SpngReadFn} instance from the specified function pointer.
     *
     * @return the new {@code SpngReadFn}
     */
    public static SpngReadFn create(long functionPointer) {
        SpngReadFnI instance = Callback.get(functionPointer);
        return instance instanceof SpngReadFn
            ? (SpngReadFn)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SpngReadFn createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SpngReadFn} instance that delegates to the specified {@code SpngReadFnI} instance. */
    public static SpngReadFn create(SpngReadFnI instance) {
        return instance instanceof SpngReadFn
            ? (SpngReadFn)instance
            : new Container(instance.address(), instance);
    }

    protected SpngReadFn() {
        super(CIF);
    }

    SpngReadFn(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SpngReadFn {

        private final SpngReadFnI delegate;

        Container(long functionPointer, SpngReadFnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long ctx, long user, long dest, long length) {
            delegate.invoke(ctx, user, dest, length);
        }

    }

}