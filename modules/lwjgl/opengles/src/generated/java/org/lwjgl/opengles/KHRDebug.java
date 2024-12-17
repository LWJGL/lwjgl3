/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRDebug {

    static { GLES.initialize(); }

    public static final int
        GL_DEBUG_OUTPUT_KHR             = 0x92E0,
        GL_DEBUG_OUTPUT_SYNCHRONOUS_KHR = 0x8242;

    public static final int GL_CONTEXT_FLAG_DEBUG_BIT_KHR = 0x2;

    public static final int
        GL_MAX_DEBUG_MESSAGE_LENGTH_KHR         = 0x9143,
        GL_MAX_DEBUG_LOGGED_MESSAGES_KHR        = 0x9144,
        GL_DEBUG_LOGGED_MESSAGES_KHR            = 0x9145,
        GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_KHR = 0x8243,
        GL_MAX_DEBUG_GROUP_STACK_DEPTH_KHR      = 0x826C,
        GL_DEBUG_GROUP_STACK_DEPTH_KHR          = 0x826D,
        GL_MAX_LABEL_LENGTH_KHR                 = 0x82E8;

    public static final int
        GL_DEBUG_CALLBACK_FUNCTION_KHR   = 0x8244,
        GL_DEBUG_CALLBACK_USER_PARAM_KHR = 0x8245;

    public static final int
        GL_DEBUG_SOURCE_API_KHR             = 0x8246,
        GL_DEBUG_SOURCE_WINDOW_SYSTEM_KHR   = 0x8247,
        GL_DEBUG_SOURCE_SHADER_COMPILER_KHR = 0x8248,
        GL_DEBUG_SOURCE_THIRD_PARTY_KHR     = 0x8249,
        GL_DEBUG_SOURCE_APPLICATION_KHR     = 0x824A,
        GL_DEBUG_SOURCE_OTHER_KHR           = 0x824B;

    public static final int
        GL_DEBUG_TYPE_ERROR_KHR               = 0x824C,
        GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_KHR = 0x824D,
        GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_KHR  = 0x824E,
        GL_DEBUG_TYPE_PORTABILITY_KHR         = 0x824F,
        GL_DEBUG_TYPE_PERFORMANCE_KHR         = 0x8250,
        GL_DEBUG_TYPE_OTHER_KHR               = 0x8251,
        GL_DEBUG_TYPE_MARKER_KHR              = 0x8268;

    public static final int
        GL_DEBUG_TYPE_PUSH_GROUP_KHR = 0x8269,
        GL_DEBUG_TYPE_POP_GROUP_KHR  = 0x826A;

    public static final int
        GL_DEBUG_SEVERITY_HIGH_KHR         = 0x9146,
        GL_DEBUG_SEVERITY_MEDIUM_KHR       = 0x9147,
        GL_DEBUG_SEVERITY_LOW_KHR          = 0x9148,
        GL_DEBUG_SEVERITY_NOTIFICATION_KHR = 0x826B;

    public static final int
        GL_STACK_UNDERFLOW_KHR = 0x504,
        GL_STACK_OVERFLOW_KHR  = 0x503;

    public static final int
        GL_BUFFER_KHR           = 0x82E0,
        GL_SHADER_KHR           = 0x82E1,
        GL_PROGRAM_KHR          = 0x82E2,
        GL_QUERY_KHR            = 0x82E3,
        GL_PROGRAM_PIPELINE_KHR = 0x82E4,
        GL_SAMPLER_KHR          = 0x82E6;

    protected KHRDebug() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDebugMessageControlKHR ] ---

    /** {@code void glDebugMessageControlKHR(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static native void nglDebugMessageControlKHR(int source, int type, int severity, int count, long ids, boolean enabled);

    /** {@code void glDebugMessageControlKHR(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControlKHR(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") @Nullable IntBuffer ids, @NativeType("GLboolean") boolean enabled) {
        nglDebugMessageControlKHR(source, type, severity, remainingSafe(ids), memAddressSafe(ids), enabled);
    }

    /** {@code void glDebugMessageControlKHR(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControlKHR(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") int id, @NativeType("GLboolean") boolean enabled) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.ints(id);
            nglDebugMessageControlKHR(source, type, severity, 1, memAddress(ids), enabled);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDebugMessageInsertKHR ] ---

    /** {@code void glDebugMessageInsertKHR(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * message)} */
    public static native void nglDebugMessageInsertKHR(int source, int type, int id, int severity, int length, long message);

    /** {@code void glDebugMessageInsertKHR(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * message)} */
    public static void glDebugMessageInsertKHR(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLchar const *") ByteBuffer message) {
        nglDebugMessageInsertKHR(source, type, id, severity, message.remaining(), memAddress(message));
    }

    /** {@code void glDebugMessageInsertKHR(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * message)} */
    public static void glDebugMessageInsertKHR(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLchar const *") CharSequence message) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int messageEncodedLength = stack.nUTF8(message, false);
            long messageEncoded = stack.getPointerAddress();
            nglDebugMessageInsertKHR(source, type, id, severity, messageEncodedLength, messageEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDebugMessageCallbackKHR ] ---

    /** {@code void glDebugMessageCallbackKHR(GLDEBUGPROCKHR callback, void const * userParam)} */
    public static native void nglDebugMessageCallbackKHR(long callback, long userParam);

    /** {@code void glDebugMessageCallbackKHR(GLDEBUGPROCKHR callback, void const * userParam)} */
    public static void glDebugMessageCallbackKHR(@NativeType("GLDEBUGPROCKHR") @Nullable GLDebugMessageKHRCallbackI callback, @NativeType("void const *") long userParam) {
        nglDebugMessageCallbackKHR(memAddressSafe(callback), userParam);
    }

    // --- [ glGetDebugMessageLogKHR ] ---

    /** {@code GLuint glGetDebugMessageLogKHR(GLuint count, GLsizei bufsize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    public static native int nglGetDebugMessageLogKHR(int count, int bufsize, long sources, long types, long ids, long severities, long lengths, long messageLog);

    /** {@code GLuint glGetDebugMessageLogKHR(GLuint count, GLsizei bufsize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    @NativeType("GLuint")
    public static int glGetDebugMessageLogKHR(@NativeType("GLuint") int count, @NativeType("GLenum *") @Nullable IntBuffer sources, @NativeType("GLenum *") @Nullable IntBuffer types, @NativeType("GLuint *") @Nullable IntBuffer ids, @NativeType("GLenum *") @Nullable IntBuffer severities, @NativeType("GLsizei *") @Nullable IntBuffer lengths, @NativeType("GLchar *") @Nullable ByteBuffer messageLog) {
        if (CHECKS) {
            checkSafe(sources, count);
            checkSafe(types, count);
            checkSafe(ids, count);
            checkSafe(severities, count);
            checkSafe(lengths, count);
        }
        return nglGetDebugMessageLogKHR(count, remainingSafe(messageLog), memAddressSafe(sources), memAddressSafe(types), memAddressSafe(ids), memAddressSafe(severities), memAddressSafe(lengths), memAddressSafe(messageLog));
    }

    // --- [ glGetPointervKHR ] ---

    /** {@code void glGetPointervKHR(GLenum pname, void ** params)} */
    public static native void nglGetPointervKHR(int pname, long params);

    /** {@code void glGetPointervKHR(GLenum pname, void ** params)} */
    public static void glGetPointervKHR(@NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetPointervKHR(pname, memAddress(params));
    }

    /** {@code void glGetPointervKHR(GLenum pname, void ** params)} */
    @NativeType("void")
    public static long glGetPointerKHR(@NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetPointervKHR(pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glPushDebugGroupKHR ] ---

    /** {@code void glPushDebugGroupKHR(GLenum source, GLuint id, GLsizei length, GLchar const * message)} */
    public static native void nglPushDebugGroupKHR(int source, int id, int length, long message);

    /** {@code void glPushDebugGroupKHR(GLenum source, GLuint id, GLsizei length, GLchar const * message)} */
    public static void glPushDebugGroupKHR(@NativeType("GLenum") int source, @NativeType("GLuint") int id, @NativeType("GLchar const *") ByteBuffer message) {
        nglPushDebugGroupKHR(source, id, message.remaining(), memAddress(message));
    }

    /** {@code void glPushDebugGroupKHR(GLenum source, GLuint id, GLsizei length, GLchar const * message)} */
    public static void glPushDebugGroupKHR(@NativeType("GLenum") int source, @NativeType("GLuint") int id, @NativeType("GLchar const *") CharSequence message) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int messageEncodedLength = stack.nUTF8(message, false);
            long messageEncoded = stack.getPointerAddress();
            nglPushDebugGroupKHR(source, id, messageEncodedLength, messageEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glPopDebugGroupKHR ] ---

    /** {@code void glPopDebugGroupKHR(void)} */
    public static native void glPopDebugGroupKHR();

    // --- [ glObjectLabelKHR ] ---

    /** {@code void glObjectLabelKHR(GLenum identifier, GLuint name, GLsizei length, GLchar const * label)} */
    public static native void nglObjectLabelKHR(int identifier, int name, int length, long label);

    /** {@code void glObjectLabelKHR(GLenum identifier, GLuint name, GLsizei length, GLchar const * label)} */
    public static void glObjectLabelKHR(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLchar const *") ByteBuffer label) {
        nglObjectLabelKHR(identifier, name, label.remaining(), memAddress(label));
    }

    /** {@code void glObjectLabelKHR(GLenum identifier, GLuint name, GLsizei length, GLchar const * label)} */
    public static void glObjectLabelKHR(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLchar const *") CharSequence label) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int labelEncodedLength = stack.nUTF8(label, false);
            long labelEncoded = stack.getPointerAddress();
            nglObjectLabelKHR(identifier, name, labelEncodedLength, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetObjectLabelKHR ] ---

    /** {@code void glGetObjectLabelKHR(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static native void nglGetObjectLabelKHR(int identifier, int name, int bufSize, long length, long label);

    /** {@code void glGetObjectLabelKHR(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectLabelKHR(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer label) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetObjectLabelKHR(identifier, name, label.remaining(), memAddressSafe(length), memAddress(label));
    }

    /** {@code void glGetObjectLabelKHR(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectLabelKHR(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer label = stack.malloc(bufSize);
            nglGetObjectLabelKHR(identifier, name, bufSize, memAddress(length), memAddress(label));
            return memUTF8(label, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetObjectLabelKHR(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectLabelKHR(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name) {
        return glGetObjectLabelKHR(identifier, name, GLES20.glGetInteger(GL_MAX_LABEL_LENGTH_KHR));
    }

    // --- [ glObjectPtrLabelKHR ] ---

    /** {@code void glObjectPtrLabelKHR(void * ptr, GLsizei length, GLchar const * label)} */
    public static native void nglObjectPtrLabelKHR(long ptr, int length, long label);

    /** {@code void glObjectPtrLabelKHR(void * ptr, GLsizei length, GLchar const * label)} */
    public static void glObjectPtrLabelKHR(@NativeType("void *") long ptr, @NativeType("GLchar const *") ByteBuffer label) {
        if (CHECKS) {
            check(ptr);
        }
        nglObjectPtrLabelKHR(ptr, label.remaining(), memAddress(label));
    }

    /** {@code void glObjectPtrLabelKHR(void * ptr, GLsizei length, GLchar const * label)} */
    public static void glObjectPtrLabelKHR(@NativeType("void *") long ptr, @NativeType("GLchar const *") CharSequence label) {
        if (CHECKS) {
            check(ptr);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int labelEncodedLength = stack.nUTF8(label, false);
            long labelEncoded = stack.getPointerAddress();
            nglObjectPtrLabelKHR(ptr, labelEncodedLength, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetObjectPtrLabelKHR ] ---

    /** {@code void glGetObjectPtrLabelKHR(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static native void nglGetObjectPtrLabelKHR(long ptr, int bufSize, long length, long label);

    /** {@code void glGetObjectPtrLabelKHR(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectPtrLabelKHR(@NativeType("void *") long ptr, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer label) {
        if (CHECKS) {
            check(ptr);
            checkSafe(length, 1);
        }
        nglGetObjectPtrLabelKHR(ptr, label.remaining(), memAddressSafe(length), memAddress(label));
    }

    /** {@code void glGetObjectPtrLabelKHR(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectPtrLabelKHR(@NativeType("void *") long ptr, @NativeType("GLsizei") int bufSize) {
        if (CHECKS) {
            check(ptr);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer label = stack.malloc(bufSize);
            nglGetObjectPtrLabelKHR(ptr, bufSize, memAddress(length), memAddress(label));
            return memUTF8(label, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetObjectPtrLabelKHR(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectPtrLabelKHR(@NativeType("void *") long ptr) {
        return glGetObjectPtrLabelKHR(ptr, GLES20.glGetInteger(GL_MAX_LABEL_LENGTH_KHR));
    }

    /** {@code void glDebugMessageControlKHR(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControlKHR(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") int @Nullable [] ids, @NativeType("GLboolean") boolean enabled) {
        long __functionAddress = GLES.getICD().glDebugMessageControlKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(source, type, severity, lengthSafe(ids), ids, enabled, __functionAddress);
    }

    /** {@code GLuint glGetDebugMessageLogKHR(GLuint count, GLsizei bufsize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    @NativeType("GLuint")
    public static int glGetDebugMessageLogKHR(@NativeType("GLuint") int count, @NativeType("GLenum *") int @Nullable [] sources, @NativeType("GLenum *") int @Nullable [] types, @NativeType("GLuint *") int @Nullable [] ids, @NativeType("GLenum *") int @Nullable [] severities, @NativeType("GLsizei *") int @Nullable [] lengths, @NativeType("GLchar *") @Nullable ByteBuffer messageLog) {
        long __functionAddress = GLES.getICD().glGetDebugMessageLogKHR;
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

    /** {@code void glGetObjectLabelKHR(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectLabelKHR(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer label) {
        long __functionAddress = GLES.getICD().glGetObjectLabelKHR;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(identifier, name, label.remaining(), length, memAddress(label), __functionAddress);
    }

    /** {@code void glGetObjectPtrLabelKHR(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectPtrLabelKHR(@NativeType("void *") long ptr, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer label) {
        long __functionAddress = GLES.getICD().glGetObjectPtrLabelKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
            checkSafe(length, 1);
        }
        callPPPV(ptr, label.remaining(), length, memAddress(label), __functionAddress);
    }

}