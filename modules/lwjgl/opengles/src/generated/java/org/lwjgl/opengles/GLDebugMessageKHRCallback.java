/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke GLDEBUGPROCKHR} */
public abstract class GLDebugMessageKHRCallback extends Callback implements GLDebugMessageKHRCallbackI {

    /**
     * Creates a {@code GLDebugMessageKHRCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLDebugMessageKHRCallback}
     */
    public static GLDebugMessageKHRCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLDebugMessageKHRCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLDebugMessageKHRCallback} instance that delegates to the specified {@code GLDebugMessageKHRCallbackI} instance. */
    public static GLDebugMessageKHRCallback create(GLDebugMessageKHRCallbackI instance) { return create(instance, instance.address()); }

    private static GLDebugMessageKHRCallback create(GLDebugMessageKHRCallbackI instance, long functionPointer) {
        return instance instanceof GLDebugMessageKHRCallback
            ? (GLDebugMessageKHRCallback)instance
            : new GLDebugMessageKHRCallback(functionPointer) {
                @Override public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
                    instance.invoke(source, type, id, severity, length, message, userParam);
                }
            };
    }

    protected GLDebugMessageKHRCallback() {
        super(DESCRIPTOR);
    }

    GLDebugMessageKHRCallback(long functionPointer) {
        super(functionPointer);
    }

    /**
     * Converts the specified {@link GLDebugMessageKHRCallback} arguments to a String.
     *
     * <p>This method may only be used inside a GLDebugMessageKHRCallback invocation.</p>
     *
     * @param length  the GLDebugMessageKHRCallback {@code length} argument
     * @param message the GLDebugMessageKHRCallback {@code message} argument
     *
     * @return the message as a String
     */
    public static String getMessage(int length, long message) {
        return memUTF8(memByteBuffer(message, length));
    }

}