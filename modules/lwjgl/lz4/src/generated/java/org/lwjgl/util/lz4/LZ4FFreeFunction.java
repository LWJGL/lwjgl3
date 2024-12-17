/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LZ4F_FreeFunction} */
public abstract class LZ4FFreeFunction extends Callback implements LZ4FFreeFunctionI {

    /**
     * Creates a {@code LZ4FFreeFunction} instance from the specified function pointer.
     *
     * @return the new {@code LZ4FFreeFunction}
     */
    public static LZ4FFreeFunction create(long functionPointer) {
        LZ4FFreeFunctionI instance = Callback.get(functionPointer);
        return instance instanceof LZ4FFreeFunction
            ? (LZ4FFreeFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LZ4FFreeFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LZ4FFreeFunction} instance that delegates to the specified {@code LZ4FFreeFunctionI} instance. */
    public static LZ4FFreeFunction create(LZ4FFreeFunctionI instance) {
        return instance instanceof LZ4FFreeFunction
            ? (LZ4FFreeFunction)instance
            : new Container(instance.address(), instance);
    }

    protected LZ4FFreeFunction() {
        super(CIF);
    }

    LZ4FFreeFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LZ4FFreeFunction {

        private final LZ4FFreeFunctionI delegate;

        Container(long functionPointer, LZ4FFreeFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long opaqueState, long address) {
            return delegate.invoke(opaqueState, address);
        }

    }

}