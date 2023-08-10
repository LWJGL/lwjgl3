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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_vertex_buffer_unified_memory.txt">NV_vertex_buffer_unified_memory</a> extension.
 * 
 * <p>This extension provides a mechanism to specify vertex attrib and element array locations using GPU addresses.</p>
 * 
 * <p>Binding vertex buffers is one of the most frequent and expensive operations in many GL applications, due to the cost of chasing pointers and binding
 * objects described in the Overview of {@link NVShaderBufferLoad NV_shader_buffer_load}. The intent of this extension is to enable a way for the application to specify
 * vertex attrib state that alleviates the overhead of object binds and driver memory management.</p>
 */
public class NVVertexBufferUnifiedMemory {

    static { GL.initialize(); }

    /** Accepted by the {@code cap} parameter of DisableClientState, EnableClientState, IsEnabled. */
    public static final int
        GL_VERTEX_ATTRIB_ARRAY_UNIFIED_NV = 0x8F1E,
        GL_ELEMENT_ARRAY_UNIFIED_NV       = 0x8F1F;

    /** Accepted by the {@code pname} parameter of BufferAddressRangeNV and the {@code value} parameter of GetIntegerui64i_vNV. */
    public static final int
        GL_VERTEX_ATTRIB_ARRAY_ADDRESS_NV = 0x8F20,
        GL_TEXTURE_COORD_ARRAY_ADDRESS_NV = 0x8F25;

    /** Accepted by the {@code pname} parameter of BufferAddressRangeNV and the {@code value} parameter of GetIntegerui64vNV. */
    public static final int
        GL_VERTEX_ARRAY_ADDRESS_NV          = 0x8F21,
        GL_NORMAL_ARRAY_ADDRESS_NV          = 0x8F22,
        GL_COLOR_ARRAY_ADDRESS_NV           = 0x8F23,
        GL_INDEX_ARRAY_ADDRESS_NV           = 0x8F24,
        GL_EDGE_FLAG_ARRAY_ADDRESS_NV       = 0x8F26,
        GL_SECONDARY_COLOR_ARRAY_ADDRESS_NV = 0x8F27,
        GL_FOG_COORD_ARRAY_ADDRESS_NV       = 0x8F28,
        GL_ELEMENT_ARRAY_ADDRESS_NV         = 0x8F29;

    /** Accepted by the {@code target} parameter of GetIntegeri_vNV. */
    public static final int
        GL_VERTEX_ATTRIB_ARRAY_LENGTH_NV = 0x8F2A,
        GL_TEXTURE_COORD_ARRAY_LENGTH_NV = 0x8F2F;

    /** Accepted by the {@code value} parameter of GetIntegerv. */
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

    public static native void glBufferAddressRangeNV(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLuint64EXT") long address, @NativeType("GLsizeiptr") long length);

    // --- [ glVertexFormatNV ] ---

    public static native void glVertexFormatNV(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    // --- [ glNormalFormatNV ] ---

    public static native void glNormalFormatNV(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    // --- [ glColorFormatNV ] ---

    public static native void glColorFormatNV(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    // --- [ glIndexFormatNV ] ---

    public static native void glIndexFormatNV(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    // --- [ glTexCoordFormatNV ] ---

    public static native void glTexCoordFormatNV(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    // --- [ glEdgeFlagFormatNV ] ---

    public static native void glEdgeFlagFormatNV(@NativeType("GLsizei") int stride);

    // --- [ glSecondaryColorFormatNV ] ---

    public static native void glSecondaryColorFormatNV(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    // --- [ glFogCoordFormatNV ] ---

    public static native void glFogCoordFormatNV(@NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    // --- [ glVertexAttribFormatNV ] ---

    public static native void glVertexAttribFormatNV(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride);

    // --- [ glVertexAttribIFormatNV ] ---

    public static native void glVertexAttribIFormatNV(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    // --- [ glGetIntegerui64i_vNV ] ---

    public static native void nglGetIntegerui64i_vNV(int value, int index, long result);

    public static void glGetIntegerui64i_vNV(@NativeType("GLenum") int value, @NativeType("GLuint") int index, @NativeType("GLuint64EXT *") LongBuffer result) {
        if (CHECKS) {
            check(result, 1);
        }
        nglGetIntegerui64i_vNV(value, index, memAddress(result));
    }

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

    /** Array version of: {@link #glGetIntegerui64i_vNV GetIntegerui64i_vNV} */
    public static void glGetIntegerui64i_vNV(@NativeType("GLenum") int value, @NativeType("GLuint") int index, @NativeType("GLuint64EXT *") long[] result) {
        long __functionAddress = GL.getICD().glGetIntegerui64i_vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(result, 1);
        }
        callPV(value, index, result, __functionAddress);
    }

}