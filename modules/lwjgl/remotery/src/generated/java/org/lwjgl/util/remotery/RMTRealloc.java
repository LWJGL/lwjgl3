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
 *     void *ptr,
 *     rmtU32 size
 * )</code></pre>
 */
public abstract class RMTRealloc extends Callback implements RMTReallocI {

    /**
     * Creates a {@code RMTRealloc} instance from the specified function pointer.
     *
     * @return the new {@code RMTRealloc}
     */
    public static RMTRealloc create(long functionPointer) {
        RMTReallocI instance = Callback.get(functionPointer);
        return instance instanceof RMTRealloc
            ? (RMTRealloc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static RMTRealloc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RMTRealloc} instance that delegates to the specified {@code RMTReallocI} instance. */
    public static RMTRealloc create(RMTReallocI instance) {
        return instance instanceof RMTRealloc
            ? (RMTRealloc)instance
            : new Container(instance.address(), instance);
    }

    protected RMTRealloc() {
        super(CIF);
    }

    RMTRealloc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RMTRealloc {

        private final RMTReallocI delegate;

        Container(long functionPointer, RMTReallocI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long mm_context, long ptr, int size) {
            return delegate.invoke(mm_context, ptr, size);
        }

    }

}