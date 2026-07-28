/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke GLFWdeallocatefun} */
public abstract class GLFWDeallocateCallback extends Callback implements GLFWDeallocateCallbackI {

    /**
     * Creates a {@code GLFWDeallocateCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWDeallocateCallback}
     */
    public static GLFWDeallocateCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWDeallocateCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWDeallocateCallback} instance that delegates to the specified {@code GLFWDeallocateCallbackI} instance. */
    public static GLFWDeallocateCallback create(GLFWDeallocateCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWDeallocateCallback create(GLFWDeallocateCallbackI instance, long functionPointer) {
        return instance instanceof GLFWDeallocateCallback
            ? (GLFWDeallocateCallback)instance
            : new GLFWDeallocateCallback(functionPointer) {
                @Override public void invoke(long block, long user) {
                    instance.invoke(block, user);
                }
            };
    }

    protected GLFWDeallocateCallback() {
        super(DESCRIPTOR);
    }

    GLFWDeallocateCallback(long functionPointer) {
        super(functionPointer);
    }

}