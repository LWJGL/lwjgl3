/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke GLFWreallocatefun} */
public abstract class GLFWReallocateCallback extends Callback implements GLFWReallocateCallbackI {

    /**
     * Creates a {@code GLFWReallocateCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWReallocateCallback}
     */
    public static GLFWReallocateCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWReallocateCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWReallocateCallback} instance that delegates to the specified {@code GLFWReallocateCallbackI} instance. */
    public static GLFWReallocateCallback create(GLFWReallocateCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWReallocateCallback create(GLFWReallocateCallbackI instance, long functionPointer) {
        return instance instanceof GLFWReallocateCallback
            ? (GLFWReallocateCallback)instance
            : new GLFWReallocateCallback(functionPointer) {
                @Override public long invoke(long block, long size, long user) {
                    return instance.invoke(block, size, user);
                }
            };
    }

    protected GLFWReallocateCallback() {
        super(DESCRIPTOR);
    }

    GLFWReallocateCallback(long functionPointer) {
        super(functionPointer);
    }

}