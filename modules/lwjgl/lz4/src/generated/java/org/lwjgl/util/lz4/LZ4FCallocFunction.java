/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke LZ4F_CallocFunction} */
public abstract class LZ4FCallocFunction extends Callback implements LZ4FCallocFunctionI {

    /**
     * Creates a {@code LZ4FCallocFunction} instance from the specified function pointer.
     *
     * @return the new {@code LZ4FCallocFunction}
     */
    public static LZ4FCallocFunction create(long functionPointer) {
        LZ4FCallocFunctionI instance = Callback.get(functionPointer);
        return instance instanceof LZ4FCallocFunction
            ? (LZ4FCallocFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable LZ4FCallocFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code LZ4FCallocFunction} instance that delegates to the specified {@code LZ4FCallocFunctionI} instance. */
    public static LZ4FCallocFunction create(LZ4FCallocFunctionI instance) {
        return instance instanceof LZ4FCallocFunction
            ? (LZ4FCallocFunction)instance
            : new Container(instance.address(), instance);
    }

    protected LZ4FCallocFunction() {
        super(CIF);
    }

    LZ4FCallocFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends LZ4FCallocFunction {

        private final LZ4FCallocFunctionI delegate;

        Container(long functionPointer, LZ4FCallocFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long opaqueState, long size) {
            return delegate.invoke(opaqueState, size);
        }

    }

}