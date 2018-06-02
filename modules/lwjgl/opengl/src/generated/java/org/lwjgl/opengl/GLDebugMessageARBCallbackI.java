/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be passed to the {@link ARBDebugOutput#glDebugMessageCallbackARB DebugMessageCallbackARB} method.
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
@NativeType("GLDEBUGPROCARB")
public interface GLDebugMessageARBCallbackI extends CallbackI.V {

    String SIGNATURE = Callback.__stdcall("(iiiiipp)v");

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgInt(args),
            dcbArgInt(args),
            dcbArgInt(args),
            dcbArgInt(args),
            dcbArgInt(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
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
     * @param userParam the user-specified value that was passed when calling {@link ARBDebugOutput#glDebugMessageCallbackARB DebugMessageCallbackARB}
     */
    void invoke(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLsizei") int length, @NativeType("GLchar const *") long message, @NativeType("void const *") long userParam);

}