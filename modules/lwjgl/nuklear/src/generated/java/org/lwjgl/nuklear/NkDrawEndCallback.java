/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke nk_draw_end} */
public abstract class NkDrawEndCallback extends Callback implements NkDrawEndCallbackI {

    /**
     * Creates a {@code NkDrawEndCallback} instance from the specified function pointer.
     *
     * @return the new {@code NkDrawEndCallback}
     */
    public static NkDrawEndCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable NkDrawEndCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code NkDrawEndCallback} instance that delegates to the specified {@code NkDrawEndCallbackI} instance. */
    public static NkDrawEndCallback create(NkDrawEndCallbackI instance) { return create(instance, instance.address()); }

    private static NkDrawEndCallback create(NkDrawEndCallbackI instance, long functionPointer) {
        return instance instanceof NkDrawEndCallback
            ? (NkDrawEndCallback)instance
            : new NkDrawEndCallback(functionPointer) {
                @Override public float invoke(long buffer, long userdata) {
                    return instance.invoke(buffer, userdata);
                }
            };
    }

    protected NkDrawEndCallback() {
        super(DESCRIPTOR);
    }

    NkDrawEndCallback(long functionPointer) {
        super(functionPointer);
    }

}