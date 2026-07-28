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
public abstract class CLNativeKernel extends Callback implements CLNativeKernelI {

    /**
     * Creates a {@code CLNativeKernel} instance from the specified function pointer.
     *
     * @return the new {@code CLNativeKernel}
     */
    public static CLNativeKernel create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CLNativeKernel createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code CLNativeKernel} instance that delegates to the specified {@code CLNativeKernelI} instance. */
    public static CLNativeKernel create(CLNativeKernelI instance) { return create(instance, instance.address()); }

    private static CLNativeKernel create(CLNativeKernelI instance, long functionPointer) {
        return instance instanceof CLNativeKernel
            ? (CLNativeKernel)instance
            : new CLNativeKernel(functionPointer) {
                @Override public void invoke(long args) {
                    instance.invoke(args);
                }
            };
    }

    protected CLNativeKernel() {
        super(DESCRIPTOR);
    }

    CLNativeKernel(long functionPointer) {
        super(functionPointer);
    }

}