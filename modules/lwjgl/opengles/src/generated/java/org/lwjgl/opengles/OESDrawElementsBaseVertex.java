/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_draw_elements_base_vertex.txt">OES_draw_elements_base_vertex</a> extension.
 * 
 * <p>This extension provides a method to specify a "base vertex offset" value which is effectively added to every vertex index that is transferred through
 * DrawElements.</p>
 * 
 * <p>This mechanism can be used to decouple a set of indices from the actual vertex array that it is referencing. This is useful if an application stores
 * multiple indexed models in a single vertex array. The same index array can be used to draw the model no matter where it ends up in a larger vertex
 * array simply by changing the base vertex value. Without this functionality, it would be necessary to rebind all the vertex attributes every time
 * geometry is switched and this can have larger performance penalty.</p>
 * 
 * <p>For example consider the (very contrived and simple) example of drawing two triangles to form a quad. In the typical example you have the following
 * setup:</p>
 * 
 * <pre><code>
 *          vertices                indices
 *          ----------                -----
 *       0 | (-1,  1) |            0 |  0  |
 *       1 | (-1, -1) |            1 |  1  |
 *       2 | ( 1, -1) |            2 |  2  |
 *       3 | ( 1,  1) |            3 |  3  |
 *          ----------             4 |  0  |
 *                                 5 |  2  |
 *                                    -----</code></pre>
 * 
 * <p>which is normally rendered with the call</p>
 * 
 * <pre><code>
 *         DrawElements(TRIANGLES, 6, UNSIGNED_BYTE, &amp;indices).</code></pre>
 * 
 * <p>Now consider the case where the vertices you want to draw are not at the start of a vertex array but are instead located at offset 100 into a larger
 * array:</p>
 * 
 * <pre><code>
 *            vertices2             indices2
 *            ----------             -----
 *               ....             0 | 100 |
 *       100 | (-1,  1) |         1 | 101 |
 *       101 | (-1, -1) |         2 | 102 |
 *       102 | ( 1, -1) |         3 | 103 |
 *       103 | ( 1,  1) |         4 | 100 |
 *               ....             5 | 102 |
 *            ----------             -----</code></pre>
 * 
 * <p>The typical choices for rendering this are to rebind your vertex attributes with an additional offset of 100*stride, or to create an new array of
 * indices (as indices2 in the example). However both rebinding vertex attributes and rebuilding index arrays can be quite costly activities.</p>
 * 
 * <p>With the new drawing commands introduced by this extension you can instead draw using vertices2 and the new draw call:</p>
 * 
 * <pre><code>
 *         DrawElementsBaseVertexOES(TRIANGLES, 6, UNSIGNED_BYTE, &amp;indices, 100)</code></pre>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class OESDrawElementsBaseVertex {

    static { GLES.initialize(); }

    protected OESDrawElementsBaseVertex() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawElementsBaseVertexOES ] ---

    public static native void nglDrawElementsBaseVertexOES(int mode, int count, int type, long indices, int basevertex);

    public static void glDrawElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertexOES(mode, count, type, indices, basevertex);
    }

    public static void glDrawElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertexOES(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
    }

    public static void glDrawElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
    }

    public static void glDrawElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
    }

    public static void glDrawElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), basevertex);
    }

    // --- [ glDrawRangeElementsBaseVertexOES ] ---

    public static native void nglDrawRangeElementsBaseVertexOES(int mode, int start, int end, int count, int type, long indices, int basevertex);

    public static void glDrawRangeElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertexOES(mode, start, end, count, type, indices, basevertex);
    }

    public static void glDrawRangeElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertexOES(mode, start, end, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
    }

    public static void glDrawRangeElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertexOES(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
    }

    public static void glDrawRangeElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ShortBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertexOES(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
    }

    public static void glDrawRangeElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") IntBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertexOES(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), basevertex);
    }

    // --- [ glDrawElementsInstancedBaseVertexOES ] ---

    public static native void nglDrawElementsInstancedBaseVertexOES(int mode, int count, int type, long indices, int instancecount, int basevertex);

    public static void glDrawElementsInstancedBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertexOES(mode, count, type, indices, instancecount, basevertex);
    }

    public static void glDrawElementsInstancedBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertexOES(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), instancecount, basevertex);
    }

    public static void glDrawElementsInstancedBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), instancecount, basevertex);
    }

    public static void glDrawElementsInstancedBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), instancecount, basevertex);
    }

    public static void glDrawElementsInstancedBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), instancecount, basevertex);
    }

    // --- [ glMultiDrawElementsBaseVertexOES ] ---

    public static native void nglMultiDrawElementsBaseVertexOES(int mode, long count, int type, long indices, int drawcount, long basevertex);

    public static void glMultiDrawElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLsizei const *") IntBuffer count, @NativeType("GLenum") int type, @NativeType("void const * const *") PointerBuffer indices, @NativeType("GLint const *") IntBuffer basevertex) {
        if (CHECKS) {
            check(indices, count.remaining());
            check(basevertex, count.remaining());
        }
        nglMultiDrawElementsBaseVertexOES(mode, memAddress(count), type, memAddress(indices), count.remaining(), memAddress(basevertex));
    }

    /** Array version of: {@link #glMultiDrawElementsBaseVertexOES MultiDrawElementsBaseVertexOES} */
    public static void glMultiDrawElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLsizei const *") int[] count, @NativeType("GLenum") int type, @NativeType("void const * const *") PointerBuffer indices, @NativeType("GLint const *") int[] basevertex) {
        long __functionAddress = GLES.getICD().glMultiDrawElementsBaseVertexOES;
        if (CHECKS) {
            check(__functionAddress);
            check(indices, count.length);
            check(basevertex, count.length);
        }
        callPPPV(mode, count, type, memAddress(indices), count.length, basevertex, __functionAddress);
    }

}