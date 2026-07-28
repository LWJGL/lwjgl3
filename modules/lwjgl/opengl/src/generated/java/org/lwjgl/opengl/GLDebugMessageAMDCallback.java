/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke GLDEBUGPROCAMD} */
public abstract class GLDebugMessageAMDCallback extends Callback implements GLDebugMessageAMDCallbackI {

    /**
     * Creates a {@code GLDebugMessageAMDCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLDebugMessageAMDCallback}
     */
    public static GLDebugMessageAMDCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLDebugMessageAMDCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLDebugMessageAMDCallback} instance that delegates to the specified {@code GLDebugMessageAMDCallbackI} instance. */
    public static GLDebugMessageAMDCallback create(GLDebugMessageAMDCallbackI instance) { return create(instance, instance.address()); }

    private static GLDebugMessageAMDCallback create(GLDebugMessageAMDCallbackI instance, long functionPointer) {
        return instance instanceof GLDebugMessageAMDCallback
            ? (GLDebugMessageAMDCallback)instance
            : new GLDebugMessageAMDCallback(functionPointer) {
                @Override public void invoke(int id, int category, int severity, int length, long message, long userParam) {
                    instance.invoke(id, category, severity, length, message, userParam);
                }
            };
    }

    protected GLDebugMessageAMDCallback() {
        super(DESCRIPTOR);
    }

    GLDebugMessageAMDCallback(long functionPointer) {
        super(functionPointer);
    }

    /**
     * Converts the specified {@link GLDebugMessageAMDCallback} arguments to a String.
     *
     * <p>This method may only be used inside a GLDebugMessageAMDCallback invocation.</p>
     *
     * @param length  the GLDebugMessageAMDCallback {@code length} argument
     * @param message the GLDebugMessageAMDCallback {@code message} argument
     *
     * @return the message as a String
     */
    public static String getMessage(int length, long message) {
        return memUTF8(memByteBuffer(message, length));
    }

}