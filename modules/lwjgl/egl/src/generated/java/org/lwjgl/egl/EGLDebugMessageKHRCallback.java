/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be passed to the {@link KHRDebug#eglDebugMessageControlKHR DebugMessageControlKHR} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     EGLenum error,
 *     char const *command,
 *     EGLint messageType,
 *     EGLLabelKHR threadLabel,
 *     EGLLabelKHR objectLabel,
 *     char const *message
 * )</code></pre>
 */
public abstract class EGLDebugMessageKHRCallback extends Callback implements EGLDebugMessageKHRCallbackI {

    /**
     * Creates a {@code EGLDebugMessageKHRCallback} instance from the specified function pointer.
     *
     * @return the new {@code EGLDebugMessageKHRCallback}
     */
    public static EGLDebugMessageKHRCallback create(long functionPointer) {
        EGLDebugMessageKHRCallbackI instance = Callback.get(functionPointer);
        return instance instanceof EGLDebugMessageKHRCallback
            ? (EGLDebugMessageKHRCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static EGLDebugMessageKHRCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code EGLDebugMessageKHRCallback} instance that delegates to the specified {@code EGLDebugMessageKHRCallbackI} instance. */
    public static EGLDebugMessageKHRCallback create(EGLDebugMessageKHRCallbackI instance) {
        return instance instanceof EGLDebugMessageKHRCallback
            ? (EGLDebugMessageKHRCallback)instance
            : new Container(instance.address(), instance);
    }

    protected EGLDebugMessageKHRCallback() {
        super(CIF);
    }

    EGLDebugMessageKHRCallback(long functionPointer) {
        super(functionPointer);
    }

    /**
     * Converts the specified {@link EGLDebugMessageKHRCallback} argument to a String.
     *
     * <p>This method may only be used inside an EGLDebugMessageKHRCallback invocation.</p>
     *
     * @param command the EGLDebugMessageKHRCallback {@code command} argument
     *
     * @return the command as a String
     */
    public static String getCommand(long command) {
        return memASCII(command);
    }

    /**
     * Converts the specified {@link EGLDebugMessageKHRCallback} argument to a String.
     *
     * <p>This method may only be used inside an EGLDebugMessageKHRCallback invocation.</p>
     *
     * @param message the EGLDebugMessageKHRCallback {@code message} argument
     *
     * @return the message as a String
     */
    public static String getMessage(long message) {
        return memUTF8(message);
    }

    private static final class Container extends EGLDebugMessageKHRCallback {

        private final EGLDebugMessageKHRCallbackI delegate;

        Container(long functionPointer, EGLDebugMessageKHRCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int error, long command, int messageType, long threadLabel, long objectLabel, long message) {
            delegate.invoke(error, command, messageType, threadLabel, objectLabel, message);
        }

    }

}