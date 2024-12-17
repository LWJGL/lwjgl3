/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class APPLESync {

    static { GLES.initialize(); }

    public static final int GL_MAX_SERVER_WAIT_TIMEOUT_APPLE = 0x9111;

    public static final int
        GL_OBJECT_TYPE_APPLE    = 0x9112,
        GL_SYNC_CONDITION_APPLE = 0x9113,
        GL_SYNC_STATUS_APPLE    = 0x9114,
        GL_SYNC_FLAGS_APPLE     = 0x9115;

    public static final int GL_SYNC_FENCE_APPLE = 0x9116;

    public static final int GL_SYNC_GPU_COMMANDS_COMPLETE_APPLE = 0x9117;

    public static final int
        GL_UNSIGNALED_APPLE = 0x9118,
        GL_SIGNALED_APPLE   = 0x9119;

    public static final int GL_SYNC_FLUSH_COMMANDS_BIT_APPLE = 0x1;

    public static final long GL_TIMEOUT_IGNORED_APPLE = 0xFFFFFFFFFFFFFFFFL;

    public static final int
        GL_ALREADY_SIGNALED_APPLE    = 0x911A,
        GL_TIMEOUT_EXPIRED_APPLE     = 0x911B,
        GL_CONDITION_SATISFIED_APPLE = 0x911C,
        GL_WAIT_FAILED_APPLE         = 0x911D;

    public static final int GL_SYNC_OBJECT_APPLE = 0x8A53;

    protected APPLESync() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFenceSyncAPPLE ] ---

    /** {@code GLsync glFenceSyncAPPLE(GLenum condition, GLbitfield flags)} */
    @NativeType("GLsync")
    public static native long glFenceSyncAPPLE(@NativeType("GLenum") int condition, @NativeType("GLbitfield") int flags);

    // --- [ glIsSyncAPPLE ] ---

    /** {@code GLboolean glIsSyncAPPLE(GLsync sync)} */
    public static native boolean nglIsSyncAPPLE(long sync);

    /** {@code GLboolean glIsSyncAPPLE(GLsync sync)} */
    @NativeType("GLboolean")
    public static boolean glIsSyncAPPLE(@NativeType("GLsync") long sync) {
        if (CHECKS) {
            check(sync);
        }
        return nglIsSyncAPPLE(sync);
    }

    // --- [ glDeleteSyncAPPLE ] ---

    /** {@code void glDeleteSyncAPPLE(GLsync sync)} */
    public static native void nglDeleteSyncAPPLE(long sync);

    /** {@code void glDeleteSyncAPPLE(GLsync sync)} */
    public static void glDeleteSyncAPPLE(@NativeType("GLsync") long sync) {
        if (CHECKS) {
            check(sync);
        }
        nglDeleteSyncAPPLE(sync);
    }

    // --- [ glClientWaitSyncAPPLE ] ---

    /** {@code GLenum glClientWaitSyncAPPLE(GLsync sync, GLbitfield flags, GLuint64 timeout)} */
    public static native int nglClientWaitSyncAPPLE(long sync, int flags, long timeout);

    /** {@code GLenum glClientWaitSyncAPPLE(GLsync sync, GLbitfield flags, GLuint64 timeout)} */
    @NativeType("GLenum")
    public static int glClientWaitSyncAPPLE(@NativeType("GLsync") long sync, @NativeType("GLbitfield") int flags, @NativeType("GLuint64") long timeout) {
        if (CHECKS) {
            check(sync);
        }
        return nglClientWaitSyncAPPLE(sync, flags, timeout);
    }

    // --- [ glWaitSyncAPPLE ] ---

    /** {@code void glWaitSyncAPPLE(GLsync sync, GLbitfield flags, GLuint64 timeout)} */
    public static native void nglWaitSyncAPPLE(long sync, int flags, long timeout);

    /** {@code void glWaitSyncAPPLE(GLsync sync, GLbitfield flags, GLuint64 timeout)} */
    public static void glWaitSyncAPPLE(@NativeType("GLsync") long sync, @NativeType("GLbitfield") int flags, @NativeType("GLuint64") long timeout) {
        if (CHECKS) {
            check(sync);
        }
        nglWaitSyncAPPLE(sync, flags, timeout);
    }

    // --- [ glGetInteger64vAPPLE ] ---

    /** {@code void glGetInteger64vAPPLE(GLenum pname, GLint64 * params)} */
    public static native void nglGetInteger64vAPPLE(int pname, long params);

    /** {@code void glGetInteger64vAPPLE(GLenum pname, GLint64 * params)} */
    public static void glGetInteger64vAPPLE(@NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetInteger64vAPPLE(pname, memAddress(params));
    }

    /** {@code void glGetInteger64vAPPLE(GLenum pname, GLint64 * params)} */
    @NativeType("void")
    public static long glGetInteger64APPLE(@NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetInteger64vAPPLE(pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSyncivAPPLE ] ---

    /** {@code void glGetSyncivAPPLE(GLsync sync, GLenum pname, GLsizei bufSize, GLsizei * length, GLint * values)} */
    public static native void nglGetSyncivAPPLE(long sync, int pname, int bufSize, long length, long values);

    /** {@code void glGetSyncivAPPLE(GLsync sync, GLenum pname, GLsizei bufSize, GLsizei * length, GLint * values)} */
    public static void glGetSyncivAPPLE(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLint *") IntBuffer values) {
        if (CHECKS) {
            check(sync);
            checkSafe(length, 1);
        }
        nglGetSyncivAPPLE(sync, pname, values.remaining(), memAddressSafe(length), memAddress(values));
    }

    /** {@code void glGetSyncivAPPLE(GLsync sync, GLenum pname, GLsizei bufSize, GLsizei * length, GLint * values)} */
    @NativeType("void")
    public static int glGetSynciAPPLE(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @NativeType("GLsizei *") @Nullable IntBuffer length) {
        if (CHECKS) {
            check(sync);
            checkSafe(length, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer values = stack.callocInt(1);
            nglGetSyncivAPPLE(sync, pname, 1, memAddressSafe(length), memAddress(values));
            return values.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetInteger64vAPPLE(GLenum pname, GLint64 * params)} */
    public static void glGetInteger64vAPPLE(@NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GLES.getICD().glGetInteger64vAPPLE;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pname, params, __functionAddress);
    }

    /** {@code void glGetSyncivAPPLE(GLsync sync, GLenum pname, GLsizei bufSize, GLsizei * length, GLint * values)} */
    public static void glGetSyncivAPPLE(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLint *") int[] values) {
        long __functionAddress = GLES.getICD().glGetSyncivAPPLE;
        if (CHECKS) {
            check(__functionAddress);
            check(sync);
            checkSafe(length, 1);
        }
        callPPPV(sync, pname, values.length, length, values, __functionAddress);
    }

}