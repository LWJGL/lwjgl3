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
 *     ktxStream *dststr
 * )</code></pre>
 */
public abstract class PFNKTEXWRITETOSTREAM extends Callback implements PFNKTEXWRITETOSTREAMI {

    /**
     * Creates a {@code PFNKTEXWRITETOSTREAM} instance from the specified function pointer.
     *
     * @return the new {@code PFNKTEXWRITETOSTREAM}
     */
    public static PFNKTEXWRITETOSTREAM create(long functionPointer) {
        PFNKTEXWRITETOSTREAMI instance = Callback.get(functionPointer);
        return instance instanceof PFNKTEXWRITETOSTREAM
            ? (PFNKTEXWRITETOSTREAM)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static PFNKTEXWRITETOSTREAM createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code PFNKTEXWRITETOSTREAM} instance that delegates to the specified {@code PFNKTEXWRITETOSTREAMI} instance. */
    public static PFNKTEXWRITETOSTREAM create(PFNKTEXWRITETOSTREAMI instance) {
        return instance instanceof PFNKTEXWRITETOSTREAM
            ? (PFNKTEXWRITETOSTREAM)instance
            : new Container(instance.address(), instance);
    }

    protected PFNKTEXWRITETOSTREAM() {
        super(CIF);
    }

    PFNKTEXWRITETOSTREAM(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends PFNKTEXWRITETOSTREAM {

        private final PFNKTEXWRITETOSTREAMI delegate;

        Container(long functionPointer, PFNKTEXWRITETOSTREAMI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long This, long dststr) {
            return delegate.invoke(This, dststr);
        }

    }

}