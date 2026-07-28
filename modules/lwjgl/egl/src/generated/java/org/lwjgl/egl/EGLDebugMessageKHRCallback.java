/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke EGLDEBUGPROCKHR} */
public abstract class EGLDebugMessageKHRCallback extends Callback implements EGLDebugMessageKHRCallbackI {

    /**
     * Creates a {@code EGLDebugMessageKHRCallback} instance from the specified function pointer.
     *
     * @return the new {@code EGLDebugMessageKHRCallback}
     */
    public static EGLDebugMessageKHRCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable EGLDebugMessageKHRCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code EGLDebugMessageKHRCallback} instance that delegates to the specified {@code EGLDebugMessageKHRCallbackI} instance. */
    public static EGLDebugMessageKHRCallback create(EGLDebugMessageKHRCallbackI instance) { return create(instance, instance.address()); }

    private static EGLDebugMessageKHRCallback create(EGLDebugMessageKHRCallbackI instance, long functionPointer) {
        return instance instanceof EGLDebugMessageKHRCallback
            ? (EGLDebugMessageKHRCallback)instance
            : new EGLDebugMessageKHRCallback(functionPointer) {
                @Override public void invoke(int error, long command, int messageType, long threadLabel, long objectLabel, long message) {
                    instance.invoke(error, command, messageType, threadLabel, objectLabel, message);
                }
            };
    }

    protected EGLDebugMessageKHRCallback() {
        super(DESCRIPTOR);
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

}