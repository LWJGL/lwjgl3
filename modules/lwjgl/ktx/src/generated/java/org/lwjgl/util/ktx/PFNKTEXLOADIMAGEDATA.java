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
 *     ktx_uint8_t *pBuffer,
 *     ktx_size_t bufSize
 * )</code></pre>
 */
public abstract class PFNKTEXLOADIMAGEDATA extends Callback implements PFNKTEXLOADIMAGEDATAI {

    /**
     * Creates a {@code PFNKTEXLOADIMAGEDATA} instance from the specified function pointer.
     *
     * @return the new {@code PFNKTEXLOADIMAGEDATA}
     */
    public static PFNKTEXLOADIMAGEDATA create(long functionPointer) {
        PFNKTEXLOADIMAGEDATAI instance = Callback.get(functionPointer);
        return instance instanceof PFNKTEXLOADIMAGEDATA
            ? (PFNKTEXLOADIMAGEDATA)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static PFNKTEXLOADIMAGEDATA createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code PFNKTEXLOADIMAGEDATA} instance that delegates to the specified {@code PFNKTEXLOADIMAGEDATAI} instance. */
    public static PFNKTEXLOADIMAGEDATA create(PFNKTEXLOADIMAGEDATAI instance) {
        return instance instanceof PFNKTEXLOADIMAGEDATA
            ? (PFNKTEXLOADIMAGEDATA)instance
            : new Container(instance.address(), instance);
    }

    protected PFNKTEXLOADIMAGEDATA() {
        super(CIF);
    }

    PFNKTEXLOADIMAGEDATA(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends PFNKTEXLOADIMAGEDATA {

        private final PFNKTEXLOADIMAGEDATAI delegate;

        Container(long functionPointer, PFNKTEXLOADIMAGEDATAI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long This, long pBuffer, long bufSize) {
            return delegate.invoke(This, pBuffer, bufSize);
        }

    }

}