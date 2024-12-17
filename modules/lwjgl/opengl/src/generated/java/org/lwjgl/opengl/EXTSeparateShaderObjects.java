/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTSeparateShaderObjects {

    static { GL.initialize(); }

    public static final int GL_ACTIVE_PROGRAM_EXT = 0x8B8D;

    protected EXTSeparateShaderObjects() {
        throw new UnsupportedOperationException();
    }

    // --- [ glUseShaderProgramEXT ] ---

    /** {@code void glUseShaderProgramEXT(GLenum type, GLuint program)} */
    public static native void glUseShaderProgramEXT(@NativeType("GLenum") int type, @NativeType("GLuint") int program);

    // --- [ glActiveProgramEXT ] ---

    /** {@code void glActiveProgramEXT(GLuint program)} */
    public static native void glActiveProgramEXT(@NativeType("GLuint") int program);

    // --- [ glCreateShaderProgramEXT ] ---

    /** {@code GLuint glCreateShaderProgramEXT(GLenum type, GLchar const * string)} */
    public static native int nglCreateShaderProgramEXT(int type, long string);

    /** {@code GLuint glCreateShaderProgramEXT(GLenum type, GLchar const * string)} */
    @NativeType("GLuint")
    public static int glCreateShaderProgramEXT(@NativeType("GLenum") int type, @NativeType("GLchar const *") ByteBuffer string) {
        if (CHECKS) {
            checkNT1(string);
        }
        return nglCreateShaderProgramEXT(type, memAddress(string));
    }

    /** {@code GLuint glCreateShaderProgramEXT(GLenum type, GLchar const * string)} */
    @NativeType("GLuint")
    public static int glCreateShaderProgramEXT(@NativeType("GLenum") int type, @NativeType("GLchar const *") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(string, true);
            long stringEncoded = stack.getPointerAddress();
            return nglCreateShaderProgramEXT(type, stringEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}