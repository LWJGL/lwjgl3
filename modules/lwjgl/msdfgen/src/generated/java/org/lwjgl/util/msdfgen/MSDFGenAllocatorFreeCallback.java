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
 * Frees the given block of memory.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*{@link #invoke}) (
 *     void *memory
 * )</code></pre>
 */
public abstract class MSDFGenAllocatorFreeCallback extends Callback implements MSDFGenAllocatorFreeCallbackI {

    /**
     * Creates a {@code MSDFGenAllocatorFreeCallback} instance from the specified function pointer.
     *
     * @return the new {@code MSDFGenAllocatorFreeCallback}
     */
    public static MSDFGenAllocatorFreeCallback create(long functionPointer) {
        MSDFGenAllocatorFreeCallbackI instance = Callback.get(functionPointer);
        return instance instanceof MSDFGenAllocatorFreeCallback
            ? (MSDFGenAllocatorFreeCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static MSDFGenAllocatorFreeCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code MSDFGenAllocatorFreeCallback} instance that delegates to the specified {@code MSDFGenAllocatorFreeCallbackI} instance. */
    public static MSDFGenAllocatorFreeCallback create(MSDFGenAllocatorFreeCallbackI instance) {
        return instance instanceof MSDFGenAllocatorFreeCallback
            ? (MSDFGenAllocatorFreeCallback)instance
            : new Container(instance.address(), instance);
    }

    protected MSDFGenAllocatorFreeCallback() {
        super(CIF);
    }

    MSDFGenAllocatorFreeCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends MSDFGenAllocatorFreeCallback {

        private final MSDFGenAllocatorFreeCallbackI delegate;

        Container(long functionPointer, MSDFGenAllocatorFreeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long memory) {
            return delegate.invoke(memory);
        }

    }

}