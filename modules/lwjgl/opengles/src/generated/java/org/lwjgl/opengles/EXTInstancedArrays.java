/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_instanced_arrays.txt">EXT_instanced_arrays</a> extension.
 * 
 * <p>A common use case in GL for some applications is to be able to draw the same object, or groups of similar objects that share vertex data, primitive
 * count and type, multiple times. This extension provides a means of accelerating such use cases while reducing the number of API calls, and keeping the
 * amount of duplicate data to a minimum.</p>
 * 
 * <p>This extension introduces an array "divisor" for generic vertex array attributes, which when non-zero specifies that the attribute is "instanced." An
 * instanced attribute does not advance per-vertex as usual, but rather after every {@code divisor} conceptual draw calls.</p>
 * 
 * <p>(Attributes which aren't instanced are repeated in their entirety for every conceptual draw call.)</p>
 * 
 * <p>By specifying transform data in an instanced attribute or series of instanced attributes, vertex shaders can, in concert with the instancing draw
 * calls, draw multiple instances of an object with one draw call.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class EXTInstancedArrays {

    static { GLES.initialize(); }

    /** Accepted by the {@code pname} parameters of GetVertexAttribfv and GetVertexAttribiv. */
    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR_EXT = 0x88FE;

    protected EXTInstancedArrays() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawArraysInstancedEXT ] ---

    public static native void glDrawArraysInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLint") int start, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount);

    // --- [ glDrawElementsInstancedEXT ] ---

    public static native void nglDrawElementsInstancedEXT(int mode, int count, int type, long indices, int primcount);

    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedEXT(mode, count, type, indices, primcount);
    }

    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedEXT(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), primcount);
    }

    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), primcount);
    }

    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), primcount);
    }

    public static void glDrawElementsInstancedEXT(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), primcount);
    }

    // --- [ glVertexAttribDivisorEXT ] ---

    public static native void glVertexAttribDivisorEXT(@NativeType("GLuint") int index, @NativeType("GLuint") int divisor);

}