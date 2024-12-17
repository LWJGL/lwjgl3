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

public class GL32 extends GL31 {

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

    protected GL32() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetBufferParameteri64v ] ---

    /** {@code void glGetBufferParameteri64v(GLenum target, GLenum pname, GLint64 * params)} */
    public static void nglGetBufferParameteri64v(int target, int pname, long params) {
        GL32C.nglGetBufferParameteri64v(target, pname, params);
    }

    /** {@code void glGetBufferParameteri64v(GLenum target, GLenum pname, GLint64 * params)} */
    public static void glGetBufferParameteri64v(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        GL32C.glGetBufferParameteri64v(target, pname, params);
    }

    /** {@code void glGetBufferParameteri64v(GLenum target, GLenum pname, GLint64 * params)} */
    @NativeType("void")
    public static long glGetBufferParameteri64(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return GL32C.glGetBufferParameteri64(target, pname);
    }

    // --- [ glDrawElementsBaseVertex ] ---

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void nglDrawElementsBaseVertex(int mode, int count, int type, long indices, int basevertex) {
        GL32C.nglDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLint") int basevertex) {
        GL32C.glDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        GL32C.glDrawElementsBaseVertex(mode, type, indices, basevertex);
    }

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        GL32C.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLint") int basevertex) {
        GL32C.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    /** {@code void glDrawElementsBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLint") int basevertex) {
        GL32C.glDrawElementsBaseVertex(mode, indices, basevertex);
    }

    // --- [ glDrawRangeElementsBaseVertex ] ---

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void nglDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, long indices, int basevertex) {
        GL32C.nglDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
    }

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLint") int basevertex) {
        GL32C.glDrawRangeElementsBaseVertex(mode, start, end, count, type, indices, basevertex);
    }

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        GL32C.glDrawRangeElementsBaseVertex(mode, start, end, type, indices, basevertex);
    }

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        GL32C.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ShortBuffer indices, @NativeType("GLint") int basevertex) {
        GL32C.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    /** {@code void glDrawRangeElementsBaseVertex(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") IntBuffer indices, @NativeType("GLint") int basevertex) {
        GL32C.glDrawRangeElementsBaseVertex(mode, start, end, indices, basevertex);
    }

    // --- [ glDrawElementsInstancedBaseVertex ] ---

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex)} */
    public static void nglDrawElementsInstancedBaseVertex(int mode, int count, int type, long indices, int primcount, int basevertex) {
        GL32C.nglDrawElementsInstancedBaseVertex(mode, count, type, indices, primcount, basevertex);
    }

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex) {
        GL32C.glDrawElementsInstancedBaseVertex(mode, count, type, indices, primcount, basevertex);
    }

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex) {
        GL32C.glDrawElementsInstancedBaseVertex(mode, type, indices, primcount, basevertex);
    }

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex) {
        GL32C.glDrawElementsInstancedBaseVertex(mode, indices, primcount, basevertex);
    }

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex) {
        GL32C.glDrawElementsInstancedBaseVertex(mode, indices, primcount, basevertex);
    }

    /** {@code void glDrawElementsInstancedBaseVertex(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertex(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex) {
        GL32C.glDrawElementsInstancedBaseVertex(mode, indices, primcount, basevertex);
    }

    // --- [ glMultiDrawElementsBaseVertex ] ---

    /** {@code void glMultiDrawElementsBaseVertex(GLenum mode, GLsizei const * count, GLenum type, void const * const * indices, GLsizei drawcount, GLint * basevertex)} */
    public static void nglMultiDrawElementsBaseVertex(int mode, long count, int type, long indices, int drawcount, long basevertex) {
        GL32C.nglMultiDrawElementsBaseVertex(mode, count, type, indices, drawcount, basevertex);
    }

    /** {@code void glMultiDrawElementsBaseVertex(GLenum mode, GLsizei const * count, GLenum type, void const * const * indices, GLsizei drawcount, GLint * basevertex)} */
    public static void glMultiDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLsizei const *") IntBuffer count, @NativeType("GLenum") int type, @NativeType("void const * const *") PointerBuffer indices, @NativeType("GLint *") IntBuffer basevertex) {
        GL32C.glMultiDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    // --- [ glProvokingVertex ] ---

    /** {@code void glProvokingVertex(GLenum mode)} */
    public static void glProvokingVertex(@NativeType("GLenum") int mode) {
        GL32C.glProvokingVertex(mode);
    }

    // --- [ glTexImage2DMultisample ] ---

    /** {@code void glTexImage2DMultisample(GLenum target, GLsizei samples, GLint internalformat, GLsizei width, GLsizei height, GLboolean fixedsamplelocations)} */
    public static void glTexImage2DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations) {
        GL32C.glTexImage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
    }

    // --- [ glTexImage3DMultisample ] ---

    /** {@code void glTexImage3DMultisample(GLenum target, GLsizei samples, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedsamplelocations)} */
    public static void glTexImage3DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations) {
        GL32C.glTexImage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

    // --- [ glGetMultisamplefv ] ---

    /** {@code void glGetMultisamplefv(GLenum pname, GLuint index, GLfloat * val)} */
    public static void nglGetMultisamplefv(int pname, int index, long val) {
        GL32C.nglGetMultisamplefv(pname, index, val);
    }

    /** {@code void glGetMultisamplefv(GLenum pname, GLuint index, GLfloat * val)} */
    public static void glGetMultisamplefv(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer val) {
        GL32C.glGetMultisamplefv(pname, index, val);
    }

    /** {@code void glGetMultisamplefv(GLenum pname, GLuint index, GLfloat * val)} */
    @NativeType("void")
    public static float glGetMultisamplef(@NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        return GL32C.glGetMultisamplef(pname, index);
    }

    // --- [ glSampleMaski ] ---

    /** {@code void glSampleMaski(GLuint index, GLbitfield mask)} */
    public static void glSampleMaski(@NativeType("GLuint") int index, @NativeType("GLbitfield") int mask) {
        GL32C.glSampleMaski(index, mask);
    }

    // --- [ glFramebufferTexture ] ---

    /** {@code void glFramebufferTexture(GLenum target, GLenum attachment, GLuint texture, GLint level)} */
    public static void glFramebufferTexture(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        GL32C.glFramebufferTexture(target, attachment, texture, level);
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

    // --- [ glGetInteger64i_v ] ---

    /** {@code void glGetInteger64i_v(GLenum pname, GLuint index, GLint64 * params)} */
    public static void nglGetInteger64i_v(int pname, int index, long params) {
        GL32C.nglGetInteger64i_v(pname, index, params);
    }

    /** {@code void glGetInteger64i_v(GLenum pname, GLuint index, GLint64 * params)} */
    public static void glGetInteger64i_v(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") LongBuffer params) {
        GL32C.glGetInteger64i_v(pname, index, params);
    }

    /** {@code void glGetInteger64i_v(GLenum pname, GLuint index, GLint64 * params)} */
    @NativeType("void")
    public static long glGetInteger64i(@NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        return GL32C.glGetInteger64i(pname, index);
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

    /** {@code void glGetBufferParameteri64v(GLenum target, GLenum pname, GLint64 * params)} */
    public static void glGetBufferParameteri64v(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        GL32C.glGetBufferParameteri64v(target, pname, params);
    }

    /** {@code void glMultiDrawElementsBaseVertex(GLenum mode, GLsizei const * count, GLenum type, void const * const * indices, GLsizei drawcount, GLint * basevertex)} */
    public static void glMultiDrawElementsBaseVertex(@NativeType("GLenum") int mode, @NativeType("GLsizei const *") int[] count, @NativeType("GLenum") int type, @NativeType("void const * const *") PointerBuffer indices, @NativeType("GLint *") int[] basevertex) {
        GL32C.glMultiDrawElementsBaseVertex(mode, count, type, indices, basevertex);
    }

    /** {@code void glGetMultisamplefv(GLenum pname, GLuint index, GLfloat * val)} */
    public static void glGetMultisamplefv(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] val) {
        GL32C.glGetMultisamplefv(pname, index, val);
    }

    /** {@code void glGetInteger64v(GLenum pname, GLint64 * params)} */
    public static void glGetInteger64v(@NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        GL32C.glGetInteger64v(pname, params);
    }

    /** {@code void glGetInteger64i_v(GLenum pname, GLuint index, GLint64 * params)} */
    public static void glGetInteger64i_v(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") long[] params) {
        GL32C.glGetInteger64i_v(pname, index, params);
    }

    /** {@code void glGetSynciv(GLsync sync, GLenum pname, GLsizei bufSize, GLsizei * length, GLint * values)} */
    public static void glGetSynciv(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLint *") int[] values) {
        GL32C.glGetSynciv(sync, pname, length, values);
    }

}