/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link CU#cuStreamAddCallback StreamAddCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     CUstream hStream,
 *     CUresult status,
 *     void *userData
 * )</code></pre>
 */
public abstract class CUstreamCallback extends Callback implements CUstreamCallbackI {

    /**
     * Creates a {@code CUstreamCallback} instance from the specified function pointer.
     *
     * @return the new {@code CUstreamCallback}
     */
    public static CUstreamCallback create(long functionPointer) {
        CUstreamCallbackI instance = Callback.get(functionPointer);
        return instance instanceof CUstreamCallback
            ? (CUstreamCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static CUstreamCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code CUstreamCallback} instance that delegates to the specified {@code CUstreamCallbackI} instance. */
    public static CUstreamCallback create(CUstreamCallbackI instance) {
        return instance instanceof CUstreamCallback
            ? (CUstreamCallback)instance
            : new Container(instance.address(), instance);
    }

    protected CUstreamCallback() {
        super(CIF);
    }

    CUstreamCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends CUstreamCallback {

        private final CUstreamCallbackI delegate;

        Container(long functionPointer, CUstreamCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long hStream, int status, long userData) {
            delegate.invoke(hStream, status, userData);
        }

    }

}