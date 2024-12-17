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

public class AMDDebugOutput {

    static { GL.initialize(); }

    public static final int
        GL_MAX_DEBUG_MESSAGE_LENGTH_AMD  = 0x9143,
        GL_MAX_DEBUG_LOGGED_MESSAGES_AMD = 0x9144,
        GL_DEBUG_LOGGED_MESSAGES_AMD     = 0x9145;

    public static final int
        GL_DEBUG_SEVERITY_HIGH_AMD   = 0x9146,
        GL_DEBUG_SEVERITY_MEDIUM_AMD = 0x9147,
        GL_DEBUG_SEVERITY_LOW_AMD    = 0x9148;

    public static final int
        GL_DEBUG_CATEGORY_API_ERROR_AMD          = 0x9149,
        GL_DEBUG_CATEGORY_WINDOW_SYSTEM_AMD      = 0x914A,
        GL_DEBUG_CATEGORY_DEPRECATION_AMD        = 0x914B,
        GL_DEBUG_CATEGORY_UNDEFINED_BEHAVIOR_AMD = 0x914C,
        GL_DEBUG_CATEGORY_PERFORMANCE_AMD        = 0x914D,
        GL_DEBUG_CATEGORY_SHADER_COMPILER_AMD    = 0x914E,
        GL_DEBUG_CATEGORY_APPLICATION_AMD        = 0x914F,
        GL_DEBUG_CATEGORY_OTHER_AMD              = 0x9150;

    protected AMDDebugOutput() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDebugMessageEnableAMD ] ---

    /** {@code void glDebugMessageEnableAMD(GLenum category, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static native void nglDebugMessageEnableAMD(int category, int severity, int count, long ids, boolean enabled);

    /** {@code void glDebugMessageEnableAMD(GLenum category, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageEnableAMD(@NativeType("GLenum") int category, @NativeType("GLenum") int severity, @NativeType("GLuint const *") @Nullable IntBuffer ids, @NativeType("GLboolean") boolean enabled) {
        nglDebugMessageEnableAMD(category, severity, remainingSafe(ids), memAddressSafe(ids), enabled);
    }

    /** {@code void glDebugMessageEnableAMD(GLenum category, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageEnableAMD(@NativeType("GLenum") int category, @NativeType("GLenum") int severity, @NativeType("GLuint const *") int id, @NativeType("GLboolean") boolean enabled) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.ints(id);
            nglDebugMessageEnableAMD(category, severity, 1, memAddress(ids), enabled);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDebugMessageInsertAMD ] ---

    /** {@code void glDebugMessageInsertAMD(GLenum category, GLenum severity, GLuint id, GLsizei length, GLchar const * buf)} */
    public static native void nglDebugMessageInsertAMD(int category, int severity, int id, int length, long buf);

    /** {@code void glDebugMessageInsertAMD(GLenum category, GLenum severity, GLuint id, GLsizei length, GLchar const * buf)} */
    public static void glDebugMessageInsertAMD(@NativeType("GLenum") int category, @NativeType("GLenum") int severity, @NativeType("GLuint") int id, @NativeType("GLchar const *") ByteBuffer buf) {
        nglDebugMessageInsertAMD(category, severity, id, buf.remaining(), memAddress(buf));
    }

    /** {@code void glDebugMessageInsertAMD(GLenum category, GLenum severity, GLuint id, GLsizei length, GLchar const * buf)} */
    public static void glDebugMessageInsertAMD(@NativeType("GLenum") int category, @NativeType("GLenum") int severity, @NativeType("GLuint") int id, @NativeType("GLchar const *") CharSequence buf) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int bufEncodedLength = stack.nUTF8(buf, false);
            long bufEncoded = stack.getPointerAddress();
            nglDebugMessageInsertAMD(category, severity, id, bufEncodedLength, bufEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDebugMessageCallbackAMD ] ---

    /** {@code void glDebugMessageCallbackAMD(GLDEBUGPROCAMD callback, void * userParam)} */
    public static native void nglDebugMessageCallbackAMD(long callback, long userParam);

    /** {@code void glDebugMessageCallbackAMD(GLDEBUGPROCAMD callback, void * userParam)} */
    public static void glDebugMessageCallbackAMD(@NativeType("GLDEBUGPROCAMD") @Nullable GLDebugMessageAMDCallbackI callback, @NativeType("void *") long userParam) {
        nglDebugMessageCallbackAMD(memAddressSafe(callback), userParam);
    }

    // --- [ glGetDebugMessageLogAMD ] ---

    /** {@code GLuint glGetDebugMessageLogAMD(GLuint count, GLsizei bufsize, GLenum * categories, GLenum * severities, GLuint * ids, GLsizei * lengths, GLchar * messageLog)} */
    public static native int nglGetDebugMessageLogAMD(int count, int bufsize, long categories, long severities, long ids, long lengths, long messageLog);

    /** {@code GLuint glGetDebugMessageLogAMD(GLuint count, GLsizei bufsize, GLenum * categories, GLenum * severities, GLuint * ids, GLsizei * lengths, GLchar * messageLog)} */
    @NativeType("GLuint")
    public static int glGetDebugMessageLogAMD(@NativeType("GLuint") int count, @NativeType("GLenum *") @Nullable IntBuffer categories, @NativeType("GLenum *") @Nullable IntBuffer severities, @NativeType("GLuint *") @Nullable IntBuffer ids, @NativeType("GLsizei *") @Nullable IntBuffer lengths, @NativeType("GLchar *") @Nullable ByteBuffer messageLog) {
        if (CHECKS) {
            checkSafe(categories, count);
            checkSafe(severities, count);
            checkSafe(ids, count);
            checkSafe(lengths, count);
        }
        return nglGetDebugMessageLogAMD(count, remainingSafe(messageLog), memAddressSafe(categories), memAddressSafe(severities), memAddressSafe(ids), memAddressSafe(lengths), memAddressSafe(messageLog));
    }

    /** {@code void glDebugMessageEnableAMD(GLenum category, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageEnableAMD(@NativeType("GLenum") int category, @NativeType("GLenum") int severity, @NativeType("GLuint const *") int @Nullable [] ids, @NativeType("GLboolean") boolean enabled) {
        long __functionAddress = GL.getICD().glDebugMessageEnableAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(category, severity, lengthSafe(ids), ids, enabled, __functionAddress);
    }

    /** {@code GLuint glGetDebugMessageLogAMD(GLuint count, GLsizei bufsize, GLenum * categories, GLenum * severities, GLuint * ids, GLsizei * lengths, GLchar * messageLog)} */
    @NativeType("GLuint")
    public static int glGetDebugMessageLogAMD(@NativeType("GLuint") int count, @NativeType("GLenum *") int @Nullable [] categories, @NativeType("GLenum *") int @Nullable [] severities, @NativeType("GLuint *") int @Nullable [] ids, @NativeType("GLsizei *") int @Nullable [] lengths, @NativeType("GLchar *") @Nullable ByteBuffer messageLog) {
        long __functionAddress = GL.getICD().glGetDebugMessageLogAMD;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(categories, count);
            checkSafe(severities, count);
            checkSafe(ids, count);
            checkSafe(lengths, count);
        }
        return callPPPPPI(count, remainingSafe(messageLog), categories, severities, ids, lengths, memAddressSafe(messageLog), __functionAddress);
    }

}