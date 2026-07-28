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

/** Callback function: {@link #invoke GLFWcharmodsfun} */
public abstract class GLFWCharModsCallback extends Callback implements GLFWCharModsCallbackI {

    /**
     * Creates a {@code GLFWCharModsCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWCharModsCallback}
     */
    public static GLFWCharModsCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWCharModsCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWCharModsCallback} instance that delegates to the specified {@code GLFWCharModsCallbackI} instance. */
    public static GLFWCharModsCallback create(GLFWCharModsCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWCharModsCallback create(GLFWCharModsCallbackI instance, long functionPointer) {
        return instance instanceof GLFWCharModsCallback
            ? (GLFWCharModsCallback)instance
            : new GLFWCharModsCallback(functionPointer) {
                @Override public void invoke(long window, int codepoint, int mods) {
                    instance.invoke(window, codepoint, mods);
                }
            };
    }

    protected GLFWCharModsCallback() {
        super(DESCRIPTOR);
    }

    GLFWCharModsCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetCharModsCallback SetCharModsCallback}. */
    public GLFWCharModsCallback set(long window) {
        glfwSetCharModsCallback(window, this);
        return this;
    }

}