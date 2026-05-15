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
public abstract class CLProgramReleaseCallback extends Callback implements CLProgramReleaseCallbackI {

    /**
     * Creates a {@code CLProgramReleaseCallback} instance from the specified function pointer.
     *
     * @return the new {@code CLProgramReleaseCallback}
     */
    public static CLProgramReleaseCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CLProgramReleaseCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code CLProgramReleaseCallback} instance that delegates to the specified {@code CLProgramReleaseCallbackI} instance. */
    public static CLProgramReleaseCallback create(CLProgramReleaseCallbackI instance) { return create(instance, instance.address()); }

    private static CLProgramReleaseCallback create(CLProgramReleaseCallbackI instance, long functionPointer) {
        return instance instanceof CLProgramReleaseCallback
            ? (CLProgramReleaseCallback)instance
            : new CLProgramReleaseCallback(functionPointer) {
                @Override public void invoke(long program, long user_data) {
                    instance.invoke(program, user_data);
                }
            };
    }

    protected CLProgramReleaseCallback() {
        super(DESCRIPTOR);
    }

    CLProgramReleaseCallback(long functionPointer) {
        super(functionPointer);
    }

}