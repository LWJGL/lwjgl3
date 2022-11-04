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
 * void (*{@link #invoke}) (
 *     ktxTexture *This
 * )</code></pre>
 */
public abstract class PFNKTEXDESTROY extends Callback implements PFNKTEXDESTROYI {

    /**
     * Creates a {@code PFNKTEXDESTROY} instance from the specified function pointer.
     *
     * @return the new {@code PFNKTEXDESTROY}
     */
    public static PFNKTEXDESTROY create(long functionPointer) {
        PFNKTEXDESTROYI instance = Callback.get(functionPointer);
        return instance instanceof PFNKTEXDESTROY
            ? (PFNKTEXDESTROY)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static PFNKTEXDESTROY createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code PFNKTEXDESTROY} instance that delegates to the specified {@code PFNKTEXDESTROYI} instance. */
    public static PFNKTEXDESTROY create(PFNKTEXDESTROYI instance) {
        return instance instanceof PFNKTEXDESTROY
            ? (PFNKTEXDESTROY)instance
            : new Container(instance.address(), instance);
    }

    protected PFNKTEXDESTROY() {
        super(CIF);
    }

    PFNKTEXDESTROY(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends PFNKTEXDESTROY {

        private final PFNKTEXDESTROYI delegate;

        Container(long functionPointer, PFNKTEXDESTROYI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long This) {
            delegate.invoke(This);
        }

    }

}