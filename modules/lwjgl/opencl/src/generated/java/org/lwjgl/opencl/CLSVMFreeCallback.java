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
public abstract class CLSVMFreeCallback extends Callback implements CLSVMFreeCallbackI {

    /**
     * Creates a {@code CLSVMFreeCallback} instance from the specified function pointer.
     *
     * @return the new {@code CLSVMFreeCallback}
     */
    public static CLSVMFreeCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CLSVMFreeCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code CLSVMFreeCallback} instance that delegates to the specified {@code CLSVMFreeCallbackI} instance. */
    public static CLSVMFreeCallback create(CLSVMFreeCallbackI instance) { return create(instance, instance.address()); }

    private static CLSVMFreeCallback create(CLSVMFreeCallbackI instance, long functionPointer) {
        return instance instanceof CLSVMFreeCallback
            ? (CLSVMFreeCallback)instance
            : new CLSVMFreeCallback(functionPointer) {
                @Override public void invoke(long queue, int num_svm_pointers, long svm_pointers, long user_data) {
                    instance.invoke(queue, num_svm_pointers, svm_pointers, user_data);
                }
            };
    }

    protected CLSVMFreeCallback() {
        super(DESCRIPTOR);
    }

    CLSVMFreeCallback(long functionPointer) {
        super(functionPointer);
    }

}