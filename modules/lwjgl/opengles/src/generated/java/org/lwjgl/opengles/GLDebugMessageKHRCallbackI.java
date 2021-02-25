/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be passed to the {@link KHRDebug#glDebugMessageCallbackKHR DebugMessageCallbackKHR} method.
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
@FunctionalInterface
@NativeType("GLDEBUGPROCKHR")
public interface GLDebugMessageKHRCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_void,
        ffi_type_uint32, ffi_type_uint32, ffi_type_uint32, ffi_type_uint32, ffi_type_sint32, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetInt(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 6 * POINTER_SIZE))
        );
    }

    /**
     * Will be called when a debug message is generated.
     *
     * @param source    the message source
     * @param type      the message type
     * @param id        the message ID
     * @param severity  the message severity
     * @param length    the message length, excluding the null-terminator
     * @param message   a pointer to the message string representation
     * @param userParam the user-specified value that was passed when calling {@link KHRDebug#glDebugMessageCallbackKHR DebugMessageCallbackKHR}
     */
    void invoke(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLsizei") int length, @NativeType("GLchar const *") long message, @NativeType("void const *") long userParam);

}