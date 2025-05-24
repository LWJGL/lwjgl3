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
public abstract class SpngReallocFn extends Callback implements SpngReallocFnI {

    /**
     * Creates a {@code SpngReallocFn} instance from the specified function pointer.
     *
     * @return the new {@code SpngReallocFn}
     */
    public static SpngReallocFn create(long functionPointer) {
        SpngReallocFnI instance = Callback.get(functionPointer);
        return instance instanceof SpngReallocFn
            ? (SpngReallocFn)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SpngReallocFn createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SpngReallocFn} instance that delegates to the specified {@code SpngReallocFnI} instance. */
    public static SpngReallocFn create(SpngReallocFnI instance) {
        return instance instanceof SpngReallocFn
            ? (SpngReallocFn)instance
            : new Container(instance.address(), instance);
    }

    protected SpngReallocFn() {
        super(CIF);
    }

    SpngReallocFn(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SpngReallocFn {

        private final SpngReallocFnI delegate;

        Container(long functionPointer, SpngReallocFnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long ptr, long size) {
            return delegate.invoke(ptr, size);
        }

    }

}