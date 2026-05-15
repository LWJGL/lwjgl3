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
public abstract class CLProgramCallback extends Callback implements CLProgramCallbackI {

    /**
     * Creates a {@code CLProgramCallback} instance from the specified function pointer.
     *
     * @return the new {@code CLProgramCallback}
     */
    public static CLProgramCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CLProgramCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code CLProgramCallback} instance that delegates to the specified {@code CLProgramCallbackI} instance. */
    public static CLProgramCallback create(CLProgramCallbackI instance) { return create(instance, instance.address()); }

    private static CLProgramCallback create(CLProgramCallbackI instance, long functionPointer) {
        return instance instanceof CLProgramCallback
            ? (CLProgramCallback)instance
            : new CLProgramCallback(functionPointer) {
                @Override public void invoke(long program, long user_data) {
                    instance.invoke(program, user_data);
                }
            };
    }

    protected CLProgramCallback() {
        super(DESCRIPTOR);
    }

    CLProgramCallback(long functionPointer) {
        super(functionPointer);
    }

}