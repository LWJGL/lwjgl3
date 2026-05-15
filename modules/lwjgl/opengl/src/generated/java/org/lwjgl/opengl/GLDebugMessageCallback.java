/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke GLDEBUGPROC} */
public abstract class GLDebugMessageCallback extends Callback implements GLDebugMessageCallbackI {

    /**
     * Creates a {@code GLDebugMessageCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLDebugMessageCallback}
     */
    public static GLDebugMessageCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLDebugMessageCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLDebugMessageCallback} instance that delegates to the specified {@code GLDebugMessageCallbackI} instance. */
    public static GLDebugMessageCallback create(GLDebugMessageCallbackI instance) { return create(instance, instance.address()); }

    private static GLDebugMessageCallback create(GLDebugMessageCallbackI instance, long functionPointer) {
        return instance instanceof GLDebugMessageCallback
            ? (GLDebugMessageCallback)instance
            : new GLDebugMessageCallback(functionPointer) {
                @Override public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
                    instance.invoke(source, type, id, severity, length, message, userParam);
                }
            };
    }

    protected GLDebugMessageCallback() {
        super(DESCRIPTOR);
    }

    GLDebugMessageCallback(long functionPointer) {
        super(functionPointer);
    }

    /**
     * Converts the specified {@link GLDebugMessageCallback} arguments to a String.
     *
     * <p>This method may only be used inside a GLDebugMessageCallback invocation.</p>
     *
     * @param length  the GLDebugMessageCallback {@code length} argument
     * @param message the GLDebugMessageCallback {@code message} argument
     *
     * @return the message as a String
     */
    public static String getMessage(int length, long message) {
        return memUTF8(memByteBuffer(message, length));
    }

}