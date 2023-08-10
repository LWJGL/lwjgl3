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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_vertex_blend.txt">ARB_vertex_blend</a> extension.
 * 
 * <p>This extension provides the ability to replace the single modelview transformation with a set of n vertex units. (Where n is constrained to an
 * implementation defined maximum.) Each unit has its own modelview transform matrix. For each unit, there is a current weight associated with the vertex.
 * When this extension is enabled the vertices are transformed by the modelview matrices of all of the enabled units. Afterward, these results are scaled
 * by the weights for the respective units and then summed to create the eye-space vertex. A similar procedure is followed for the normals, except they are
 * transformed by the inverse transpose of the modelview matrices.</p>
 */
public class ARBVertexBlend {

    static { GL.initialize(); }

    /** Accepted by the {@code value} parameters of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_MAX_VERTEX_UNITS_ARB    = 0x86A4,
        GL_ACTIVE_VERTEX_UNITS_ARB = 0x86A5;

    /**
     * Accepted by the {@code cap} parameters of Enable and Disable, by the {@code value} parameter of IsEnabled, GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev.
     */
    public static final int
        GL_WEIGHT_SUM_UNITY_ARB = 0x86A6,
        GL_VERTEX_BLEND_ARB     = 0x86A7;

    /** Accepted by the {@code mode} parameter of MatrixMode and by the {@code value} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_MODELVIEW0_ARB  = 0x1700,
        GL_MODELVIEW1_ARB  = 0x850A,
        GL_MODELVIEW2_ARB  = 0x8722,
        GL_MODELVIEW3_ARB  = 0x8723,
        GL_MODELVIEW4_ARB  = 0x8724,
        GL_MODELVIEW5_ARB  = 0x8725,
        GL_MODELVIEW6_ARB  = 0x8726,
        GL_MODELVIEW7_ARB  = 0x8727,
        GL_MODELVIEW8_ARB  = 0x8728,
        GL_MODELVIEW9_ARB  = 0x8729,
        GL_MODELVIEW10_ARB = 0x872A,
        GL_MODELVIEW11_ARB = 0x872B,
        GL_MODELVIEW12_ARB = 0x872C,
        GL_MODELVIEW13_ARB = 0x872D,
        GL_MODELVIEW14_ARB = 0x872E,
        GL_MODELVIEW15_ARB = 0x872F,
        GL_MODELVIEW16_ARB = 0x8730,
        GL_MODELVIEW17_ARB = 0x8731,
        GL_MODELVIEW18_ARB = 0x8732,
        GL_MODELVIEW19_ARB = 0x8733,
        GL_MODELVIEW20_ARB = 0x8734,
        GL_MODELVIEW21_ARB = 0x8735,
        GL_MODELVIEW22_ARB = 0x8736,
        GL_MODELVIEW23_ARB = 0x8737,
        GL_MODELVIEW24_ARB = 0x8738,
        GL_MODELVIEW25_ARB = 0x8739,
        GL_MODELVIEW26_ARB = 0x873A,
        GL_MODELVIEW27_ARB = 0x873B,
        GL_MODELVIEW28_ARB = 0x873C,
        GL_MODELVIEW29_ARB = 0x873D,
        GL_MODELVIEW30_ARB = 0x873E,
        GL_MODELVIEW31_ARB = 0x873F;

    /** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_CURRENT_WEIGHT_ARB = 0x86A8;

    /** Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_WEIGHT_ARRAY_TYPE_ARB   = 0x86A9,
        GL_WEIGHT_ARRAY_STRIDE_ARB = 0x86AA,
        GL_WEIGHT_ARRAY_SIZE_ARB   = 0x86AB;

    /** Accepted by the {@code pname} parameter of GetPointerv. */
    public static final int GL_WEIGHT_ARRAY_POINTER_ARB = 0x86AC;

    /**
     * Accepted by the {@code cap} parameters of EnableClientState and DisableClientState, by the {@code value} parameter of IsEnabled, GetBooleanv,
     * GetIntegerv, GetFloatv, and GetDoublev.
     */
    public static final int GL_WEIGHT_ARRAY_ARB = 0x86AD;

    protected ARBVertexBlend() {
        throw new UnsupportedOperationException();
    }

    // --- [ glWeightfvARB ] ---

    /**
     * Unsafe version of: {@link #glWeightfvARB WeightfvARB}
     *
     * @param size the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     */
    public static native void nglWeightfvARB(int size, long weights);

    /**
     * Sets the current vertex weights.
     *
     * @param weights the vertex weights
     */
    public static void glWeightfvARB(@NativeType("GLfloat *") FloatBuffer weights) {
        nglWeightfvARB(weights.remaining(), memAddress(weights));
    }

    // --- [ glWeightbvARB ] ---

    /**
     * Unsafe version of: {@link #glWeightbvARB WeightbvARB}
     *
     * @param size the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     */
    public static native void nglWeightbvARB(int size, long weights);

    /**
     * Byte version of {@link #glWeightfvARB WeightfvARB}.
     *
     * @param weights the vertex weights
     */
    public static void glWeightbvARB(@NativeType("GLbyte *") ByteBuffer weights) {
        nglWeightbvARB(weights.remaining(), memAddress(weights));
    }

    // --- [ glWeightubvARB ] ---

    /**
     * Unsafe version of: {@link #glWeightubvARB WeightubvARB}
     *
     * @param size the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     */
    public static native void nglWeightubvARB(int size, long weights);

    /**
     * Unsigned byte version of {@link #glWeightfvARB WeightfvARB}.
     *
     * @param weights the vertex weights
     */
    public static void glWeightubvARB(@NativeType("GLubyte *") ByteBuffer weights) {
        nglWeightubvARB(weights.remaining(), memAddress(weights));
    }

    // --- [ glWeightsvARB ] ---

    /**
     * Unsafe version of: {@link #glWeightsvARB WeightsvARB}
     *
     * @param size the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     */
    public static native void nglWeightsvARB(int size, long weights);

    /**
     * Short version of {@link #glWeightfvARB WeightfvARB}.
     *
     * @param weights the vertex weights
     */
    public static void glWeightsvARB(@NativeType("GLshort *") ShortBuffer weights) {
        nglWeightsvARB(weights.remaining(), memAddress(weights));
    }

    // --- [ glWeightusvARB ] ---

    /**
     * Unsafe version of: {@link #glWeightusvARB WeightusvARB}
     *
     * @param size the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     */
    public static native void nglWeightusvARB(int size, long weights);

    /**
     * Unsigned short version of {@link #glWeightfvARB WeightfvARB}.
     *
     * @param weights the vertex weights
     */
    public static void glWeightusvARB(@NativeType("GLushort *") ShortBuffer weights) {
        nglWeightusvARB(weights.remaining(), memAddress(weights));
    }

    // --- [ glWeightivARB ] ---

    /**
     * Unsafe version of: {@link #glWeightivARB WeightivARB}
     *
     * @param size the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     */
    public static native void nglWeightivARB(int size, long weights);

    /**
     * Integer version of {@link #glWeightfvARB WeightfvARB}.
     *
     * @param weights the vertex weights
     */
    public static void glWeightivARB(@NativeType("GLint *") IntBuffer weights) {
        nglWeightivARB(weights.remaining(), memAddress(weights));
    }

    // --- [ glWeightuivARB ] ---

    /**
     * Unsafe version of: {@link #glWeightuivARB WeightuivARB}
     *
     * @param size the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     */
    public static native void nglWeightuivARB(int size, long weights);

    /**
     * Unsigned integer version of {@link #glWeightfvARB WeightfvARB}.
     *
     * @param weights the vertex weights
     */
    public static void glWeightuivARB(@NativeType("GLuint *") IntBuffer weights) {
        nglWeightuivARB(weights.remaining(), memAddress(weights));
    }

    // --- [ glWeightdvARB ] ---

    /**
     * Unsafe version of: {@link #glWeightdvARB WeightdvARB}
     *
     * @param size the number of weights to set. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     */
    public static native void nglWeightdvARB(int size, long weights);

    /**
     * Double version of {@link #glWeightfvARB WeightfvARB}.
     *
     * @param weights the vertex weights
     */
    public static void glWeightdvARB(@NativeType("GLdouble *") DoubleBuffer weights) {
        nglWeightdvARB(weights.remaining(), memAddress(weights));
    }

    // --- [ glWeightPointerARB ] ---

    /** Unsafe version of: {@link #glWeightPointerARB WeightPointerARB} */
    public static native void nglWeightPointerARB(int size, int type, int stride, long pointer);

    /**
     * Specifies the location and organization of a weight array.
     *
     * @param size    the number of values per vertex that are stored in the array. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
     * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
     * @param pointer the weight data
     */
    public static void glWeightPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglWeightPointerARB(size, type, stride, memAddress(pointer));
    }

    /**
     * Specifies the location and organization of a weight array.
     *
     * @param size    the number of values per vertex that are stored in the array. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
     * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
     * @param pointer the weight data
     */
    public static void glWeightPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglWeightPointerARB(size, type, stride, pointer);
    }

    /**
     * Specifies the location and organization of a weight array.
     *
     * @param size    the number of values per vertex that are stored in the array. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
     * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
     * @param pointer the weight data
     */
    public static void glWeightPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglWeightPointerARB(size, type, stride, memAddress(pointer));
    }

    /**
     * Specifies the location and organization of a weight array.
     *
     * @param size    the number of values per vertex that are stored in the array. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
     * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
     * @param pointer the weight data
     */
    public static void glWeightPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglWeightPointerARB(size, type, stride, memAddress(pointer));
    }

    /**
     * Specifies the location and organization of a weight array.
     *
     * @param size    the number of values per vertex that are stored in the array. Must be a value between 1 and {@link #GL_MAX_VERTEX_UNITS_ARB MAX_VERTEX_UNITS_ARB}.
     * @param type    the data type of the values stored in the array. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
     * @param stride  the vertex stride in bytes. If specified as zero, then array elements are stored sequentially
     * @param pointer the weight data
     */
    public static void glWeightPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglWeightPointerARB(size, type, stride, memAddress(pointer));
    }

    // --- [ glVertexBlendARB ] ---

    /**
     * Sets the number of active transformations applied.
     *
     * @param count the number of transformations to blend
     */
    public static native void glVertexBlendARB(@NativeType("GLint") int count);

    /** Array version of: {@link #glWeightfvARB WeightfvARB} */
    public static void glWeightfvARB(@NativeType("GLfloat *") float[] weights) {
        long __functionAddress = GL.getICD().glWeightfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(weights.length, weights, __functionAddress);
    }

    /** Array version of: {@link #glWeightsvARB WeightsvARB} */
    public static void glWeightsvARB(@NativeType("GLshort *") short[] weights) {
        long __functionAddress = GL.getICD().glWeightsvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(weights.length, weights, __functionAddress);
    }

    /** Array version of: {@link #glWeightusvARB WeightusvARB} */
    public static void glWeightusvARB(@NativeType("GLushort *") short[] weights) {
        long __functionAddress = GL.getICD().glWeightusvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(weights.length, weights, __functionAddress);
    }

    /** Array version of: {@link #glWeightivARB WeightivARB} */
    public static void glWeightivARB(@NativeType("GLint *") int[] weights) {
        long __functionAddress = GL.getICD().glWeightivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(weights.length, weights, __functionAddress);
    }

    /** Array version of: {@link #glWeightuivARB WeightuivARB} */
    public static void glWeightuivARB(@NativeType("GLuint *") int[] weights) {
        long __functionAddress = GL.getICD().glWeightuivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(weights.length, weights, __functionAddress);
    }

    /** Array version of: {@link #glWeightdvARB WeightdvARB} */
    public static void glWeightdvARB(@NativeType("GLdouble *") double[] weights) {
        long __functionAddress = GL.getICD().glWeightdvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(weights.length, weights, __functionAddress);
    }

    /** Array version of: {@link #glWeightPointerARB WeightPointerARB} */
    public static void glWeightPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") short[] pointer) {
        long __functionAddress = GL.getICD().glWeightPointerARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }

    /** Array version of: {@link #glWeightPointerARB WeightPointerARB} */
    public static void glWeightPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") int[] pointer) {
        long __functionAddress = GL.getICD().glWeightPointerARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }

    /** Array version of: {@link #glWeightPointerARB WeightPointerARB} */
    public static void glWeightPointerARB(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") float[] pointer) {
        long __functionAddress = GL.getICD().glWeightPointerARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }

}