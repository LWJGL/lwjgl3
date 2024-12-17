/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBBlendFuncExtended {

    static { GL.initialize(); }

    public static final int
        GL_SRC1_COLOR           = 0x88F9,
        GL_ONE_MINUS_SRC1_COLOR = 0x88FA,
        GL_ONE_MINUS_SRC1_ALPHA = 0x88FB;

    public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 0x88FC;

    protected ARBBlendFuncExtended() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindFragDataLocationIndexed ] ---

    /** {@code void glBindFragDataLocationIndexed(GLuint program, GLuint colorNumber, GLuint index, GLchar const * name)} */
    public static void nglBindFragDataLocationIndexed(int program, int colorNumber, int index, long name) {
        GL33C.nglBindFragDataLocationIndexed(program, colorNumber, index, name);
    }

    /** {@code void glBindFragDataLocationIndexed(GLuint program, GLuint colorNumber, GLuint index, GLchar const * name)} */
    public static void glBindFragDataLocationIndexed(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") ByteBuffer name) {
        GL33C.glBindFragDataLocationIndexed(program, colorNumber, index, name);
    }

    /** {@code void glBindFragDataLocationIndexed(GLuint program, GLuint colorNumber, GLuint index, GLchar const * name)} */
    public static void glBindFragDataLocationIndexed(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") CharSequence name) {
        GL33C.glBindFragDataLocationIndexed(program, colorNumber, index, name);
    }

    // --- [ glGetFragDataIndex ] ---

    /** {@code GLint glGetFragDataIndex(GLuint program, GLchar const * name)} */
    public static int nglGetFragDataIndex(int program, long name) {
        return GL33C.nglGetFragDataIndex(program, name);
    }

    /** {@code GLint glGetFragDataIndex(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetFragDataIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        return GL33C.glGetFragDataIndex(program, name);
    }

    /** {@code GLint glGetFragDataIndex(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetFragDataIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        return GL33C.glGetFragDataIndex(program, name);
    }

}