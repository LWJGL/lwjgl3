/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBSync {

    static { GL.initialize(); }

    public static final int GL_MAX_SERVER_WAIT_TIMEOUT = 0x9111;

    public static final int
        GL_OBJECT_TYPE    = 0x9112,
        GL_SYNC_CONDITION = 0x9113,
        GL_SYNC_STATUS    = 0x9114,
        GL_SYNC_FLAGS     = 0x9115;

    public static final int GL_SYNC_FENCE = 0x9116;

    public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 0x9117;

    public static final int
        GL_UNSIGNALED = 0x9118,
        GL_SIGNALED   = 0x9119;

    public static final int GL_SYNC_FLUSH_COMMANDS_BIT = 0x1;

    public static final long GL_TIMEOUT_IGNORED = 0xFFFFFFFFFFFFFFFFL;

    public static final int
        GL_ALREADY_SIGNALED    = 0x911A,
        GL_TIMEOUT_EXPIRED     = 0x911B,
        GL_CONDITION_SATISFIED = 0x911C,
        GL_WAIT_FAILED         = 0x911D;

    protected ARBSync() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFenceSync ] ---

    /** {@code GLsync glFenceSync(GLenum condition, GLbitfield flags)} */
    @NativeType("GLsync")
    public static long glFenceSync(@NativeType("GLenum") int condition, @NativeType("GLbitfield") int flags) {
        return GL32C.glFenceSync(condition, flags);
    }

    // --- [ glIsSync ] ---

    /** {@code GLboolean glIsSync(GLsync sync)} */
    public static boolean nglIsSync(long sync) {
        return GL32C.nglIsSync(sync);
    }

    /** {@code GLboolean glIsSync(GLsync sync)} */
    @NativeType("GLboolean")
    public static boolean glIsSync(@NativeType("GLsync") long sync) {
        return GL32C.glIsSync(sync);
    }

    // --- [ glDeleteSync ] ---

    /** {@code void glDeleteSync(GLsync sync)} */
    public static void nglDeleteSync(long sync) {
        GL32C.nglDeleteSync(sync);
    }

    /** {@code void glDeleteSync(GLsync sync)} */
    public static void glDeleteSync(@NativeType("GLsync") long sync) {
        GL32C.glDeleteSync(sync);
    }

    // --- [ glClientWaitSync ] ---

    /** {@code GLenum glClientWaitSync(GLsync sync, GLbitfield flags, GLuint64 timeout)} */
    public static int nglClientWaitSync(long sync, int flags, long timeout) {
        return GL32C.nglClientWaitSync(sync, flags, timeout);
    }

    /** {@code GLenum glClientWaitSync(GLsync sync, GLbitfield flags, GLuint64 timeout)} */
    @NativeType("GLenum")
    public static int glClientWaitSync(@NativeType("GLsync") long sync, @NativeType("GLbitfield") int flags, @NativeType("GLuint64") long timeout) {
        return GL32C.glClientWaitSync(sync, flags, timeout);
    }

    // --- [ glWaitSync ] ---

    /** {@code void glWaitSync(GLsync sync, GLbitfield flags, GLuint64 timeout)} */
    public static void nglWaitSync(long sync, int flags, long timeout) {
        GL32C.nglWaitSync(sync, flags, timeout);
    }

    /** {@code void glWaitSync(GLsync sync, GLbitfield flags, GLuint64 timeout)} */
    public static void glWaitSync(@NativeType("GLsync") long sync, @NativeType("GLbitfield") int flags, @NativeType("GLuint64") long timeout) {
        GL32C.glWaitSync(sync, flags, timeout);
    }

    // --- [ glGetInteger64v ] ---

    /** {@code void glGetInteger64v(GLenum pname, GLint64 * params)} */
    public static void nglGetInteger64v(int pname, long params) {
        GL32C.nglGetInteger64v(pname, params);
    }

    /** {@code void glGetInteger64v(GLenum pname, GLint64 * params)} */
    public static void glGetInteger64v(@NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        GL32C.glGetInteger64v(pname, params);
    }

    /** {@code void glGetInteger64v(GLenum pname, GLint64 * params)} */
    @NativeType("void")
    public static long glGetInteger64(@NativeType("GLenum") int pname) {
        return GL32C.glGetInteger64(pname);
    }

    // --- [ glGetSynciv ] ---

    /** {@code void glGetSynciv(GLsync sync, GLenum pname, GLsizei bufSize, GLsizei * length, GLint * values)} */
    public static void nglGetSynciv(long sync, int pname, int bufSize, long length, long values) {
        GL32C.nglGetSynciv(sync, pname, bufSize, length, values);
    }

    /** {@code void glGetSynciv(GLsync sync, GLenum pname, GLsizei bufSize, GLsizei * length, GLint * values)} */
    public static void glGetSynciv(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLint *") IntBuffer values) {
        GL32C.glGetSynciv(sync, pname, length, values);
    }

    /** {@code void glGetSynciv(GLsync sync, GLenum pname, GLsizei bufSize, GLsizei * length, GLint * values)} */
    @NativeType("void")
    public static int glGetSynci(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @NativeType("GLsizei *") @Nullable IntBuffer length) {
        return GL32C.glGetSynci(sync, pname, length);
    }

    /** {@code void glGetInteger64v(GLenum pname, GLint64 * params)} */
    public static void glGetInteger64v(@NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        GL32C.glGetInteger64v(pname, params);
    }

    /** {@code void glGetSynciv(GLsync sync, GLenum pname, GLsizei bufSize, GLsizei * length, GLint * values)} */
    public static void glGetSynciv(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLint *") int[] values) {
        GL32C.glGetSynciv(sync, pname, length, values);
    }

}