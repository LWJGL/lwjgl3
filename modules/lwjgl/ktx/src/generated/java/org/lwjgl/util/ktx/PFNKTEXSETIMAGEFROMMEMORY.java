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
 *     ktx_uint32_t level,
 *     ktx_uint32_t layer,
 *     ktx_uint32_t faceSlice,
 *     ktx_uint8_t const *src,
 *     ktx_size_t srcSize
 * )</code></pre>
 */
public abstract class PFNKTEXSETIMAGEFROMMEMORY extends Callback implements PFNKTEXSETIMAGEFROMMEMORYI {

    /**
     * Creates a {@code PFNKTEXSETIMAGEFROMMEMORY} instance from the specified function pointer.
     *
     * @return the new {@code PFNKTEXSETIMAGEFROMMEMORY}
     */
    public static PFNKTEXSETIMAGEFROMMEMORY create(long functionPointer) {
        PFNKTEXSETIMAGEFROMMEMORYI instance = Callback.get(functionPointer);
        return instance instanceof PFNKTEXSETIMAGEFROMMEMORY
            ? (PFNKTEXSETIMAGEFROMMEMORY)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static PFNKTEXSETIMAGEFROMMEMORY createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code PFNKTEXSETIMAGEFROMMEMORY} instance that delegates to the specified {@code PFNKTEXSETIMAGEFROMMEMORYI} instance. */
    public static PFNKTEXSETIMAGEFROMMEMORY create(PFNKTEXSETIMAGEFROMMEMORYI instance) {
        return instance instanceof PFNKTEXSETIMAGEFROMMEMORY
            ? (PFNKTEXSETIMAGEFROMMEMORY)instance
            : new Container(instance.address(), instance);
    }

    protected PFNKTEXSETIMAGEFROMMEMORY() {
        super(CIF);
    }

    PFNKTEXSETIMAGEFROMMEMORY(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends PFNKTEXSETIMAGEFROMMEMORY {

        private final PFNKTEXSETIMAGEFROMMEMORYI delegate;

        Container(long functionPointer, PFNKTEXSETIMAGEFROMMEMORYI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long This, int level, int layer, int faceSlice, long src, long srcSize) {
            return delegate.invoke(This, level, layer, faceSlice, src, srcSize);
        }

    }

}