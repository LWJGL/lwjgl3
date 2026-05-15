/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke nk_command_custom_callback} */
public abstract class NkCommandCustomCallback extends Callback implements NkCommandCustomCallbackI {

    /**
     * Creates a {@code NkCommandCustomCallback} instance from the specified function pointer.
     *
     * @return the new {@code NkCommandCustomCallback}
     */
    public static NkCommandCustomCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable NkCommandCustomCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code NkCommandCustomCallback} instance that delegates to the specified {@code NkCommandCustomCallbackI} instance. */
    public static NkCommandCustomCallback create(NkCommandCustomCallbackI instance) { return create(instance, instance.address()); }

    private static NkCommandCustomCallback create(NkCommandCustomCallbackI instance, long functionPointer) {
        return instance instanceof NkCommandCustomCallback
            ? (NkCommandCustomCallback)instance
            : new NkCommandCustomCallback(functionPointer) {
                @Override public long invoke(long canvas, short x, short y, short w, short h, long callback_data) {
                    return instance.invoke(canvas, x, y, w, h, callback_data);
                }
            };
    }

    protected NkCommandCustomCallback() {
        super(DESCRIPTOR);
    }

    NkCommandCustomCallback(long functionPointer) {
        super(functionPointer);
    }

}