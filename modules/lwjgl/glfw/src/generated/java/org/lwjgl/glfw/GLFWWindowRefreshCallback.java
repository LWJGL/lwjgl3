/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Callback function: {@link #invoke GLFWwindowrefreshfun} */
public abstract class GLFWWindowRefreshCallback extends Callback implements GLFWWindowRefreshCallbackI {

    /**
     * Creates a {@code GLFWWindowRefreshCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWWindowRefreshCallback}
     */
    public static GLFWWindowRefreshCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWWindowRefreshCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWWindowRefreshCallback} instance that delegates to the specified {@code GLFWWindowRefreshCallbackI} instance. */
    public static GLFWWindowRefreshCallback create(GLFWWindowRefreshCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWWindowRefreshCallback create(GLFWWindowRefreshCallbackI instance, long functionPointer) {
        return instance instanceof GLFWWindowRefreshCallback
            ? (GLFWWindowRefreshCallback)instance
            : new GLFWWindowRefreshCallback(functionPointer) {
                @Override public void invoke(long window) {
                    instance.invoke(window);
                }
            };
    }

    protected GLFWWindowRefreshCallback() {
        super(DESCRIPTOR);
    }

    GLFWWindowRefreshCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetWindowRefreshCallback SetWindowRefreshCallback}. */
    public GLFWWindowRefreshCallback set(long window) {
        glfwSetWindowRefreshCallback(window, this);
        return this;
    }

}