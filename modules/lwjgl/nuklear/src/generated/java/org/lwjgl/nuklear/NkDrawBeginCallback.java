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
    public static NkDrawBeginCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable NkDrawBeginCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code NkDrawBeginCallback} instance that delegates to the specified {@code NkDrawBeginCallbackI} instance. */
    public static NkDrawBeginCallback create(NkDrawBeginCallbackI instance) { return create(instance, instance.address()); }

    private static NkDrawBeginCallback create(NkDrawBeginCallbackI instance, long functionPointer) {
        return instance instanceof NkDrawBeginCallback
            ? (NkDrawBeginCallback)instance
            : new NkDrawBeginCallback(functionPointer) {
                @Override public float invoke(long buffer, long userdata) {
                    return instance.invoke(buffer, userdata);
                }
            };
    }

    protected NkDrawBeginCallback() {
        super(DESCRIPTOR);
    }

    NkDrawBeginCallback(long functionPointer) {
        super(functionPointer);
    }

}