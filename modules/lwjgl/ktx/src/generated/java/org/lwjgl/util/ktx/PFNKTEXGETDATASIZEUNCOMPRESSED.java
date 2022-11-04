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
 *     ktxTexture *This
 * )</code></pre>
 */
public abstract class PFNKTEXGETDATASIZEUNCOMPRESSED extends Callback implements PFNKTEXGETDATASIZEUNCOMPRESSEDI {

    /**
     * Creates a {@code PFNKTEXGETDATASIZEUNCOMPRESSED} instance from the specified function pointer.
     *
     * @return the new {@code PFNKTEXGETDATASIZEUNCOMPRESSED}
     */
    public static PFNKTEXGETDATASIZEUNCOMPRESSED create(long functionPointer) {
        PFNKTEXGETDATASIZEUNCOMPRESSEDI instance = Callback.get(functionPointer);
        return instance instanceof PFNKTEXGETDATASIZEUNCOMPRESSED
            ? (PFNKTEXGETDATASIZEUNCOMPRESSED)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static PFNKTEXGETDATASIZEUNCOMPRESSED createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code PFNKTEXGETDATASIZEUNCOMPRESSED} instance that delegates to the specified {@code PFNKTEXGETDATASIZEUNCOMPRESSEDI} instance. */
    public static PFNKTEXGETDATASIZEUNCOMPRESSED create(PFNKTEXGETDATASIZEUNCOMPRESSEDI instance) {
        return instance instanceof PFNKTEXGETDATASIZEUNCOMPRESSED
            ? (PFNKTEXGETDATASIZEUNCOMPRESSED)instance
            : new Container(instance.address(), instance);
    }

    protected PFNKTEXGETDATASIZEUNCOMPRESSED() {
        super(CIF);
    }

    PFNKTEXGETDATASIZEUNCOMPRESSED(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends PFNKTEXGETDATASIZEUNCOMPRESSED {

        private final PFNKTEXGETDATASIZEUNCOMPRESSEDI delegate;

        Container(long functionPointer, PFNKTEXGETDATASIZEUNCOMPRESSEDI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long This) {
            return delegate.invoke(This);
        }

    }

}