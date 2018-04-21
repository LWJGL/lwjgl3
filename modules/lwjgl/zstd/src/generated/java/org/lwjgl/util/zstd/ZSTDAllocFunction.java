/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <code><pre>
 * void * (*) (
 *     void *opaque,
 *     size_t size
 * )</pre></code>
 */
public abstract class ZSTDAllocFunction extends Callback implements ZSTDAllocFunctionI {

    /**
     * Creates a {@code ZSTDAllocFunction} instance from the specified function pointer.
     *
     * @return the new {@code ZSTDAllocFunction}
     */
    public static ZSTDAllocFunction create(long functionPointer) {
        ZSTDAllocFunctionI instance = Callback.get(functionPointer);
        return instance instanceof ZSTDAllocFunction
            ? (ZSTDAllocFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ZSTDAllocFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ZSTDAllocFunction} instance that delegates to the specified {@code ZSTDAllocFunctionI} instance. */
    public static ZSTDAllocFunction create(ZSTDAllocFunctionI instance) {
        return instance instanceof ZSTDAllocFunction
            ? (ZSTDAllocFunction)instance
            : new Container(instance.address(), instance);
    }

    protected ZSTDAllocFunction() {
        super(SIGNATURE);
    }

    private ZSTDAllocFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ZSTDAllocFunction {

        private final ZSTDAllocFunctionI delegate;

        Container(long functionPointer, ZSTDAllocFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long opaque, long size) {
            return delegate.invoke(opaque, size);
        }

    }

}