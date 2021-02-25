/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be passed to the {@link KHRDebug#eglDebugMessageControlKHR DebugMessageControlKHR} method.
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
@FunctionalInterface
@NativeType("EGLDEBUGPROCKHR")
public interface EGLDebugMessageKHRCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_void,
        ffi_type_uint32, ffi_type_pointer, ffi_type_sint32, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetInt(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE))
        );
    }

    /**
     * Will be called when a debug message is generated.
     *
     * @param error       will contain an EGL error code, or {@link EGL10#EGL_SUCCESS SUCCESS}, as applicable
     * @param command     will contain a pointer to a string. Example "eglBindApi".
     * @param messageType will contain one of the debug message types
     * @param threadLabel will contain the label attached to the current thread. The {@code threadLabel} will be {@code NULL} if not set by the application. If the message is from an
     *                    internal thread, the label will be {@code NULL}.
     * @param objectLabel will contain the label attached to the primary object of the message; Labels will be {@code NULL} if not set by the application. The primary object should
     *                    be the object the function operates on, see table 13.2 which provides the recommended mapping between functions and their primary object. This
     *                    {@code objectLabel} may be {@code NULL} even though the application labeled the object. This is because it is possible an error was raised while executing
     *                    the command before the primary object was validated, therefore its label can not be included in the callback.
     * @param message     will contain a platform specific debug string message; This string should provide added information to the application developer regarding the
     *                    condition that generated the message. The format of a message is implementation-defined, although it should represent a concise description of the
     *                    event that caused the message to be generated. Message strings can be {@code NULL} and should not be assumed otherwise.
     */
    void invoke(@NativeType("EGLenum") int error, @NativeType("char const *") long command, @NativeType("EGLint") int messageType, @NativeType("EGLLabelKHR") long threadLabel, @NativeType("EGLLabelKHR") long objectLabel, @NativeType("char const *") long message);

}