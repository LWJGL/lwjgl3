/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link KHRDebug#glDebugMessageCallbackKHR DebugMessageCallbackKHR} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     GLenum source,
 *     GLenum type,
 *     GLuint id,
 *     GLenum severity,
 *     GLsizei length,
 *     GLchar const *message,
 *     void const *userParam
 * )</code></pre>
 */
public abstract class GLDebugMessageKHRCallback extends Callback implements GLDebugMessageKHRCallbackI {

    /**
     * Creates a {@code GLDebugMessageKHRCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLDebugMessageKHRCallback}
     */
    public static GLDebugMessageKHRCallback create(long functionPointer) {
        GLDebugMessageKHRCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLDebugMessageKHRCallback
            ? (GLDebugMessageKHRCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static GLDebugMessageKHRCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLDebugMessageKHRCallback} instance that delegates to the specified {@code GLDebugMessageKHRCallbackI} instance. */
    public static GLDebugMessageKHRCallback create(GLDebugMessageKHRCallbackI instance) {
        return instance instanceof GLDebugMessageKHRCallback
            ? (GLDebugMessageKHRCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLDebugMessageKHRCallback() {
        super(CIF);
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

    private static final class Container extends GLDebugMessageKHRCallback {

        private final GLDebugMessageKHRCallbackI delegate;

        Container(long functionPointer, GLDebugMessageKHRCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
            delegate.invoke(source, type, id, severity, length, message, userParam);
        }

    }

}