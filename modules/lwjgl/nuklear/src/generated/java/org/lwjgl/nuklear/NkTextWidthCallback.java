/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke nk_text_width_f} */
public abstract class NkTextWidthCallback extends Callback implements NkTextWidthCallbackI {

    /**
     * Creates a {@code NkTextWidthCallback} instance from the specified function pointer.
     *
     * @return the new {@code NkTextWidthCallback}
     */
    public static NkTextWidthCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable NkTextWidthCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code NkTextWidthCallback} instance that delegates to the specified {@code NkTextWidthCallbackI} instance. */
    public static NkTextWidthCallback create(NkTextWidthCallbackI instance) { return create(instance, instance.address()); }

    private static NkTextWidthCallback create(NkTextWidthCallbackI instance, long functionPointer) {
        return instance instanceof NkTextWidthCallback
            ? (NkTextWidthCallback)instance
            : new NkTextWidthCallback(functionPointer) {
                @Override public float invoke(long handle, float h, long text, int len) {
                    return instance.invoke(handle, h, text, len);
                }
            };
    }

    protected NkTextWidthCallback() {
        super(DESCRIPTOR);
    }

    NkTextWidthCallback(long functionPointer) {
        super(functionPointer);
    }

}