/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.msdfgen;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*{@link #invoke}) (
 *     size_t size
 * )</code></pre>
 */
public abstract class MSDFGenAllocatorAllocCallback extends Callback implements MSDFGenAllocatorAllocCallbackI {

    /**
     * Creates a {@code MSDFGenAllocatorAllocCallback} instance from the specified function pointer.
     *
     * @return the new {@code MSDFGenAllocatorAllocCallback}
     */
    public static MSDFGenAllocatorAllocCallback create(long functionPointer) {
        MSDFGenAllocatorAllocCallbackI instance = Callback.get(functionPointer);
        return instance instanceof MSDFGenAllocatorAllocCallback
            ? (MSDFGenAllocatorAllocCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static MSDFGenAllocatorAllocCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code MSDFGenAllocatorAllocCallback} instance that delegates to the specified {@code MSDFGenAllocatorAllocCallbackI} instance. */
    public static MSDFGenAllocatorAllocCallback create(MSDFGenAllocatorAllocCallbackI instance) {
        return instance instanceof MSDFGenAllocatorAllocCallback
            ? (MSDFGenAllocatorAllocCallback)instance
            : new Container(instance.address(), instance);
    }

    protected MSDFGenAllocatorAllocCallback() {
        super(CIF);
    }

    MSDFGenAllocatorAllocCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends MSDFGenAllocatorAllocCallback {

        private final MSDFGenAllocatorAllocCallbackI delegate;

        Container(long functionPointer, MSDFGenAllocatorAllocCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long size) {
            return delegate.invoke(size);
        }

    }

}