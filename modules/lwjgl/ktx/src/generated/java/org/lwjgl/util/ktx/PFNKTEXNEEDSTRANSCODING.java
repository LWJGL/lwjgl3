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
 * ktx_bool_t (*{@link #invoke}) (
 *     ktxTexture *This
 * )</code></pre>
 */
public abstract class PFNKTEXNEEDSTRANSCODING extends Callback implements PFNKTEXNEEDSTRANSCODINGI {

    /**
     * Creates a {@code PFNKTEXNEEDSTRANSCODING} instance from the specified function pointer.
     *
     * @return the new {@code PFNKTEXNEEDSTRANSCODING}
     */
    public static PFNKTEXNEEDSTRANSCODING create(long functionPointer) {
        PFNKTEXNEEDSTRANSCODINGI instance = Callback.get(functionPointer);
        return instance instanceof PFNKTEXNEEDSTRANSCODING
            ? (PFNKTEXNEEDSTRANSCODING)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static PFNKTEXNEEDSTRANSCODING createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code PFNKTEXNEEDSTRANSCODING} instance that delegates to the specified {@code PFNKTEXNEEDSTRANSCODINGI} instance. */
    public static PFNKTEXNEEDSTRANSCODING create(PFNKTEXNEEDSTRANSCODINGI instance) {
        return instance instanceof PFNKTEXNEEDSTRANSCODING
            ? (PFNKTEXNEEDSTRANSCODING)instance
            : new Container(instance.address(), instance);
    }

    protected PFNKTEXNEEDSTRANSCODING() {
        super(CIF);
    }

    PFNKTEXNEEDSTRANSCODING(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends PFNKTEXNEEDSTRANSCODING {

        private final PFNKTEXNEEDSTRANSCODINGI delegate;

        Container(long functionPointer, PFNKTEXNEEDSTRANSCODINGI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long This) {
            return delegate.invoke(This);
        }

    }

}