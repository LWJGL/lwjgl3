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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_matrix_palette.txt">ARB_matrix_palette</a> extension.
 * 
 * <p>This extension extends the abilities of {@link ARBVertexBlend} to include a palette of modelview matrices. The n vertex units use a palette of m modelview
 * matrices. (Where n and m are constrained to implementation defined maxima.) Each vertex has a set of n indices into the palette, and a corresponding set
 * of n weights. Matrix indices can be changed for each vertex (between {@link GL11#glBegin Begin} and {@link GL11#glEnd End}).</p>
 * 
 * <p>When this extension is utilized, the enabled units transform each vertex by the modelview matrices specified by the vertices' respective indices. These
 * results are subsequently scaled by the weights of the respective units and then summed to create the eyespace vertex.</p>
 * 
 * <p>A similar procedure is followed for normals. Normals, however, are transformed by the inverse transpose of the modelview matrix.</p>
 */
public class ARBMatrixPalette {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code pname} parameters of GetFloatv, GetDoublev, and IsEnabled, by the {@code mode} parameter of MatrixMode, and by the {@code cap}
     * parameters of Enable and Disable.
     */
    public static final int GL_MATRIX_PALETTE_ARB = 0x8840;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_MAX_MATRIX_PALETTE_STACK_DEPTH_ARB = 0x8841,
        GL_MAX_PALETTE_MATRICES_ARB           = 0x8842,
        GL_CURRENT_PALETTE_MATRIX_ARB         = 0x8843;

    /** Accepted by the {@code cap} parameters of EnableClientState and DisableClientState and by the {@code pname} parameter of IsEnabled. */
    public static final int GL_MATRIX_INDEX_ARRAY_ARB = 0x8844;

    /** Accepted by the {@code pname} parameter of GetFloatv. */
    public static final int GL_CURRENT_MATRIX_INDEX_ARB = 0x8845;

    /** Accepted by the {@code pname} parameter of GetIntegerv. */
    public static final int
        GL_MATRIX_INDEX_ARRAY_SIZE_ARB   = 0x8846,
        GL_MATRIX_INDEX_ARRAY_TYPE_ARB   = 0x8847,
        GL_MATRIX_INDEX_ARRAY_STRIDE_ARB = 0x8848;

    /** Accepted by the {@code pname} parameter of GetPointerv. */
    public static final int GL_MATRIX_INDEX_ARRAY_POINTER_ARB = 0x8849;

    protected ARBMatrixPalette() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCurrentPaletteMatrixARB ] ---

    /**
     * Defines which of the palette's matrices is affected by subsequent matrix operations when the current matrix mode is {@link #GL_MATRIX_PALETTE_ARB MATRIX_PALETTE_ARB},
     *
     * @param index the current matrix index. Must be a value between 0 and {@link #GL_MAX_PALETTE_MATRICES_ARB MAX_PALETTE_MATRICES_ARB}.
     */
    public static native void glCurrentPaletteMatrixARB(@NativeType("GLint") int index);

    // --- [ glMatrixIndexuivARB ] ---

    /**
     * Unsafe version of: {@link #glMatrixIndexuivARB MatrixIndexuivARB}
     *
     * @param size the number of index values to set. Must be a value between 1 and {@link ARBVertexBlend#GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     */
    public static native void nglMatrixIndexuivARB(int size, long indices);

    /**
     * Sets the current matrix indices.
     *
     * @param indices the matrix index values
     */
    public static void glMatrixIndexuivARB(@NativeType("GLuint *") IntBuffer indices) {
        nglMatrixIndexuivARB(indices.remaining(), memAddress(indices));
    }

    // --- [ glMatrixIndexubvARB ] ---

    /**
     * Unsafe version of: {@link #glMatrixIndexubvARB MatrixIndexubvARB}
     *
     * @param size the number of index values to set. Must be a value between 1 and {@link ARBVertexBlend#GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     */
    public static native void nglMatrixIndexubvARB(int size, long indices);

    /**
     * Byte version of {@link #glMatrixIndexuivARB MatrixIndexuivARB}.
     *
     * @param indices the matrix index values
     */
    public static void glMatrixIndexubvARB(@NativeType("GLubyte *") ByteBuffer indices) {
        nglMatrixIndexubvARB(indices.remaining(), memAddress(indices));
    }

    // --- [ glMatrixIndexusvARB ] ---

    /**
     * Unsafe version of: {@link #glMatrixIndexusvARB MatrixIndexusvARB}
     *
     * @param size the number of index values to set. Must be a value between 1 and {@link ARBVertexBlend#GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     */
    public static native void nglMatrixIndexusvARB(int size, long indices);

    /**
     * Short version of {@link #glMatrixIndexuivARB MatrixIndexuivARB}.
     *
     * @param indices the matrix index values
     */
    public static void glMatrixIndexusvARB(@NativeType("GLushort *") ShortBuffer indices) {
        nglMatrixIndexusvARB(indices.remaining(), memAddress(indices));
    }

    // --- [ glMatrixIndexPointerARB ] ---

    /**
     * Unsafe version of: {@link #glMatrixIndexPointerARB MatrixIndexPointerARB}
     *
     * @param type the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     */
    public static native void nglMatrixIndexPointerARB(int size, int type, int stride, long pointer);

    /**
     * @param size    the number of index values per vertex that are stored in the array. Must be a value between 1 and {@link ARBVertexBlend#GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
     * @param pointer the matrix index data
     */
    public static void glMatrixIndexPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglMatrixIndexPointerARB(size, type, stride, memAddress(pointer));
    }

    /**
     * @param size    the number of index values per vertex that are stored in the array. Must be a value between 1 and {@link ARBVertexBlend#GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
     * @param pointer the matrix index data
     */
    public static void glMatrixIndexPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglMatrixIndexPointerARB(size, type, stride, pointer);
    }

    /**
     * @param size    the number of index values per vertex that are stored in the array. Must be a value between 1 and {@link ARBVertexBlend#GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
     * @param pointer the matrix index data
     */
    public static void glMatrixIndexPointerARB(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglMatrixIndexPointerARB(size, GL11.GL_UNSIGNED_BYTE, stride, memAddress(pointer));
    }

    /**
     * @param size    the number of index values per vertex that are stored in the array. Must be a value between 1 and {@link ARBVertexBlend#GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
     * @param pointer the matrix index data
     */
    public static void glMatrixIndexPointerARB(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglMatrixIndexPointerARB(size, GL11.GL_UNSIGNED_SHORT, stride, memAddress(pointer));
    }

    /**
     * @param size    the number of index values per vertex that are stored in the array. Must be a value between 1 and {@link ARBVertexBlend#GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
     * @param pointer the matrix index data
     */
    public static void glMatrixIndexPointerARB(@NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglMatrixIndexPointerARB(size, GL11.GL_UNSIGNED_INT, stride, memAddress(pointer));
    }

    /** Array version of: {@link #glMatrixIndexuivARB MatrixIndexuivARB} */
    public static void glMatrixIndexuivARB(@NativeType("GLuint *") int[] indices) {
        long __functionAddress = GL.getICD().glMatrixIndexuivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(indices.length, indices, __functionAddress);
    }

    /** Array version of: {@link #glMatrixIndexusvARB MatrixIndexusvARB} */
    public static void glMatrixIndexusvARB(@NativeType("GLushort *") short[] indices) {
        long __functionAddress = GL.getICD().glMatrixIndexusvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(indices.length, indices, __functionAddress);
    }

}