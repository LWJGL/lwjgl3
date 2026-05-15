/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke GLDEBUGPROCARB} */
public abstract class GLDebugMessageARBCallback extends Callback implements GLDebugMessageARBCallbackI {

    /**
     * Creates a {@code GLDebugMessageARBCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLDebugMessageARBCallback}
     */
    public static GLDebugMessageARBCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLDebugMessageARBCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLDebugMessageARBCallback} instance that delegates to the specified {@code GLDebugMessageARBCallbackI} instance. */
    public static GLDebugMessageARBCallback create(GLDebugMessageARBCallbackI instance) { return create(instance, instance.address()); }

    private static GLDebugMessageARBCallback create(GLDebugMessageARBCallbackI instance, long functionPointer) {
        return instance instanceof GLDebugMessageARBCallback
            ? (GLDebugMessageARBCallback)instance
            : new GLDebugMessageARBCallback(functionPointer) {
                @Override public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
                    instance.invoke(source, type, id, severity, length, message, userParam);
                }
            };
    }

    protected GLDebugMessageARBCallback() {
        super(DESCRIPTOR);
    }

    GLDebugMessageARBCallback(long functionPointer) {
        super(functionPointer);
    }

    /**
     * Converts the specified {@link GLDebugMessageARBCallback} arguments to a String.
     *
     * <p>This method may only be used inside a GLDebugMessageARBCallback invocation.</p>
     *
     * @param length  the GLDebugMessageARBCallback {@code length} argument
     * @param message the GLDebugMessageARBCallback {@code message} argument
     *
     * @return the message as a String
     */
    public static String getMessage(int length, long message) {
        return memUTF8(memByteBuffer(message, length));
    }

}