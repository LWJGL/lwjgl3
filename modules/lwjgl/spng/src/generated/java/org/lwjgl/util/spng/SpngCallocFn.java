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
public abstract class SpngCallocFn extends Callback implements SpngCallocFnI {

    /**
     * Creates a {@code SpngCallocFn} instance from the specified function pointer.
     *
     * @return the new {@code SpngCallocFn}
     */
    public static SpngCallocFn create(long functionPointer) {
        SpngCallocFnI instance = Callback.get(functionPointer);
        return instance instanceof SpngCallocFn
            ? (SpngCallocFn)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SpngCallocFn createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SpngCallocFn} instance that delegates to the specified {@code SpngCallocFnI} instance. */
    public static SpngCallocFn create(SpngCallocFnI instance) {
        return instance instanceof SpngCallocFn
            ? (SpngCallocFn)instance
            : new Container(instance.address(), instance);
    }

    protected SpngCallocFn() {
        super(CIF);
    }

    SpngCallocFn(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SpngCallocFn {

        private final SpngCallocFnI delegate;

        Container(long functionPointer, SpngCallocFnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long count, long size) {
            return delegate.invoke(count, size);
        }

    }

}