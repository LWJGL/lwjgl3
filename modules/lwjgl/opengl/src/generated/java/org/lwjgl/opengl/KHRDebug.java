/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

public class KHRDebug {

    static { GL.initialize(); }

    public static final int
        GL_DEBUG_OUTPUT             = 0x92E0,
        GL_DEBUG_OUTPUT_SYNCHRONOUS = 0x8242;

    public static final int GL_CONTEXT_FLAG_DEBUG_BIT = 0x2;

    public static final int
        GL_MAX_DEBUG_MESSAGE_LENGTH         = 0x9143,
        GL_MAX_DEBUG_LOGGED_MESSAGES        = 0x9144,
        GL_DEBUG_LOGGED_MESSAGES            = 0x9145,
        GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 0x8243,
        GL_MAX_DEBUG_GROUP_STACK_DEPTH      = 0x826C,
        GL_DEBUG_GROUP_STACK_DEPTH          = 0x826D,
        GL_MAX_LABEL_LENGTH                 = 0x82E8;

    public static final int
        GL_DEBUG_CALLBACK_FUNCTION   = 0x8244,
        GL_DEBUG_CALLBACK_USER_PARAM = 0x8245;

    public static final int
        GL_DEBUG_SOURCE_API             = 0x8246,
        GL_DEBUG_SOURCE_WINDOW_SYSTEM   = 0x8247,
        GL_DEBUG_SOURCE_SHADER_COMPILER = 0x8248,
        GL_DEBUG_SOURCE_THIRD_PARTY     = 0x8249,
        GL_DEBUG_SOURCE_APPLICATION     = 0x824A,
        GL_DEBUG_SOURCE_OTHER           = 0x824B;

    public static final int
        GL_DEBUG_TYPE_ERROR               = 0x824C,
        GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR = 0x824D,
        GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR  = 0x824E,
        GL_DEBUG_TYPE_PORTABILITY         = 0x824F,
        GL_DEBUG_TYPE_PERFORMANCE         = 0x8250,
        GL_DEBUG_TYPE_OTHER               = 0x8251,
        GL_DEBUG_TYPE_MARKER              = 0x8268;

    public static final int
        GL_DEBUG_TYPE_PUSH_GROUP = 0x8269,
        GL_DEBUG_TYPE_POP_GROUP  = 0x826A;

    public static final int
        GL_DEBUG_SEVERITY_HIGH         = 0x9146,
        GL_DEBUG_SEVERITY_MEDIUM       = 0x9147,
        GL_DEBUG_SEVERITY_LOW          = 0x9148,
        GL_DEBUG_SEVERITY_NOTIFICATION = 0x826B;

    public static final int
        GL_BUFFER           = 0x82E0,
        GL_SHADER           = 0x82E1,
        GL_PROGRAM          = 0x82E2,
        GL_QUERY            = 0x82E3,
        GL_PROGRAM_PIPELINE = 0x82E4,
        GL_SAMPLER          = 0x82E6,
        GL_DISPLAY_LIST     = 0x82E7;

    protected KHRDebug() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDebugMessageControl ] ---

    /** {@code void glDebugMessageControl(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void nglDebugMessageControl(int source, int type, int severity, int count, long ids, boolean enabled) {
        GL43C.nglDebugMessageControl(source, type, severity, count, ids, enabled);
    }

    /** {@code void glDebugMessageControl(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") @Nullable IntBuffer ids, @NativeType("GLboolean") boolean enabled) {
        GL43C.glDebugMessageControl(source, type, severity, ids, enabled);
    }

    /** {@code void glDebugMessageControl(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") int id, @NativeType("GLboolean") boolean enabled) {
        GL43C.glDebugMessageControl(source, type, severity, id, enabled);
    }

    // --- [ glDebugMessageInsert ] ---

    /** {@code void glDebugMessageInsert(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * message)} */
    public static void nglDebugMessageInsert(int source, int type, int id, int severity, int length, long message) {
        GL43C.nglDebugMessageInsert(source, type, id, severity, length, message);
    }

    /** {@code void glDebugMessageInsert(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * message)} */
    public static void glDebugMessageInsert(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLchar const *") ByteBuffer message) {
        GL43C.glDebugMessageInsert(source, type, id, severity, message);
    }

    /** {@code void glDebugMessageInsert(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * message)} */
    public static void glDebugMessageInsert(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLchar const *") CharSequence message) {
        GL43C.glDebugMessageInsert(source, type, id, severity, message);
    }

    // --- [ glDebugMessageCallback ] ---

    /** {@code void glDebugMessageCallback(GLDEBUGPROC callback, void const * userParam)} */
    public static void nglDebugMessageCallback(long callback, long userParam) {
        GL43C.nglDebugMessageCallback(callback, userParam);
    }

    /** {@code void glDebugMessageCallback(GLDEBUGPROC callback, void const * userParam)} */
    public static void glDebugMessageCallback(@NativeType("GLDEBUGPROC") @Nullable GLDebugMessageCallbackI callback, @NativeType("void const *") long userParam) {
        GL43C.glDebugMessageCallback(callback, userParam);
    }

    // --- [ glGetDebugMessageLog ] ---

    /** {@code GLuint glGetDebugMessageLog(GLuint count, GLsizei bufsize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    public static int nglGetDebugMessageLog(int count, int bufsize, long sources, long types, long ids, long severities, long lengths, long messageLog) {
        return GL43C.nglGetDebugMessageLog(count, bufsize, sources, types, ids, severities, lengths, messageLog);
    }

    /** {@code GLuint glGetDebugMessageLog(GLuint count, GLsizei bufsize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    @NativeType("GLuint")
    public static int glGetDebugMessageLog(@NativeType("GLuint") int count, @NativeType("GLenum *") @Nullable IntBuffer sources, @NativeType("GLenum *") @Nullable IntBuffer types, @NativeType("GLuint *") @Nullable IntBuffer ids, @NativeType("GLenum *") @Nullable IntBuffer severities, @NativeType("GLsizei *") @Nullable IntBuffer lengths, @NativeType("GLchar *") @Nullable ByteBuffer messageLog) {
        return GL43C.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

    // --- [ glPushDebugGroup ] ---

    /** {@code void glPushDebugGroup(GLenum source, GLuint id, GLsizei length, GLchar const * message)} */
    public static void nglPushDebugGroup(int source, int id, int length, long message) {
        GL43C.nglPushDebugGroup(source, id, length, message);
    }

    /** {@code void glPushDebugGroup(GLenum source, GLuint id, GLsizei length, GLchar const * message)} */
    public static void glPushDebugGroup(@NativeType("GLenum") int source, @NativeType("GLuint") int id, @NativeType("GLchar const *") ByteBuffer message) {
        GL43C.glPushDebugGroup(source, id, message);
    }

    /** {@code void glPushDebugGroup(GLenum source, GLuint id, GLsizei length, GLchar const * message)} */
    public static void glPushDebugGroup(@NativeType("GLenum") int source, @NativeType("GLuint") int id, @NativeType("GLchar const *") CharSequence message) {
        GL43C.glPushDebugGroup(source, id, message);
    }

    // --- [ glPopDebugGroup ] ---

    /** {@code void glPopDebugGroup(void)} */
    public static void glPopDebugGroup() {
        GL43C.glPopDebugGroup();
    }

    // --- [ glObjectLabel ] ---

    /** {@code void glObjectLabel(GLenum identifier, GLuint name, GLsizei length, GLchar const * label)} */
    public static void nglObjectLabel(int identifier, int name, int length, long label) {
        GL43C.nglObjectLabel(identifier, name, length, label);
    }

    /** {@code void glObjectLabel(GLenum identifier, GLuint name, GLsizei length, GLchar const * label)} */
    public static void glObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLchar const *") ByteBuffer label) {
        GL43C.glObjectLabel(identifier, name, label);
    }

    /** {@code void glObjectLabel(GLenum identifier, GLuint name, GLsizei length, GLchar const * label)} */
    public static void glObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLchar const *") CharSequence label) {
        GL43C.glObjectLabel(identifier, name, label);
    }

    // --- [ glGetObjectLabel ] ---

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void nglGetObjectLabel(int identifier, int name, int bufSize, long length, long label) {
        GL43C.nglGetObjectLabel(identifier, name, bufSize, length, label);
    }

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer label) {
        GL43C.glGetObjectLabel(identifier, name, length, label);
    }

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei") int bufSize) {
        return GL43C.glGetObjectLabel(identifier, name, bufSize);
    }

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name) {
        return glGetObjectLabel(identifier, name, GL11.glGetInteger(GL_MAX_LABEL_LENGTH));
    }

    // --- [ glObjectPtrLabel ] ---

    /** {@code void glObjectPtrLabel(void * ptr, GLsizei length, GLchar const * label)} */
    public static void nglObjectPtrLabel(long ptr, int length, long label) {
        GL43C.nglObjectPtrLabel(ptr, length, label);
    }

    /** {@code void glObjectPtrLabel(void * ptr, GLsizei length, GLchar const * label)} */
    public static void glObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLchar const *") ByteBuffer label) {
        GL43C.glObjectPtrLabel(ptr, label);
    }

    /** {@code void glObjectPtrLabel(void * ptr, GLsizei length, GLchar const * label)} */
    public static void glObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLchar const *") CharSequence label) {
        GL43C.glObjectPtrLabel(ptr, label);
    }

    // --- [ glGetObjectPtrLabel ] ---

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void nglGetObjectPtrLabel(long ptr, int bufSize, long length, long label) {
        GL43C.nglGetObjectPtrLabel(ptr, bufSize, length, label);
    }

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer label) {
        GL43C.glGetObjectPtrLabel(ptr, length, label);
    }

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLsizei") int bufSize) {
        return GL43C.glGetObjectPtrLabel(ptr, bufSize);
    }

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectPtrLabel(@NativeType("void *") long ptr) {
        return glGetObjectPtrLabel(ptr, GL11.glGetInteger(GL_MAX_LABEL_LENGTH));
    }

    /** {@code void glDebugMessageControl(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") int @Nullable [] ids, @NativeType("GLboolean") boolean enabled) {
        GL43C.glDebugMessageControl(source, type, severity, ids, enabled);
    }

    /** {@code GLuint glGetDebugMessageLog(GLuint count, GLsizei bufsize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    @NativeType("GLuint")
    public static int glGetDebugMessageLog(@NativeType("GLuint") int count, @NativeType("GLenum *") int @Nullable [] sources, @NativeType("GLenum *") int @Nullable [] types, @NativeType("GLuint *") int @Nullable [] ids, @NativeType("GLenum *") int @Nullable [] severities, @NativeType("GLsizei *") int @Nullable [] lengths, @NativeType("GLchar *") @Nullable ByteBuffer messageLog) {
        return GL43C.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer label) {
        GL43C.glGetObjectLabel(identifier, name, length, label);
    }

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer label) {
        GL43C.glGetObjectPtrLabel(ptr, length, label);
    }

}