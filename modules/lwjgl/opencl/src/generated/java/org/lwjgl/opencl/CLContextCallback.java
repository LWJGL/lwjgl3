/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class CLContextCallback extends Callback implements CLContextCallbackI {

    /**
     * Creates a {@code CLContextCallback} instance from the specified function pointer.
     *
     * @return the new {@code CLContextCallback}
     */
    public static CLContextCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CLContextCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code CLContextCallback} instance that delegates to the specified {@code CLContextCallbackI} instance. */
    public static CLContextCallback create(CLContextCallbackI instance) { return create(instance, instance.address()); }

    private static CLContextCallback create(CLContextCallbackI instance, long functionPointer) {
        return instance instanceof CLContextCallback
            ? (CLContextCallback)instance
            : new CLContextCallback(functionPointer) {
                @Override public void invoke(long errinfo, long private_info, long cb, long user_data) {
                    instance.invoke(errinfo, private_info, cb, user_data);
                }
            };
    }

    protected CLContextCallback() {
        super(DESCRIPTOR);
    }

    CLContextCallback(long functionPointer) {
        super(functionPointer);
    }

}