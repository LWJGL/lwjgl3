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
 * Reallocates a given block of memory to fit at least the given number of bytes.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*{@link #invoke}) (
 *     void *memory,
 *     size_t size
 * )</code></pre>
 */
public abstract class MSDFGenAllocatorReallocCallback extends Callback implements MSDFGenAllocatorReallocCallbackI {

    /**
     * Creates a {@code MSDFGenAllocatorReallocCallback} instance from the specified function pointer.
     *
     * @return the new {@code MSDFGenAllocatorReallocCallback}
     */
    public static MSDFGenAllocatorReallocCallback create(long functionPointer) {
        MSDFGenAllocatorReallocCallbackI instance = Callback.get(functionPointer);
        return instance instanceof MSDFGenAllocatorReallocCallback
            ? (MSDFGenAllocatorReallocCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static MSDFGenAllocatorReallocCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code MSDFGenAllocatorReallocCallback} instance that delegates to the specified {@code MSDFGenAllocatorReallocCallbackI} instance. */
    public static MSDFGenAllocatorReallocCallback create(MSDFGenAllocatorReallocCallbackI instance) {
        return instance instanceof MSDFGenAllocatorReallocCallback
            ? (MSDFGenAllocatorReallocCallback)instance
            : new Container(instance.address(), instance);
    }

    protected MSDFGenAllocatorReallocCallback() {
        super(CIF);
    }

    MSDFGenAllocatorReallocCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends MSDFGenAllocatorReallocCallback {

        private final MSDFGenAllocatorReallocCallbackI delegate;

        Container(long functionPointer, MSDFGenAllocatorReallocCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long memory, long size) {
            return delegate.invoke(memory, size);
        }

    }

}