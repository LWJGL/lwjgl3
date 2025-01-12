/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke nk_draw_begin} */
public abstract class NkDrawBeginCallback extends Callback implements NkDrawBeginCallbackI {

    /**
     * Creates a {@code NkDrawBeginCallback} instance from the specified function pointer.
     *
     * @return the new {@code NkDrawBeginCallback}
     */
    public static NkDrawBeginCallback create(long functionPointer) {
        NkDrawBeginCallbackI instance = Callback.get(functionPointer);
        return instance instanceof NkDrawBeginCallback
            ? (NkDrawBeginCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable NkDrawBeginCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code NkDrawBeginCallback} instance that delegates to the specified {@code NkDrawBeginCallbackI} instance. */
    public static NkDrawBeginCallback create(NkDrawBeginCallbackI instance) {
        return instance instanceof NkDrawBeginCallback
            ? (NkDrawBeginCallback)instance
            : new Container(instance.address(), instance);
    }

    protected NkDrawBeginCallback() {
        super(CIF);
    }

    NkDrawBeginCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends NkDrawBeginCallback {

        private final NkDrawBeginCallbackI delegate;

        Container(long functionPointer, NkDrawBeginCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public float invoke(long buffer, long userdata) {
            return delegate.invoke(buffer, userdata);
        }

    }

}