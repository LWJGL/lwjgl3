/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke stbir__kernel_callback *} */
public abstract class STBIRKernelCallback extends Callback implements STBIRKernelCallbackI {

    /**
     * Creates a {@code STBIRKernelCallback} instance from the specified function pointer.
     *
     * @return the new {@code STBIRKernelCallback}
     */
    public static STBIRKernelCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable STBIRKernelCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code STBIRKernelCallback} instance that delegates to the specified {@code STBIRKernelCallbackI} instance. */
    public static STBIRKernelCallback create(STBIRKernelCallbackI instance) { return create(instance, instance.address()); }

    private static STBIRKernelCallback create(STBIRKernelCallbackI instance, long functionPointer) {
        return instance instanceof STBIRKernelCallback
            ? (STBIRKernelCallback)instance
            : new STBIRKernelCallback(functionPointer) {
                @Override public float invoke(float x, float scale, long user_data) {
                    return instance.invoke(x, scale, user_data);
                }
            };
    }

    protected STBIRKernelCallback() {
        super(DESCRIPTOR);
    }

    STBIRKernelCallback(long functionPointer) {
        super(functionPointer);
    }

}