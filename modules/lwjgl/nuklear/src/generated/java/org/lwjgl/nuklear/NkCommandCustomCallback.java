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
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*) (
 *     void *canvas,
 *     short x,
 *     short y,
 *     unsigned short w,
 *     unsigned short h,
 *     nk_handle callback_data
 * )</code></pre>
 */
public abstract class NkCommandCustomCallback extends Callback implements NkCommandCustomCallbackI {

    /**
     * Creates a {@code NkCommandCustomCallback} instance from the specified function pointer.
     *
     * @return the new {@code NkCommandCustomCallback}
     */
    public static NkCommandCustomCallback create(long functionPointer) {
        NkCommandCustomCallbackI instance = Callback.get(functionPointer);
        return instance instanceof NkCommandCustomCallback
            ? (NkCommandCustomCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static NkCommandCustomCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code NkCommandCustomCallback} instance that delegates to the specified {@code NkCommandCustomCallbackI} instance. */
    public static NkCommandCustomCallback create(NkCommandCustomCallbackI instance) {
        return instance instanceof NkCommandCustomCallback
            ? (NkCommandCustomCallback)instance
            : new Container(instance.address(), instance);
    }

    protected NkCommandCustomCallback() {
        super(CIF);
    }

    NkCommandCustomCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends NkCommandCustomCallback {

        private final NkCommandCustomCallbackI delegate;

        Container(long functionPointer, NkCommandCustomCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long canvas, short x, short y, short w, short h, long callback_data) {
            return delegate.invoke(canvas, x, y, w, h, callback_data);
        }

    }

}