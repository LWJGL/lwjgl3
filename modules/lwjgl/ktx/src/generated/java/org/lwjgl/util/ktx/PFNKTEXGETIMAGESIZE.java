/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * ktx_size_t (*{@link #invoke}) (
 *     ktxTexture *This,
 *     ktx_uint32_t level
 * )</code></pre>
 */
public abstract class PFNKTEXGETIMAGESIZE extends Callback implements PFNKTEXGETIMAGESIZEI {

    /**
     * Creates a {@code PFNKTEXGETIMAGESIZE} instance from the specified function pointer.
     *
     * @return the new {@code PFNKTEXGETIMAGESIZE}
     */
    public static PFNKTEXGETIMAGESIZE create(long functionPointer) {
        PFNKTEXGETIMAGESIZEI instance = Callback.get(functionPointer);
        return instance instanceof PFNKTEXGETIMAGESIZE
            ? (PFNKTEXGETIMAGESIZE)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static PFNKTEXGETIMAGESIZE createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code PFNKTEXGETIMAGESIZE} instance that delegates to the specified {@code PFNKTEXGETIMAGESIZEI} instance. */
    public static PFNKTEXGETIMAGESIZE create(PFNKTEXGETIMAGESIZEI instance) {
        return instance instanceof PFNKTEXGETIMAGESIZE
            ? (PFNKTEXGETIMAGESIZE)instance
            : new Container(instance.address(), instance);
    }

    protected PFNKTEXGETIMAGESIZE() {
        super(CIF);
    }

    PFNKTEXGETIMAGESIZE(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends PFNKTEXGETIMAGESIZE {

        private final PFNKTEXGETIMAGESIZEI delegate;

        Container(long functionPointer, PFNKTEXGETIMAGESIZEI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long This, int level) {
            return delegate.invoke(This, level);
        }

    }

}