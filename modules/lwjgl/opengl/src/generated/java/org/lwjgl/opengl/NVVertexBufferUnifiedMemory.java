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

public class NVVertexBufferUnifiedMemory {

    static { GL.initialize(); }

    public static final int
        GL_VERTEX_ATTRIB_ARRAY_UNIFIED_NV = 0x8F1E,
        GL_ELEMENT_ARRAY_UNIFIED_NV       = 0x8F1F;

    public static final int
        GL_VERTEX_ATTRIB_ARRAY_ADDRESS_NV = 0x8F20,
        GL_TEXTURE_COORD_ARRAY_ADDRESS_NV = 0x8F25;

    public static final int
        GL_VERTEX_ARRAY_ADDRESS_NV          = 0x8F21,
        GL_NORMAL_ARRAY_ADDRESS_NV          = 0x8F22,
        GL_COLOR_ARRAY_ADDRESS_NV           = 0x8F23,
        GL_INDEX_ARRAY_ADDRESS_NV           = 0x8F24,
        GL_EDGE_FLAG_ARRAY_ADDRESS_NV       = 0x8F26,
        GL_SECONDARY_COLOR_ARRAY_ADDRESS_NV = 0x8F27,
        GL_FOG_COORD_ARRAY_ADDRESS_NV       = 0x8F28,
        GL_ELEMENT_ARRAY_ADDRESS_NV         = 0x8F29;

    public static final int
        GL_VERTEX_ATTRIB_ARRAY_LENGTH_NV = 0x8F2A,
        GL_TEXTURE_COORD_ARRAY_LENGTH_NV = 0x8F2F;

    public static final int
        GL_VERTEX_ARRAY_LENGTH_NV          = 0x8F2B,
        GL_NORMAL_ARRAY_LENGTH_NV          = 0x8F2C,
        GL_COLOR_ARRAY_LENGTH_NV           = 0x8F2D,
        GL_INDEX_ARRAY_LENGTH_NV           = 0x8F2E,
        GL_EDGE_FLAG_ARRAY_LENGTH_NV       = 0x8F30,
        GL_SECONDARY_COLOR_ARRAY_LENGTH_NV = 0x8F31,
        GL_FOG_COORD_ARRAY_LENGTH_NV       = 0x8F32,
        GL_ELEMENT_ARRAY_LENGTH_NV         = 0x8F33;

    protected NVVertexBufferUnifiedMemory() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBufferAddressRangeNV ] ---

    /** {@code void glBufferAddressRangeNV(GLenum pname, GLuint index, GLuint64EXT address, GLsizeiptr length)} */
    public static native void glBufferAddressRangeNV(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLuint64EXT") long address, @NativeType("GLsizeiptr") long length);

    // --- [ glVertexFormatNV ] ---

    /** {@code void glVertexFormatNV(GLint size, GLenum type, GLsizei stride)} */
    public static native void glVertexFormatNV(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    // --- [ glNormalFormatNV ] ---

    /** {@code void glNormalFormatNV(GLenum type, GLsizei stride)} */
    public static native void glNormalFormatNV(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    // --- [ glColorFormatNV ] ---

    /** {@code void glColorFormatNV(GLint size, GLenum type, GLsizei stride)} */
    public static native void glColorFormatNV(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    // --- [ glIndexFormatNV ] ---

    /** {@code void glIndexFormatNV(GLenum type, GLsizei stride)} */
    public static native void glIndexFormatNV(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    // --- [ glTexCoordFormatNV ] ---

    /** {@code void glTexCoordFormatNV(GLint size, GLenum type, GLsizei stride)} */
    public static native void glTexCoordFormatNV(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    // --- [ glEdgeFlagFormatNV ] ---

    /** {@code void glEdgeFlagFormatNV(GLsizei stride)} */
    public static native void glEdgeFlagFormatNV(@NativeType("GLsizei") int stride);

    // --- [ glSecondaryColorFormatNV ] ---

    /** {@code void glSecondaryColorFormatNV(GLint size, GLenum type, GLsizei stride)} */
    public static native void glSecondaryColorFormatNV(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    // --- [ glFogCoordFormatNV ] ---

    /** {@code void glFogCoordFormatNV(GLenum type, GLsizei stride)} */
    public static native void glFogCoordFormatNV(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    // --- [ glVertexAttribFormatNV ] ---

    /** {@code void glVertexAttribFormatNV(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride)} */
    public static native void glVertexAttribFormatNV(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride);

    // --- [ glVertexAttribIFormatNV ] ---

    /** {@code void glVertexAttribIFormatNV(GLuint index, GLint size, GLenum type, GLsizei stride)} */
    public static native void glVertexAttribIFormatNV(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    // --- [ glGetIntegerui64i_vNV ] ---

    /** {@code void glGetIntegerui64i_vNV(GLenum value, GLuint index, GLuint64EXT * result)} */
    public static native void nglGetIntegerui64i_vNV(int value, int index, long result);

    /** {@code void glGetIntegerui64i_vNV(GLenum value, GLuint index, GLuint64EXT * result)} */
    public static void glGetIntegerui64i_vNV(@NativeType("GLenum") int value, @NativeType("GLuint") int index, @NativeType("GLuint64EXT *") LongBuffer result) {
        if (CHECKS) {
            check(result, 1);
        }
        nglGetIntegerui64i_vNV(value, index, memAddress(result));
    }

    /** {@code void glGetIntegerui64i_vNV(GLenum value, GLuint index, GLuint64EXT * result)} */
    @NativeType("void")
    public static long glGetIntegerui64iNV(@NativeType("GLenum") int value, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer result = stack.callocLong(1);
            nglGetIntegerui64i_vNV(value, index, memAddress(result));
            return result.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetIntegerui64i_vNV(GLenum value, GLuint index, GLuint64EXT * result)} */
    public static void glGetIntegerui64i_vNV(@NativeType("GLenum") int value, @NativeType("GLuint") int index, @NativeType("GLuint64EXT *") long[] result) {
        long __functionAddress = GL.getICD().glGetIntegerui64i_vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(result, 1);
        }
        callPV(value, index, result, __functionAddress);
    }

}