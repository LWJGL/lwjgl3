/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to the {@link NkUserFont} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * float (*) (
 *     nk_handle handle,
 *     float h,
 *     char const *text,
 *     int len
 * )</code></pre>
 */
public abstract class NkTextWidthCallback extends Callback implements NkTextWidthCallbackI {

    /**
     * Creates a {@code NkTextWidthCallback} instance from the specified function pointer.
     *
     * @return the new {@code NkTextWidthCallback}
     */
    public static NkTextWidthCallback create(long functionPointer) {
        NkTextWidthCallbackI instance = Callback.get(functionPointer);
        return instance instanceof NkTextWidthCallback
            ? (NkTextWidthCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static NkTextWidthCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code NkTextWidthCallback} instance that delegates to the specified {@code NkTextWidthCallbackI} instance. */
    public static NkTextWidthCallback create(NkTextWidthCallbackI instance) {
        return instance instanceof NkTextWidthCallback
            ? (NkTextWidthCallback)instance
            : new Container(instance.address(), instance);
    }

    protected NkTextWidthCallback() {
        super(CIF);
    }

    NkTextWidthCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends NkTextWidthCallback {

        private final NkTextWidthCallbackI delegate;

        Container(long functionPointer, NkTextWidthCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public float invoke(long handle, float h, long text, int len) {
            return delegate.invoke(handle, h, text, len);
        }

    }

}