/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL32C extends GL31C {

    static { GL.initialize(); }

    public static final int GL_CONTEXT_PROFILE_MASK = 0x9126;

    public static final int
        GL_CONTEXT_CORE_PROFILE_BIT          = 0x1,
        GL_CONTEXT_COMPATIBILITY_PROFILE_BIT = 0x2;

    public static final int
        GL_MAX_VERTEX_OUTPUT_COMPONENTS   = 0x9122,
        GL_MAX_GEOMETRY_INPUT_COMPONENTS  = 0x9123,
        GL_MAX_GEOMETRY_OUTPUT_COMPONENTS = 0x9124,
        GL_MAX_FRAGMENT_INPUT_COMPONENTS  = 0x9125;

    public static final int
        GL_FIRST_VERTEX_CONVENTION = 0x8E4D,
        GL_LAST_VERTEX_CONVENTION  = 0x8E4E;

    public static final int
        GL_PROVOKING_VERTEX                         = 0x8E4F,
        GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 0x8E4C;

    public static final int GL_TEXTURE_CUBE_MAP_SEAMLESS = 0x884F;

    public static final int GL_SAMPLE_POSITION = 0x8E50;

    public static final int GL_SAMPLE_MASK = 0x8E51;

    public static final int GL_SAMPLE_MASK_VALUE = 0x8E52;

    public static final int GL_TEXTURE_2D_MULTISAMPLE = 0x9100;

    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE = 0x9101;

    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;

    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9103;

    public static final int
        GL_MAX_SAMPLE_MASK_WORDS                = 0x8E59,
        GL_MAX_COLOR_TEXTURE_SAMPLES            = 0x910E,
        GL_MAX_DEPTH_TEXTURE_SAMPLES            = 0x910F,
        GL_MAX_INTEGER_SAMPLES                  = 0x9110,
        GL_TEXTURE_BINDING_2D_MULTISAMPLE       = 0x9104,
        GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 0x9105;

    public static final int
        GL_TEXTURE_SAMPLES                = 0x9106,
        GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 0x9107;

    public static final int
        GL_SAMPLER_2D_MULTISAMPLE                    = 0x9108,
        GL_INT_SAMPLER_2D_MULTISAMPLE                = 0x9109,
        GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE       = 0x910A,
        GL_SAMPLER_2D_MULTISAMPLE_ARRAY              = 0x910B,
        GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY          = 0x910C,
        GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910D;

    public static final int GL_DEPTH_CLAMP = 0x864F;

    public static final int GL_GEOMETRY_SHADER = 0x8DD9;

    public static final int
        GL_GEOMETRY_VERTICES_OUT = 0x8DDA,
        GL_GEOMETRY_INPUT_TYPE   = 0x8DDB,
        GL_GEOMETRY_OUTPUT_TYPE  = 0x8DDC;

    public static final int
        GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS     = 0x8C29,
        GL_MAX_GEOMETRY_UNIFORM_COMPONENTS      = 0x8DDF,
        GL_MAX_GEOMETRY_OUTPUT_VERTICES         = 0x8DE0,
        GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = 0x8DE1;

    public static final int
        GL_LINES_ADJACENCY          = 0xA,
        GL_LINE_STRIP_ADJACENCY     = 0xB,
        GL_TRIANGLES_ADJACENCY      = 0xC,
        GL_TRIANGLE_STRIP_ADJACENCY = 0xD;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 0x8DA8;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED = 0x8DA7;

    public static final int GL_PROGRAM_POINT_SIZE = 0x8642;

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

    protected GL32C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetBufferParameteri64v ] ---

    /** {@code void glGetBufferParameteri64v(GLenum target, GLenum pname, GLint64 * params)} */
    public static native void nglGetBufferParameteri64v(int target, int pname, long params);

    /** {@code void glGetBufferParameteri64v(GLenum target, GLenum pname, GLint64 * params)} */
    public static void glGetBufferParameteri64v(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBufferParameteri64v(target, pname, memAddress(params));
    }

    /** {@code void glGetBufferParameteri64v(GLenum target, GLenum pname, GLint64 * params)} */
    @NativeType("void")
    public static long glGetBufferParameteri64(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetBufferParameteri64v(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDrawElementsBaseVertex ] ---

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static native void nglDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex);

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertex(mode, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
    }

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
    }

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
    }

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), basevertex);
    }

    // --- [ glDrawRangeElementsBaseVertex ] ---

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static native void nglDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex);

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
    }

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
    }

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
    }

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ShortBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
    }

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") IntBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertex(mode, start, end, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), basevertex);
    }

    // --- [ glDrawElementsInstancedBaseVertex ] ---

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex)} */
    public static native void nglDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int primcount, int basevertex);

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertex(mode, count, type, indices, primcount, basevertex);
    }

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertex(mode, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices), primcount, basevertex);
    }

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), primcount, basevertex);
    }

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), primcount, basevertex);
    }

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertex(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), primcount, basevertex);
    }

    // --- [ glMultiDrawElementsBaseVertex ] ---

    /** {@code void glMultiDrawElementsBaseVertex(GLenum mode, GLsizei const * count, GLenum type, void const * const * indices, GLsizei drawcount, GLint * basevertex)} */
    public static native void nglMultiDrawElementsBaseVertex(int mode, long count, int type, long indices, int drawcount, long basevertex);

    /** {@code void glMultiDrawElementsBaseVertex(GLenum mode, GLsizei const * count, GLenum type, void const * const * indices, GLsizei drawcount, GLint * basevertex)} */
    public static void glMultiDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLsizei const *") IntBuffer count, @NativeType("GLenum") int type, @NativeType("void const * const *") PointerBuffer indices, @NativeType("GLint *") IntBuffer basevertex) {
        if (CHECKS) {
            check(indices, count.remaining());
            check(basevertex, count.remaining());
        }
        nglMultiDrawElementsBaseVertex(mode, memAddress(count), type, memAddress(indices), count.remaining(), memAddress(basevertex));
    }

    // --- [ glProvokingVertex ] ---

    /** {@code void glProvokingVertex(GLenum mode)} */
    public static native void glProvokingVertex(@NativeType("GLenum") int mode);

    // --- [ glTexImage2DMultisample ] ---

    /** {@code void glTexImage2DMultisample(GLenum target, GLsizei samples, GLint internalformat, GLsizei width, GLsizei height, GLboolean fixedsamplelocations)} */
    public static native void glTexImage2DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations);

    // --- [ glTexImage3DMultisample ] ---

    /** {@code void glTexImage3DMultisample(GLenum target, GLsizei samples, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedsamplelocations)} */
    public static native void glTexImage3DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations);

    // --- [ glGetMultisamplefv ] ---

    /** {@code void glGetMultisamplefv(GLenum pname, GLuint index, GLfloat * val)} */
    public static native void nglGetMultisamplefv(int pname, int index, long val);

    /** {@code void glGetMultisamplefv(GLenum pname, GLuint index, GLfloat * val)} */
    public static void glGetMultisamplefv(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer val) {
        if (CHECKS) {
            check(val, 1);
        }
        nglGetMultisamplefv(pname, index, memAddress(val));
    }

    /** {@code void glGetMultisamplefv(GLenum pname, GLuint index, GLfloat * val)} */
    @NativeType("void")
    public static float glGetMultisamplef(@NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer val = stack.callocFloat(1);
            nglGetMultisamplefv(pname, index, memAddress(val));
            return val.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glSampleMaski ] ---

    /** {@code void glSampleMaski(GLuint index, GLbitfield mask)} */
    public static native void glSampleMaski(@NativeType("GLuint") int index, @NativeType("GLbitfield") int mask);

    // --- [ glFramebufferTexture ] ---

    /** {@code void glFramebufferTexture(GLenum target, GLenum attachment, GLuint texture, GLint level)} */
    public static native void glFramebufferTexture(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glFenceSync ] ---

    /** {@code GLsync glFenceSync(GLenum condition, GLbitfield flags)} */
    @NativeType("GLsync")
    public static native long glFenceSync(@NativeType("GLenum") int condition, @NativeType("GLbitfield") int flags);

    // --- [ glIsSync ] ---

    /** {@code GLboolean glIsSync(GLsync sync)} */
    public static native boolean nglIsSync(long sync);

    /** {@code GLboolean glIsSync(GLsync sync)} */
    @NativeType("GLboolean")
    public static boolean glIsSync(@NativeType("GLsync") long sync) {
        if (CHECKS) {
            check(sync);
        }
        return nglIsSync(sync);
    }

    // --- [ glDeleteSync ] ---

    /** {@code void glDeleteSync(GLsync sync)} */
    public static native void nglDeleteSync(long sync);

    /** {@code void glDeleteSync(GLsync sync)} */
    public static void glDeleteSync(@NativeType("GLsync") long sync) {
        if (CHECKS) {
            check(sync);
        }
        nglDeleteSync(sync);
    }

    // --- [ glClientWaitSync ] ---

    /** {@code GLenum glClientWaitSync(GLsync sync, GLbitfield flags, GLuint64 timeout)} */
    public static native int nglClientWaitSync(long sync, int flags, long timeout);

    /** {@code GLenum glClientWaitSync(GLsync sync, GLbitfield flags, GLuint64 timeout)} */
    @NativeType("GLenum")
    public static int glClientWaitSync(@NativeType("GLsync") long sync, @NativeType("GLbitfield") int flags, @NativeType("GLuint64") long timeout) {
        if (CHECKS) {
            check(sync);
        }
        return nglClientWaitSync(sync, flags, timeout);
    }

    // --- [ glWaitSync ] ---

    /** {@code void glWaitSync(GLsync sync, GLbitfield flags, GLuint64 timeout)} */
    public static native void nglWaitSync(long sync, int flags, long timeout);

    /** {@code void glWaitSync(GLsync sync, GLbitfield flags, GLuint64 timeout)} */
    public static void glWaitSync(@NativeType("GLsync") long sync, @NativeType("GLbitfield") int flags, @NativeType("GLuint64") long timeout) {
        if (CHECKS) {
            check(sync);
        }
        nglWaitSync(sync, flags, timeout);
    }

    // --- [ glGetInteger64v ] ---

    /** {@code void glGetInteger64v(GLenum pname, GLint64 * params)} */
    public static native void nglGetInteger64v(int pname, long params);

    /** {@code void glGetInteger64v(GLenum pname, GLint64 * params)} */
    public static void glGetInteger64v(@NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetInteger64v(pname, memAddress(params));
    }

    /** {@code void glGetInteger64v(GLenum pname, GLint64 * params)} */
    @NativeType("void")
    public static long glGetInteger64(@NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetInteger64v(pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetInteger64i_v ] ---

    /** {@code void glGetInteger64i_v(GLenum pname, GLuint index, GLint64 * params)} */
    public static native void nglGetInteger64i_v(int pname, int index, long params);

    /** {@code void glGetInteger64i_v(GLenum pname, GLuint index, GLint64 * params)} */
    public static void glGetInteger64i_v(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetInteger64i_v(pname, index, memAddress(params));
    }

    /** {@code void glGetInteger64i_v(GLenum pname, GLuint index, GLint64 * params)} */
    @NativeType("void")
    public static long glGetInteger64i(@NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetInteger64i_v(pname, index, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSynciv ] ---

    /** {@code void glGetSynciv(GLsync sync, GLenum pname, GLsizei bufSize, GLsizei * length, GLint * values)} */
    public static native void nglGetSynciv(long sync, int pname, int bufSize, long length, long values);

    /** {@code void glGetSynciv(GLsync sync, GLenum pname, GLsizei bufSize, GLsizei * length, GLint * values)} */
    public static void glGetSynciv(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLint *") IntBuffer values) {
        if (CHECKS) {
            check(sync);
            checkSafe(length, 1);
        }
        nglGetSynciv(sync, pname, values.remaining(), memAddressSafe(length), memAddress(values));
    }

    /** {@code void glGetSynciv(GLsync sync, GLenum pname, GLsizei bufSize, GLsizei * length, GLint * values)} */
    @NativeType("void")
    public static int glGetSynci(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @NativeType("GLsizei *") @Nullable IntBuffer length) {
        if (CHECKS) {
            check(sync);
            checkSafe(length, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer values = stack.callocInt(1);
            nglGetSynciv(sync, pname, 1, memAddressSafe(length), memAddress(values));
            return values.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetBufferParameteri64v(GLenum target, GLenum pname, GLint64 * params)} */
    public static void glGetBufferParameteri64v(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetBufferParameteri64v;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glMultiDrawElementsBaseVertex(GLenum mode, GLsizei const * count, GLenum type, void const * const * indices, GLsizei drawcount, GLint * basevertex)} */
    public static void glMultiDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLsizei const *") int[] count, @NativeType("GLenum") int type, @NativeType("void const * const *") PointerBuffer indices, @NativeType("GLint *") int[] basevertex) {
        long __functionAddress = GL.getICD().glMultiDrawElementsBaseVertex;
        if (CHECKS) {
            check(__functionAddress);
            check(indices, count.length);
            check(basevertex, count.length);
        }
        callPPPV(mode, count, type, memAddress(indices), count.length, basevertex, __functionAddress);
    }

    /** {@code void glGetMultisamplefv(GLenum pname, GLuint index, GLfloat * val)} */
    public static void glGetMultisamplefv(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] val) {
        long __functionAddress = GL.getICD().glGetMultisamplefv;
        if (CHECKS) {
            check(__functionAddress);
            check(val, 1);
        }
        callPV(pname, index, val, __functionAddress);
    }

    /** {@code void glGetInteger64v(GLenum pname, GLint64 * params)} */
    public static void glGetInteger64v(@NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetInteger64v;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pname, params, __functionAddress);
    }

    /** {@code void glGetInteger64i_v(GLenum pname, GLuint index, GLint64 * params)} */
    public static void glGetInteger64i_v(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetInteger64i_v;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pname, index, params, __functionAddress);
    }

    /** {@code void glGetSynciv(GLsync sync, GLenum pname, GLsizei bufSize, GLsizei * length, GLint * values)} */
    public static void glGetSynciv(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLint *") int[] values) {
        long __functionAddress = GL.getICD().glGetSynciv;
        if (CHECKS) {
            check(__functionAddress);
            check(sync);
            checkSafe(length, 1);
        }
        callPPPV(sync, pname, values.length, length, values, __functionAddress);
    }

}