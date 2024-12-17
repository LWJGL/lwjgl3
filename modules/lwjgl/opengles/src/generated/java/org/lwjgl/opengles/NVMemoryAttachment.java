/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVMemoryAttachment {

    static { GLES.initialize(); }

    public static final int
        GL_ATTACHED_MEMORY_OBJECT_NV      = 0x95A4,
        GL_ATTACHED_MEMORY_OFFSET_NV      = 0x95A5,
        GL_MEMORY_ATTACHABLE_ALIGNMENT_NV = 0x95A6,
        GL_MEMORY_ATTACHABLE_SIZE_NV      = 0x95A7,
        GL_MEMORY_ATTACHABLE_NV           = 0x95A8;

    public static final int GL_DETACHED_MEMORY_INCARNATION_NV = 0x95A9;

    public static final int
        GL_DETACHED_TEXTURES_NV = 0x95AA,
        GL_DETACHED_BUFFERS_NV  = 0x95AB;

    public static final int
        GL_MAX_DETACHED_TEXTURES_NV = 0x95AC,
        GL_MAX_DETACHED_BUFFERS_NV  = 0x95AD;

    protected NVMemoryAttachment() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetMemoryObjectDetachedResourcesuivNV ] ---

    /** {@code void glGetMemoryObjectDetachedResourcesuivNV(GLuint memory, GLenum pname, GLint first, GLsizei count, GLuint * params)} */
    public static native void nglGetMemoryObjectDetachedResourcesuivNV(int memory, int pname, int first, int count, long params);

    /** {@code void glGetMemoryObjectDetachedResourcesuivNV(GLuint memory, GLenum pname, GLint first, GLsizei count, GLuint * params)} */
    public static void glGetMemoryObjectDetachedResourcesuivNV(@NativeType("GLuint") int memory, @NativeType("GLenum") int pname, @NativeType("GLint") int first, @NativeType("GLuint *") IntBuffer params) {
        nglGetMemoryObjectDetachedResourcesuivNV(memory, pname, first, params.remaining(), memAddress(params));
    }

    // --- [ glResetMemoryObjectParameterNV ] ---

    /** {@code void glResetMemoryObjectParameterNV(GLuint memory, GLenum pname)} */
    public static native void glResetMemoryObjectParameterNV(@NativeType("GLuint") int memory, @NativeType("GLenum") int pname);

    // --- [ glTexAttachMemoryNV ] ---

    /** {@code void glTexAttachMemoryNV(GLenum target, GLuint memory, GLuint64 offset)} */
    public static native void glTexAttachMemoryNV(@NativeType("GLenum") int target, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glBufferAttachMemoryNV ] ---

    /** {@code void glBufferAttachMemoryNV(GLenum target, GLuint memory, GLuint64 offset)} */
    public static native void glBufferAttachMemoryNV(@NativeType("GLenum") int target, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTextureAttachMemoryNV ] ---

    /** {@code void glTextureAttachMemoryNV(GLuint texture, GLuint memory, GLuint64 offset)} */
    public static native void glTextureAttachMemoryNV(@NativeType("GLuint") int texture, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glNamedBufferAttachMemoryNV ] ---

    /** {@code void glNamedBufferAttachMemoryNV(GLuint buffer, GLuint memory, GLuint64 offset)} */
    public static native void glNamedBufferAttachMemoryNV(@NativeType("GLuint") int buffer, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    /** {@code void glGetMemoryObjectDetachedResourcesuivNV(GLuint memory, GLenum pname, GLint first, GLsizei count, GLuint * params)} */
    public static void glGetMemoryObjectDetachedResourcesuivNV(@NativeType("GLuint") int memory, @NativeType("GLenum") int pname, @NativeType("GLint") int first, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetMemoryObjectDetachedResourcesuivNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(memory, pname, first, params.length, params, __functionAddress);
    }

}