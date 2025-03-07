/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL42C extends GL41C {

    static { GL.initialize(); }

    public static final int
        GL_COPY_READ_BUFFER_BINDING  = GL31.GL_COPY_READ_BUFFER,
        GL_COPY_WRITE_BUFFER_BINDING = GL31.GL_COPY_WRITE_BUFFER,
        GL_TRANSFORM_FEEDBACK_ACTIVE = GL40.GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE,
        GL_TRANSFORM_FEEDBACK_PAUSED = GL40.GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED;

    public static final int
        GL_COMPRESSED_RGBA_BPTC_UNORM         = 0x8E8C,
        GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM   = 0x8E8D,
        GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT   = 0x8E8E,
        GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT = 0x8E8F;

    public static final int
        GL_UNPACK_COMPRESSED_BLOCK_WIDTH  = 0x9127,
        GL_UNPACK_COMPRESSED_BLOCK_HEIGHT = 0x9128,
        GL_UNPACK_COMPRESSED_BLOCK_DEPTH  = 0x9129,
        GL_UNPACK_COMPRESSED_BLOCK_SIZE   = 0x912A,
        GL_PACK_COMPRESSED_BLOCK_WIDTH    = 0x912B,
        GL_PACK_COMPRESSED_BLOCK_HEIGHT   = 0x912C,
        GL_PACK_COMPRESSED_BLOCK_DEPTH    = 0x912D,
        GL_PACK_COMPRESSED_BLOCK_SIZE     = 0x912E;

    public static final int GL_ATOMIC_COUNTER_BUFFER = 0x92C0;

    public static final int GL_ATOMIC_COUNTER_BUFFER_BINDING = 0x92C1;

    public static final int
        GL_ATOMIC_COUNTER_BUFFER_START = 0x92C2,
        GL_ATOMIC_COUNTER_BUFFER_SIZE  = 0x92C3;

    public static final int
        GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE                            = 0x92C4,
        GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS               = 0x92C5,
        GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES        = 0x92C6,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER          = 0x92C7,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER    = 0x92C8,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x92C9,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER        = 0x92CA,
        GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER        = 0x92CB;

    public static final int
        GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS          = 0x92CC,
        GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS    = 0x92CD,
        GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = 0x92CE,
        GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS        = 0x92CF,
        GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS        = 0x92D0,
        GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS        = 0x92D1,
        GL_MAX_VERTEX_ATOMIC_COUNTERS                 = 0x92D2,
        GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS           = 0x92D3,
        GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS        = 0x92D4,
        GL_MAX_GEOMETRY_ATOMIC_COUNTERS               = 0x92D5,
        GL_MAX_FRAGMENT_ATOMIC_COUNTERS               = 0x92D6,
        GL_MAX_COMBINED_ATOMIC_COUNTERS               = 0x92D7,
        GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE             = 0x92D8,
        GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS         = 0x92DC;

    public static final int GL_ACTIVE_ATOMIC_COUNTER_BUFFERS = 0x92D9;

    public static final int GL_UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX = 0x92DA;

    public static final int GL_UNSIGNED_INT_ATOMIC_COUNTER = 0x92DB;

    public static final int GL_TEXTURE_IMMUTABLE_FORMAT = 0x912F;

    public static final int
        GL_MAX_IMAGE_UNITS                               = 0x8F38,
        GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS = 0x8F39,
        GL_MAX_IMAGE_SAMPLES                             = 0x906D,
        GL_MAX_VERTEX_IMAGE_UNIFORMS                     = 0x90CA,
        GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS               = 0x90CB,
        GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS            = 0x90CC,
        GL_MAX_GEOMETRY_IMAGE_UNIFORMS                   = 0x90CD,
        GL_MAX_FRAGMENT_IMAGE_UNIFORMS                   = 0x90CE,
        GL_MAX_COMBINED_IMAGE_UNIFORMS                   = 0x90CF;

    public static final int
        GL_IMAGE_BINDING_NAME    = 0x8F3A,
        GL_IMAGE_BINDING_LEVEL   = 0x8F3B,
        GL_IMAGE_BINDING_LAYERED = 0x8F3C,
        GL_IMAGE_BINDING_LAYER   = 0x8F3D,
        GL_IMAGE_BINDING_ACCESS  = 0x8F3E,
        GL_IMAGE_BINDING_FORMAT  = 0x906E;

    public static final int
        GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT = 0x1,
        GL_ELEMENT_ARRAY_BARRIER_BIT       = 0x2,
        GL_UNIFORM_BARRIER_BIT             = 0x4,
        GL_TEXTURE_FETCH_BARRIER_BIT       = 0x8,
        GL_SHADER_IMAGE_ACCESS_BARRIER_BIT = 0x20,
        GL_COMMAND_BARRIER_BIT             = 0x40,
        GL_PIXEL_BUFFER_BARRIER_BIT        = 0x80,
        GL_TEXTURE_UPDATE_BARRIER_BIT      = 0x100,
        GL_BUFFER_UPDATE_BARRIER_BIT       = 0x200,
        GL_FRAMEBUFFER_BARRIER_BIT         = 0x400,
        GL_TRANSFORM_FEEDBACK_BARRIER_BIT  = 0x800,
        GL_ATOMIC_COUNTER_BARRIER_BIT      = 0x1000,
        GL_ALL_BARRIER_BITS                = 0xFFFFFFFF;

    public static final int
        GL_IMAGE_1D                                = 0x904C,
        GL_IMAGE_2D                                = 0x904D,
        GL_IMAGE_3D                                = 0x904E,
        GL_IMAGE_2D_RECT                           = 0x904F,
        GL_IMAGE_CUBE                              = 0x9050,
        GL_IMAGE_BUFFER                            = 0x9051,
        GL_IMAGE_1D_ARRAY                          = 0x9052,
        GL_IMAGE_2D_ARRAY                          = 0x9053,
        GL_IMAGE_CUBE_MAP_ARRAY                    = 0x9054,
        GL_IMAGE_2D_MULTISAMPLE                    = 0x9055,
        GL_IMAGE_2D_MULTISAMPLE_ARRAY              = 0x9056,
        GL_INT_IMAGE_1D                            = 0x9057,
        GL_INT_IMAGE_2D                            = 0x9058,
        GL_INT_IMAGE_3D                            = 0x9059,
        GL_INT_IMAGE_2D_RECT                       = 0x905A,
        GL_INT_IMAGE_CUBE                          = 0x905B,
        GL_INT_IMAGE_BUFFER                        = 0x905C,
        GL_INT_IMAGE_1D_ARRAY                      = 0x905D,
        GL_INT_IMAGE_2D_ARRAY                      = 0x905E,
        GL_INT_IMAGE_CUBE_MAP_ARRAY                = 0x905F,
        GL_INT_IMAGE_2D_MULTISAMPLE                = 0x9060,
        GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY          = 0x9061,
        GL_UNSIGNED_INT_IMAGE_1D                   = 0x9062,
        GL_UNSIGNED_INT_IMAGE_2D                   = 0x9063,
        GL_UNSIGNED_INT_IMAGE_3D                   = 0x9064,
        GL_UNSIGNED_INT_IMAGE_2D_RECT              = 0x9065,
        GL_UNSIGNED_INT_IMAGE_CUBE                 = 0x9066,
        GL_UNSIGNED_INT_IMAGE_BUFFER               = 0x9067,
        GL_UNSIGNED_INT_IMAGE_1D_ARRAY             = 0x9068,
        GL_UNSIGNED_INT_IMAGE_2D_ARRAY             = 0x9069,
        GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY       = 0x906A,
        GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE       = 0x906B,
        GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 0x906C;

    public static final int GL_IMAGE_FORMAT_COMPATIBILITY_TYPE = 0x90C7;

    public static final int
        GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE  = 0x90C8,
        GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS = 0x90C9;

    public static final int GL_NUM_SAMPLE_COUNTS = 0x9380;

    public static final int GL_MIN_MAP_BUFFER_ALIGNMENT = 0x90BC;

    protected GL42C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetActiveAtomicCounterBufferiv ] ---

    /** {@code void glGetActiveAtomicCounterBufferiv(GLuint program, GLuint bufferIndex, GLenum pname, GLint * params)} */
    public static native void nglGetActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, long params);

    /** {@code void glGetActiveAtomicCounterBufferiv(GLuint program, GLuint bufferIndex, GLenum pname, GLint * params)} */
    public static void glGetActiveAtomicCounterBufferiv(@NativeType("GLuint") int program, @NativeType("GLuint") int bufferIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, memAddress(params));
    }

    /** {@code void glGetActiveAtomicCounterBufferiv(GLuint program, GLuint bufferIndex, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetActiveAtomicCounterBufferi(@NativeType("GLuint") int program, @NativeType("GLuint") int bufferIndex, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetActiveAtomicCounterBufferiv(program, bufferIndex, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTexStorage1D ] ---

    /** {@code void glTexStorage1D(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width)} */
    public static native void glTexStorage1D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width);

    // --- [ glTexStorage2D ] ---

    /** {@code void glTexStorage2D(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glTexStorage2D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glTexStorage3D ] ---

    /** {@code void glTexStorage3D(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth)} */
    public static native void glTexStorage3D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth);

    // --- [ glDrawTransformFeedbackInstanced ] ---

    /** {@code void glDrawTransformFeedbackInstanced(GLenum mode, GLuint id, GLsizei primcount)} */
    public static native void glDrawTransformFeedbackInstanced(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLsizei") int primcount);

    // --- [ glDrawTransformFeedbackStreamInstanced ] ---

    /** {@code void glDrawTransformFeedbackStreamInstanced(GLenum mode, GLuint id, GLuint stream, GLsizei primcount)} */
    public static native void glDrawTransformFeedbackStreamInstanced(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLuint") int stream, @NativeType("GLsizei") int primcount);

    // --- [ glDrawArraysInstancedBaseInstance ] ---

    /** {@code void glDrawArraysInstancedBaseInstance(GLenum mode, GLint first, GLsizei count, GLsizei primcount, GLuint baseinstance)} */
    public static native void glDrawArraysInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance);

    // --- [ glDrawElementsInstancedBaseInstance ] ---

    /** {@code void glDrawElementsInstancedBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLuint baseinstance)} */
    public static native void nglDrawElementsInstancedBaseInstance(int mode, int count, int type, long indices, int primcount, int baseinstance);

    /** {@code void glDrawElementsInstancedBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseInstance(mode, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices), primcount, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), primcount, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), primcount, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), primcount, baseinstance);
    }

    // --- [ glDrawElementsInstancedBaseVertexBaseInstance ] ---

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex, GLuint baseinstance)} */
    public static native void nglDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indices, int primcount, int basevertex, int baseinstance);

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseVertexBaseInstance(mode, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices), primcount, basevertex, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseVertexBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), primcount, basevertex, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseVertexBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), primcount, basevertex, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseVertexBaseInstance(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), primcount, basevertex, baseinstance);
    }

    // --- [ glBindImageTexture ] ---

    /** {@code void glBindImageTexture(GLuint unit, GLuint texture, GLint level, GLboolean layered, GLint layer, GLenum access, GLenum format)} */
    public static native void glBindImageTexture(@NativeType("GLuint") int unit, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLboolean") boolean layered, @NativeType("GLint") int layer, @NativeType("GLenum") int access, @NativeType("GLenum") int format);

    // --- [ glMemoryBarrier ] ---

    /** {@code void glMemoryBarrier(GLbitfield barriers)} */
    public static native void glMemoryBarrier(@NativeType("GLbitfield") int barriers);

    // --- [ glGetInternalformativ ] ---

    /** {@code void glGetInternalformativ(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint * params)} */
    public static native void nglGetInternalformativ(int target, int internalformat, int pname, int bufSize, long params);

    /** {@code void glGetInternalformativ(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint * params)} */
    public static void glGetInternalformativ(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        nglGetInternalformativ(target, internalformat, pname, params.remaining(), memAddress(params));
    }

    /** {@code void glGetInternalformativ(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint * params)} */
    @NativeType("void")
    public static int glGetInternalformati(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetInternalformativ(target, internalformat, pname, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetActiveAtomicCounterBufferiv(GLuint program, GLuint bufferIndex, GLenum pname, GLint * params)} */
    public static void glGetActiveAtomicCounterBufferiv(@NativeType("GLuint") int program, @NativeType("GLuint") int bufferIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetActiveAtomicCounterBufferiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, bufferIndex, pname, params, __functionAddress);
    }

    /** {@code void glGetInternalformativ(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint * params)} */
    public static void glGetInternalformativ(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetInternalformativ;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, pname, params.length, params, __functionAddress);
    }

}