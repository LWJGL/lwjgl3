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
 *     char const * const dstname
 * )</code></pre>
 */
public abstract class PFNKTEXWRITETONAMEDFILE extends Callback implements PFNKTEXWRITETONAMEDFILEI {

    /**
     * Creates a {@code PFNKTEXWRITETONAMEDFILE} instance from the specified function pointer.
     *
     * @return the new {@code PFNKTEXWRITETONAMEDFILE}
     */
    public static PFNKTEXWRITETONAMEDFILE create(long functionPointer) {
        PFNKTEXWRITETONAMEDFILEI instance = Callback.get(functionPointer);
        return instance instanceof PFNKTEXWRITETONAMEDFILE
            ? (PFNKTEXWRITETONAMEDFILE)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static PFNKTEXWRITETONAMEDFILE createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code PFNKTEXWRITETONAMEDFILE} instance that delegates to the specified {@code PFNKTEXWRITETONAMEDFILEI} instance. */
    public static PFNKTEXWRITETONAMEDFILE create(PFNKTEXWRITETONAMEDFILEI instance) {
        return instance instanceof PFNKTEXWRITETONAMEDFILE
            ? (PFNKTEXWRITETONAMEDFILE)instance
            : new Container(instance.address(), instance);
    }

    protected PFNKTEXWRITETONAMEDFILE() {
        super(CIF);
    }

    PFNKTEXWRITETONAMEDFILE(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends PFNKTEXWRITETONAMEDFILE {

        private final PFNKTEXWRITETONAMEDFILEI delegate;

        Container(long functionPointer, PFNKTEXWRITETONAMEDFILEI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long This, long dstname) {
            return delegate.invoke(This, dstname);
        }

    }

}