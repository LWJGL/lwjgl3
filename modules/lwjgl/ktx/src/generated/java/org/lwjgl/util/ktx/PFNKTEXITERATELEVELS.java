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
 *     PFNKTXITERCB iterCb,
 *     void *userdata
 * )</code></pre>
 */
public abstract class PFNKTEXITERATELEVELS extends Callback implements PFNKTEXITERATELEVELSI {

    /**
     * Creates a {@code PFNKTEXITERATELEVELS} instance from the specified function pointer.
     *
     * @return the new {@code PFNKTEXITERATELEVELS}
     */
    public static PFNKTEXITERATELEVELS create(long functionPointer) {
        PFNKTEXITERATELEVELSI instance = Callback.get(functionPointer);
        return instance instanceof PFNKTEXITERATELEVELS
            ? (PFNKTEXITERATELEVELS)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static PFNKTEXITERATELEVELS createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code PFNKTEXITERATELEVELS} instance that delegates to the specified {@code PFNKTEXITERATELEVELSI} instance. */
    public static PFNKTEXITERATELEVELS create(PFNKTEXITERATELEVELSI instance) {
        return instance instanceof PFNKTEXITERATELEVELS
            ? (PFNKTEXITERATELEVELS)instance
            : new Container(instance.address(), instance);
    }

    protected PFNKTEXITERATELEVELS() {
        super(CIF);
    }

    PFNKTEXITERATELEVELS(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends PFNKTEXITERATELEVELS {

        private final PFNKTEXITERATELEVELSI delegate;

        Container(long functionPointer, PFNKTEXITERATELEVELSI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long This, long iterCb, long userdata) {
            return delegate.invoke(This, iterCb, userdata);
        }

    }

}