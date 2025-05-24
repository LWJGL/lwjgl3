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
public abstract class SpngFreeFn extends Callback implements SpngFreeFnI {

    /**
     * Creates a {@code SpngFreeFn} instance from the specified function pointer.
     *
     * @return the new {@code SpngFreeFn}
     */
    public static SpngFreeFn create(long functionPointer) {
        SpngFreeFnI instance = Callback.get(functionPointer);
        return instance instanceof SpngFreeFn
            ? (SpngFreeFn)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SpngFreeFn createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SpngFreeFn} instance that delegates to the specified {@code SpngFreeFnI} instance. */
    public static SpngFreeFn create(SpngFreeFnI instance) {
        return instance instanceof SpngFreeFn
            ? (SpngFreeFn)instance
            : new Container(instance.address(), instance);
    }

    protected SpngFreeFn() {
        super(CIF);
    }

    SpngFreeFn(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SpngFreeFn {

        private final SpngFreeFnI delegate;

        Container(long functionPointer, SpngFreeFnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long ptr) {
            delegate.invoke(ptr);
        }

    }

}