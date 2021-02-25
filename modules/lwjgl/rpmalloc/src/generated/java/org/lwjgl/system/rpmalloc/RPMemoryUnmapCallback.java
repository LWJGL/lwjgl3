/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to the {@link RPMallocConfig} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     void *address,
 *     size_t size,
 *     size_t offset,
 *     int release
 * )</code></pre>
 */
public abstract class RPMemoryUnmapCallback extends Callback implements RPMemoryUnmapCallbackI {

    /**
     * Creates a {@code RPMemoryUnmapCallback} instance from the specified function pointer.
     *
     * @return the new {@code RPMemoryUnmapCallback}
     */
    public static RPMemoryUnmapCallback create(long functionPointer) {
        RPMemoryUnmapCallbackI instance = Callback.get(functionPointer);
        return instance instanceof RPMemoryUnmapCallback
            ? (RPMemoryUnmapCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static RPMemoryUnmapCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RPMemoryUnmapCallback} instance that delegates to the specified {@code RPMemoryUnmapCallbackI} instance. */
    public static RPMemoryUnmapCallback create(RPMemoryUnmapCallbackI instance) {
        return instance instanceof RPMemoryUnmapCallback
            ? (RPMemoryUnmapCallback)instance
            : new Container(instance.address(), instance);
    }

    protected RPMemoryUnmapCallback() {
        super(CIF);
    }

    RPMemoryUnmapCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RPMemoryUnmapCallback {

        private final RPMemoryUnmapCallbackI delegate;

        Container(long functionPointer, RPMemoryUnmapCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long address, long size, long offset, boolean release) {
            delegate.invoke(address, size, offset, release);
        }

    }

}