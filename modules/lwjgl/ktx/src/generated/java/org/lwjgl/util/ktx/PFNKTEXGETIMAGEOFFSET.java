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
 *     ktx_size_t *pOffset
 * )</code></pre>
 */
public abstract class PFNKTEXGETIMAGEOFFSET extends Callback implements PFNKTEXGETIMAGEOFFSETI {

    /**
     * Creates a {@code PFNKTEXGETIMAGEOFFSET} instance from the specified function pointer.
     *
     * @return the new {@code PFNKTEXGETIMAGEOFFSET}
     */
    public static PFNKTEXGETIMAGEOFFSET create(long functionPointer) {
        PFNKTEXGETIMAGEOFFSETI instance = Callback.get(functionPointer);
        return instance instanceof PFNKTEXGETIMAGEOFFSET
            ? (PFNKTEXGETIMAGEOFFSET)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static PFNKTEXGETIMAGEOFFSET createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code PFNKTEXGETIMAGEOFFSET} instance that delegates to the specified {@code PFNKTEXGETIMAGEOFFSETI} instance. */
    public static PFNKTEXGETIMAGEOFFSET create(PFNKTEXGETIMAGEOFFSETI instance) {
        return instance instanceof PFNKTEXGETIMAGEOFFSET
            ? (PFNKTEXGETIMAGEOFFSET)instance
            : new Container(instance.address(), instance);
    }

    protected PFNKTEXGETIMAGEOFFSET() {
        super(CIF);
    }

    PFNKTEXGETIMAGEOFFSET(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends PFNKTEXGETIMAGEOFFSET {

        private final PFNKTEXGETIMAGEOFFSETI delegate;

        Container(long functionPointer, PFNKTEXGETIMAGEOFFSETI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long This, int level, int layer, int faceSlice, long pOffset) {
            return delegate.invoke(This, level, layer, faceSlice, pOffset);
        }

    }

}