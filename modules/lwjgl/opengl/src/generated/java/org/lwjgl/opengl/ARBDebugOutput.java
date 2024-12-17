/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ARBDebugOutput {

    static { GL.initialize(); }

    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS_ARB = 0x8242;

    public static final int
        GL_MAX_DEBUG_MESSAGE_LENGTH_ARB         = 0x9143,
        GL_MAX_DEBUG_LOGGED_MESSAGES_ARB        = 0x9144,
        GL_DEBUG_LOGGED_MESSAGES_ARB            = 0x9145,
        GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_ARB = 0x8243;

    public static final int
        GL_DEBUG_CALLBACK_FUNCTION_ARB   = 0x8244,
        GL_DEBUG_CALLBACK_USER_PARAM_ARB = 0x8245;

    public static final int
        GL_DEBUG_SOURCE_API_ARB             = 0x8246,
        GL_DEBUG_SOURCE_WINDOW_SYSTEM_ARB   = 0x8247,
        GL_DEBUG_SOURCE_SHADER_COMPILER_ARB = 0x8248,
        GL_DEBUG_SOURCE_THIRD_PARTY_ARB     = 0x8249,
        GL_DEBUG_SOURCE_APPLICATION_ARB     = 0x824A,
        GL_DEBUG_SOURCE_OTHER_ARB           = 0x824B;

    public static final int
        GL_DEBUG_TYPE_ERROR_ARB               = 0x824C,
        GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_ARB = 0x824D,
        GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_ARB  = 0x824E,
        GL_DEBUG_TYPE_PORTABILITY_ARB         = 0x824F,
        GL_DEBUG_TYPE_PERFORMANCE_ARB         = 0x8250,
        GL_DEBUG_TYPE_OTHER_ARB               = 0x8251;

    public static final int
        GL_DEBUG_SEVERITY_HIGH_ARB   = 0x9146,
        GL_DEBUG_SEVERITY_MEDIUM_ARB = 0x9147,
        GL_DEBUG_SEVERITY_LOW_ARB    = 0x9148;

    protected ARBDebugOutput() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDebugMessageControlARB ] ---

    /** {@code void glDebugMessageControlARB(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static native void nglDebugMessageControlARB(int source, int type, int severity, int count, long ids, boolean enabled);

    /** {@code void glDebugMessageControlARB(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControlARB(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") @Nullable IntBuffer ids, @NativeType("GLboolean") boolean enabled) {
        nglDebugMessageControlARB(source, type, severity, remainingSafe(ids), memAddressSafe(ids), enabled);
    }

    /** {@code void glDebugMessageControlARB(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControlARB(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") int id, @NativeType("GLboolean") boolean enabled) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.ints(id);
            nglDebugMessageControlARB(source, type, severity, 1, memAddress(ids), enabled);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDebugMessageInsertARB ] ---

    /** {@code void glDebugMessageInsertARB(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * buf)} */
    public static native void nglDebugMessageInsertARB(int source, int type, int id, int severity, int length, long buf);

    /** {@code void glDebugMessageInsertARB(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * buf)} */
    public static void glDebugMessageInsertARB(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLchar const *") ByteBuffer buf) {
        nglDebugMessageInsertARB(source, type, id, severity, buf.remaining(), memAddress(buf));
    }

    /** {@code void glDebugMessageInsertARB(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * buf)} */
    public static void glDebugMessageInsertARB(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLchar const *") CharSequence buf) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int bufEncodedLength = stack.nUTF8(buf, false);
            long bufEncoded = stack.getPointerAddress();
            nglDebugMessageInsertARB(source, type, id, severity, bufEncodedLength, bufEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDebugMessageCallbackARB ] ---

    /** {@code void glDebugMessageCallbackARB(GLDEBUGPROCARB callback, void const * userParam)} */
    public static native void nglDebugMessageCallbackARB(long callback, long userParam);

    /** {@code void glDebugMessageCallbackARB(GLDEBUGPROCARB callback, void const * userParam)} */
    public static void glDebugMessageCallbackARB(@NativeType("GLDEBUGPROCARB") @Nullable GLDebugMessageARBCallbackI callback, @NativeType("void const *") long userParam) {
        nglDebugMessageCallbackARB(memAddressSafe(callback), userParam);
    }

    // --- [ glGetDebugMessageLogARB ] ---

    /** {@code GLuint glGetDebugMessageLogARB(GLuint count, GLsizei bufSize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    public static native int nglGetDebugMessageLogARB(int count, int bufSize, long sources, long types, long ids, long severities, long lengths, long messageLog);

    /** {@code GLuint glGetDebugMessageLogARB(GLuint count, GLsizei bufSize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    @NativeType("GLuint")
    public static int glGetDebugMessageLogARB(@NativeType("GLuint") int count, @NativeType("GLenum *") @Nullable IntBuffer sources, @NativeType("GLenum *") @Nullable IntBuffer types, @NativeType("GLuint *") @Nullable IntBuffer ids, @NativeType("GLenum *") @Nullable IntBuffer severities, @NativeType("GLsizei *") @Nullable IntBuffer lengths, @NativeType("GLchar *") @Nullable ByteBuffer messageLog) {
        if (CHECKS) {
            checkSafe(sources, count);
            checkSafe(types, count);
            checkSafe(ids, count);
            checkSafe(severities, count);
            checkSafe(lengths, count);
        }
        return nglGetDebugMessageLogARB(count, remainingSafe(messageLog), memAddressSafe(sources), memAddressSafe(types), memAddressSafe(ids), memAddressSafe(severities), memAddressSafe(lengths), memAddressSafe(messageLog));
    }

    /** {@code void glDebugMessageControlARB(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControlARB(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") int @Nullable [] ids, @NativeType("GLboolean") boolean enabled) {
        long __functionAddress = GL.getICD().glDebugMessageControlARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(source, type, severity, lengthSafe(ids), ids, enabled, __functionAddress);
    }

    /** {@code GLuint glGetDebugMessageLogARB(GLuint count, GLsizei bufSize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    @NativeType("GLuint")
    public static int glGetDebugMessageLogARB(@NativeType("GLuint") int count, @NativeType("GLenum *") int @Nullable [] sources, @NativeType("GLenum *") int @Nullable [] types, @NativeType("GLuint *") int @Nullable [] ids, @NativeType("GLenum *") int @Nullable [] severities, @NativeType("GLsizei *") int @Nullable [] lengths, @NativeType("GLchar *") @Nullable ByteBuffer messageLog) {
        long __functionAddress = GL.getICD().glGetDebugMessageLogARB;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(sources, count);
            checkSafe(types, count);
            checkSafe(ids, count);
            checkSafe(severities, count);
            checkSafe(lengths, count);
        }
        return callPPPPPPI(count, remainingSafe(messageLog), sources, types, ids, severities, lengths, memAddressSafe(messageLog), __functionAddress);
    }

}