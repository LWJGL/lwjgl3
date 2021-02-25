/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*) (
 *     void *mm_context,
 *     rmtU32 size
 * )</code></pre>
 */
public abstract class RMTMalloc extends Callback implements RMTMallocI {

    /**
     * Creates a {@code RMTMalloc} instance from the specified function pointer.
     *
     * @return the new {@code RMTMalloc}
     */
    public static RMTMalloc create(long functionPointer) {
        RMTMallocI instance = Callback.get(functionPointer);
        return instance instanceof RMTMalloc
            ? (RMTMalloc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static RMTMalloc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RMTMalloc} instance that delegates to the specified {@code RMTMallocI} instance. */
    public static RMTMalloc create(RMTMallocI instance) {
        return instance instanceof RMTMalloc
            ? (RMTMalloc)instance
            : new Container(instance.address(), instance);
    }

    protected RMTMalloc() {
        super(CIF);
    }

    RMTMalloc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RMTMalloc {

        private final RMTMallocI delegate;

        Container(long functionPointer, RMTMallocI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long mm_context, int size) {
            return delegate.invoke(mm_context, size);
        }

    }

}