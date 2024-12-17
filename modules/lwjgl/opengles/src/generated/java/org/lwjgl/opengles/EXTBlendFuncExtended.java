/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTBlendFuncExtended {

    static { GLES.initialize(); }

    public static final int
        GL_SRC1_COLOR_EXT           = 0x88F9,
        GL_SRC1_ALPHA_EXT           = 0x8589,
        GL_ONE_MINUS_SRC1_COLOR_EXT = 0x88FA,
        GL_ONE_MINUS_SRC1_ALPHA_EXT = 0x88FB,
        GL_SRC_ALPHA_SATURATE_EXT   = 0x308;

    public static final int GL_LOCATION_INDEX_EXT = 0x930F;

    public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS_EXT = 0x88FC;

    protected EXTBlendFuncExtended() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindFragDataLocationIndexedEXT ] ---

    /** {@code void glBindFragDataLocationIndexedEXT(GLuint program, GLuint colorNumber, GLuint index, GLchar const * name)} */
    public static native void nglBindFragDataLocationIndexedEXT(int program, int colorNumber, int index, long name);

    /** {@code void glBindFragDataLocationIndexedEXT(GLuint program, GLuint colorNumber, GLuint index, GLchar const * name)} */
    public static void glBindFragDataLocationIndexedEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nglBindFragDataLocationIndexedEXT(program, colorNumber, index, memAddress(name));
    }

    /** {@code void glBindFragDataLocationIndexedEXT(GLuint program, GLuint colorNumber, GLuint index, GLchar const * name)} */
    public static void glBindFragDataLocationIndexedEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglBindFragDataLocationIndexedEXT(program, colorNumber, index, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetFragDataIndexEXT ] ---

    /** {@code GLint glGetFragDataIndexEXT(GLuint program, GLchar const * name)} */
    public static native int nglGetFragDataIndexEXT(int program, long name);

    /** {@code GLint glGetFragDataIndexEXT(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetFragDataIndexEXT(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetFragDataIndexEXT(program, memAddress(name));
    }

    /** {@code GLint glGetFragDataIndexEXT(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetFragDataIndexEXT(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetFragDataIndexEXT(program, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glBindFragDataLocationEXT ] ---

    /** {@code void glBindFragDataLocationEXT(GLuint program, GLuint colorNumber, GLchar const * name)} */
    public static native void nglBindFragDataLocationEXT(int program, int colorNumber, long name);

    /** {@code void glBindFragDataLocationEXT(GLuint program, GLuint colorNumber, GLchar const * name)} */
    public static void glBindFragDataLocationEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nglBindFragDataLocationEXT(program, colorNumber, memAddress(name));
    }

    /** {@code void glBindFragDataLocationEXT(GLuint program, GLuint colorNumber, GLchar const * name)} */
    public static void glBindFragDataLocationEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglBindFragDataLocationEXT(program, colorNumber, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramResourceLocationIndexEXT ] ---

    /** {@code GLint glGetProgramResourceLocationIndexEXT(GLuint program, GLenum programInterface, GLchar const * name)} */
    public static native int nglGetProgramResourceLocationIndexEXT(int program, int programInterface, long name);

    /** {@code GLint glGetProgramResourceLocationIndexEXT(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetProgramResourceLocationIndexEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetProgramResourceLocationIndexEXT(program, programInterface, memAddress(name));
    }

    /** {@code GLint glGetProgramResourceLocationIndexEXT(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetProgramResourceLocationIndexEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetProgramResourceLocationIndexEXT(program, programInterface, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}