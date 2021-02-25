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
 * Instances of this class may be passed to the {@link ZSTDCustomMem} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     void *opaque,
 *     void *address
 * )</code></pre>
 */
public abstract class ZSTDFreeFunction extends Callback implements ZSTDFreeFunctionI {

    /**
     * Creates a {@code ZSTDFreeFunction} instance from the specified function pointer.
     *
     * @return the new {@code ZSTDFreeFunction}
     */
    public static ZSTDFreeFunction create(long functionPointer) {
        ZSTDFreeFunctionI instance = Callback.get(functionPointer);
        return instance instanceof ZSTDFreeFunction
            ? (ZSTDFreeFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static ZSTDFreeFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ZSTDFreeFunction} instance that delegates to the specified {@code ZSTDFreeFunctionI} instance. */
    public static ZSTDFreeFunction create(ZSTDFreeFunctionI instance) {
        return instance instanceof ZSTDFreeFunction
            ? (ZSTDFreeFunction)instance
            : new Container(instance.address(), instance);
    }

    protected ZSTDFreeFunction() {
        super(CIF);
    }

    ZSTDFreeFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ZSTDFreeFunction {

        private final ZSTDFreeFunctionI delegate;

        Container(long functionPointer, ZSTDFreeFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long opaque, long address) {
            delegate.invoke(opaque, address);
        }

    }

}