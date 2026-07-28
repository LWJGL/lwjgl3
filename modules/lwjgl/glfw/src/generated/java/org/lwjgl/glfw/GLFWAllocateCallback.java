/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke GLFWallocatefun} */
public abstract class GLFWAllocateCallback extends Callback implements GLFWAllocateCallbackI {

    /**
     * Creates a {@code GLFWAllocateCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWAllocateCallback}
     */
    public static GLFWAllocateCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWAllocateCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWAllocateCallback} instance that delegates to the specified {@code GLFWAllocateCallbackI} instance. */
    public static GLFWAllocateCallback create(GLFWAllocateCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWAllocateCallback create(GLFWAllocateCallbackI instance, long functionPointer) {
        return instance instanceof GLFWAllocateCallback
            ? (GLFWAllocateCallback)instance
            : new GLFWAllocateCallback(functionPointer) {
                @Override public long invoke(long size, long user) {
                    return instance.invoke(size, user);
                }
            };
    }

    protected GLFWAllocateCallback() {
        super(DESCRIPTOR);
    }

    GLFWAllocateCallback(long functionPointer) {
        super(functionPointer);
    }

}