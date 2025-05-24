/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke spng_malloc_fn} */
public abstract class SpngMallocFn extends Callback implements SpngMallocFnI {

    /**
     * Creates a {@code SpngMallocFn} instance from the specified function pointer.
     *
     * @return the new {@code SpngMallocFn}
     */
    public static SpngMallocFn create(long functionPointer) {
        SpngMallocFnI instance = Callback.get(functionPointer);
        return instance instanceof SpngMallocFn
            ? (SpngMallocFn)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SpngMallocFn createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SpngMallocFn} instance that delegates to the specified {@code SpngMallocFnI} instance. */
    public static SpngMallocFn create(SpngMallocFnI instance) {
        return instance instanceof SpngMallocFn
            ? (SpngMallocFn)instance
            : new Container(instance.address(), instance);
    }

    protected SpngMallocFn() {
        super(CIF);
    }

    SpngMallocFn(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SpngMallocFn {

        private final SpngMallocFnI delegate;

        Container(long functionPointer, SpngMallocFnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long size) {
            return delegate.invoke(size);
        }

    }

}