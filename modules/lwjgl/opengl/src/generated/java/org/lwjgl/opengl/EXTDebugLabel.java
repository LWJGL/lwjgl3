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

public class EXTDebugLabel {

    static { GL.initialize(); }

    public static final int
        GL_BUFFER_OBJECT_EXT           = 0x9151,
        GL_SHADER_OBJECT_EXT           = 0x8B48,
        GL_PROGRAM_OBJECT_EXT          = 0x8B40,
        GL_VERTEX_ARRAY_OBJECT_EXT     = 0x9154,
        GL_QUERY_OBJECT_EXT            = 0x9153,
        GL_PROGRAM_PIPELINE_OBJECT_EXT = 0x8A4F;

    protected EXTDebugLabel() {
        throw new UnsupportedOperationException();
    }

    // --- [ glLabelObjectEXT ] ---

    /** {@code void glLabelObjectEXT(GLenum type, GLuint object, GLsizei length, GLchar const * label)} */
    public static native void nglLabelObjectEXT(int type, int object, int length, long label);

    /** {@code void glLabelObjectEXT(GLenum type, GLuint object, GLsizei length, GLchar const * label)} */
    public static void glLabelObjectEXT(@NativeType("GLenum") int type, @NativeType("GLuint") int object, @NativeType("GLchar const *") ByteBuffer label) {
        nglLabelObjectEXT(type, object, label.remaining(), memAddress(label));
    }

    /** {@code void glLabelObjectEXT(GLenum type, GLuint object, GLsizei length, GLchar const * label)} */
    public static void glLabelObjectEXT(@NativeType("GLenum") int type, @NativeType("GLuint") int object, @NativeType("GLchar const *") CharSequence label) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int labelEncodedLength = stack.nUTF8(label, false);
            long labelEncoded = stack.getPointerAddress();
            nglLabelObjectEXT(type, object, labelEncodedLength, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetObjectLabelEXT ] ---

    /** {@code void glGetObjectLabelEXT(GLenum type, GLuint object, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static native void nglGetObjectLabelEXT(int type, int object, int bufSize, long length, long label);

    /** {@code void glGetObjectLabelEXT(GLenum type, GLuint object, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectLabelEXT(@NativeType("GLenum") int type, @NativeType("GLuint") int object, @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer label) {
        if (CHECKS) {
            check(length, 1);
        }
        nglGetObjectLabelEXT(type, object, label.remaining(), memAddress(length), memAddress(label));
    }

    /** {@code void glGetObjectLabelEXT(GLenum type, GLuint object, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectLabelEXT(@NativeType("GLenum") int type, @NativeType("GLuint") int object, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer label = stack.malloc(bufSize);
            nglGetObjectLabelEXT(type, object, bufSize, memAddress(length), memAddress(label));
            return memUTF8(label, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetObjectLabelEXT(GLenum type, GLuint object, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectLabelEXT(@NativeType("GLenum") int type, @NativeType("GLuint") int object, @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer label) {
        long __functionAddress = GL.getICD().glGetObjectLabelEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(length, 1);
        }
        callPPV(type, object, label.remaining(), length, memAddress(label), __functionAddress);
    }

}