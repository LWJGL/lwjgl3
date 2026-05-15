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
public abstract class CLContextDestructorCallback extends Callback implements CLContextDestructorCallbackI {

    /**
     * Creates a {@code CLContextDestructorCallback} instance from the specified function pointer.
     *
     * @return the new {@code CLContextDestructorCallback}
     */
    public static CLContextDestructorCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CLContextDestructorCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code CLContextDestructorCallback} instance that delegates to the specified {@code CLContextDestructorCallbackI} instance. */
    public static CLContextDestructorCallback create(CLContextDestructorCallbackI instance) { return create(instance, instance.address()); }

    private static CLContextDestructorCallback create(CLContextDestructorCallbackI instance, long functionPointer) {
        return instance instanceof CLContextDestructorCallback
            ? (CLContextDestructorCallback)instance
            : new CLContextDestructorCallback(functionPointer) {
                @Override public void invoke(long context, long user_data) {
                    instance.invoke(context, user_data);
                }
            };
    }

    protected CLContextDestructorCallback() {
        super(DESCRIPTOR);
    }

    CLContextDestructorCallback(long functionPointer) {
        super(functionPointer);
    }

}