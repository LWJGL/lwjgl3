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
 * KTX_error_code (*{@link #invoke}) (
 *     ktxTexture *This,
 *     ktx_uint8_t **bytes,
 *     ktx_size_t *size
 * )</code></pre>
 */
public abstract class PFNKTEXWRITETOMEMORY extends Callback implements PFNKTEXWRITETOMEMORYI {

    /**
     * Creates a {@code PFNKTEXWRITETOMEMORY} instance from the specified function pointer.
     *
     * @return the new {@code PFNKTEXWRITETOMEMORY}
     */
    public static PFNKTEXWRITETOMEMORY create(long functionPointer) {
        PFNKTEXWRITETOMEMORYI instance = Callback.get(functionPointer);
        return instance instanceof PFNKTEXWRITETOMEMORY
            ? (PFNKTEXWRITETOMEMORY)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static PFNKTEXWRITETOMEMORY createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code PFNKTEXWRITETOMEMORY} instance that delegates to the specified {@code PFNKTEXWRITETOMEMORYI} instance. */
    public static PFNKTEXWRITETOMEMORY create(PFNKTEXWRITETOMEMORYI instance) {
        return instance instanceof PFNKTEXWRITETOMEMORY
            ? (PFNKTEXWRITETOMEMORY)instance
            : new Container(instance.address(), instance);
    }

    protected PFNKTEXWRITETOMEMORY() {
        super(CIF);
    }

    PFNKTEXWRITETOMEMORY(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends PFNKTEXWRITETOMEMORY {

        private final PFNKTEXWRITETOMEMORYI delegate;

        Container(long functionPointer, PFNKTEXWRITETOMEMORYI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long This, long bytes, long size) {
            return delegate.invoke(This, bytes, size);
        }

    }

}