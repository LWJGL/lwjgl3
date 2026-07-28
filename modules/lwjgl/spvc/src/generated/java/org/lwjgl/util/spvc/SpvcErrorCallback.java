/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spvc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke spvc_error_callback} */
public abstract class SpvcErrorCallback extends Callback implements SpvcErrorCallbackI {

    /**
     * Creates a {@code SpvcErrorCallback} instance from the specified function pointer.
     *
     * @return the new {@code SpvcErrorCallback}
     */
    public static SpvcErrorCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SpvcErrorCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SpvcErrorCallback} instance that delegates to the specified {@code SpvcErrorCallbackI} instance. */
    public static SpvcErrorCallback create(SpvcErrorCallbackI instance) { return create(instance, instance.address()); }

    private static SpvcErrorCallback create(SpvcErrorCallbackI instance, long functionPointer) {
        return instance instanceof SpvcErrorCallback
            ? (SpvcErrorCallback)instance
            : new SpvcErrorCallback(functionPointer) {
                @Override public void invoke(long userdata, long error) {
                    instance.invoke(userdata, error);
                }
            };
    }

    protected SpvcErrorCallback() {
        super(DESCRIPTOR);
    }

    SpvcErrorCallback(long functionPointer) {
        super(functionPointer);
    }

    /**
     * Converts the specified {@code spvc_error_callback} argument to a String.
     *
     * <p>This method may only be used inside a {@code SpvcErrorCallback} invocation.</p>
     *
     * @param error the error argument to decode
     *
     * @return the error message as a String
     */
    public static String getError(long error) {
        return memUTF8(error);
    }

}