/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LZ4F_AllocFunction} */
public abstract class LZ4FAllocFunction extends Callback implements LZ4FAllocFunctionI {

    /**
     * Creates a {@code LZ4FAllocFunction} instance from the specified function pointer.
     *
     * @return the new {@code LZ4FAllocFunction}
     */
    public static LZ4FAllocFunction create(long functionPointer) {
        LZ4FAllocFunctionI instance = Callback.get(functionPointer);
        return instance instanceof LZ4FAllocFunction
            ? (LZ4FAllocFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LZ4FAllocFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LZ4FAllocFunction} instance that delegates to the specified {@code LZ4FAllocFunctionI} instance. */
    public static LZ4FAllocFunction create(LZ4FAllocFunctionI instance) {
        return instance instanceof LZ4FAllocFunction
            ? (LZ4FAllocFunction)instance
            : new Container(instance.address(), instance);
    }

    protected LZ4FAllocFunction() {
        super(CIF);
    }

    LZ4FAllocFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LZ4FAllocFunction {

        private final LZ4FAllocFunctionI delegate;

        Container(long functionPointer, LZ4FAllocFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long opaqueState, long size) {
            return delegate.invoke(opaqueState, size);
        }

    }

}