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
public abstract class CLMemObjectDestructorCallback extends Callback implements CLMemObjectDestructorCallbackI {

    /**
     * Creates a {@code CLMemObjectDestructorCallback} instance from the specified function pointer.
     *
     * @return the new {@code CLMemObjectDestructorCallback}
     */
    public static CLMemObjectDestructorCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CLMemObjectDestructorCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code CLMemObjectDestructorCallback} instance that delegates to the specified {@code CLMemObjectDestructorCallbackI} instance. */
    public static CLMemObjectDestructorCallback create(CLMemObjectDestructorCallbackI instance) { return create(instance, instance.address()); }

    private static CLMemObjectDestructorCallback create(CLMemObjectDestructorCallbackI instance, long functionPointer) {
        return instance instanceof CLMemObjectDestructorCallback
            ? (CLMemObjectDestructorCallback)instance
            : new CLMemObjectDestructorCallback(functionPointer) {
                @Override public void invoke(long memobj, long user_data) {
                    instance.invoke(memobj, user_data);
                }
            };
    }

    protected CLMemObjectDestructorCallback() {
        super(DESCRIPTOR);
    }

    CLMemObjectDestructorCallback(long functionPointer) {
        super(functionPointer);
    }

}