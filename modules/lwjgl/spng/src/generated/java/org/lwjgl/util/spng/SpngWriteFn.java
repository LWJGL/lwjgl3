/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke spng_write_fn} */
public abstract class SpngWriteFn extends Callback implements SpngWriteFnI {

    /**
     * Creates a {@code SpngWriteFn} instance from the specified function pointer.
     *
     * @return the new {@code SpngWriteFn}
     */
    public static SpngWriteFn create(long functionPointer) {
        SpngWriteFnI instance = Callback.get(functionPointer);
        return instance instanceof SpngWriteFn
            ? (SpngWriteFn)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SpngWriteFn createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SpngWriteFn} instance that delegates to the specified {@code SpngWriteFnI} instance. */
    public static SpngWriteFn create(SpngWriteFnI instance) {
        return instance instanceof SpngWriteFn
            ? (SpngWriteFn)instance
            : new Container(instance.address(), instance);
    }

    protected SpngWriteFn() {
        super(CIF);
    }

    SpngWriteFn(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SpngWriteFn {

        private final SpngWriteFnI delegate;

        Container(long functionPointer, SpngWriteFnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long ctx, long user, long dest, long length) {
            delegate.invoke(ctx, user, dest, length);
        }

    }

}