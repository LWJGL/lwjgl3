/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTWindowRectangles {

    static { GL.initialize(); }

    public static final int
        GL_INCLUSIVE_EXT = 0x8F10,
        GL_EXCLUSIVE_EXT = 0x8F11;

    public static final int GL_WINDOW_RECTANGLE_EXT = 0x8F12;

    public static final int
        GL_WINDOW_RECTANGLE_MODE_EXT = 0x8F13,
        GL_MAX_WINDOW_RECTANGLES_EXT = 0x8F14,
        GL_NUM_WINDOW_RECTANGLES_EXT = 0x8F15;

    protected EXTWindowRectangles() {
        throw new UnsupportedOperationException();
    }

    // --- [ glWindowRectanglesEXT ] ---

    /** {@code void glWindowRectanglesEXT(GLenum mode, GLsizei count, GLint const * box)} */
    public static native void nglWindowRectanglesEXT(int mode, int count, long box);

    /** {@code void glWindowRectanglesEXT(GLenum mode, GLsizei count, GLint const * box)} */
    public static void glWindowRectanglesEXT(@NativeType("GLenum") int mode, @NativeType("GLint const *") @Nullable IntBuffer box) {
        nglWindowRectanglesEXT(mode, remainingSafe(box) >> 2, memAddressSafe(box));
    }

    /** {@code void glWindowRectanglesEXT(GLenum mode, GLsizei count, GLint const * box)} */
    public static void glWindowRectanglesEXT(@NativeType("GLenum") int mode, @NativeType("GLint const *") int @Nullable [] box) {
        long __functionAddress = GL.getICD().glWindowRectanglesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(mode, lengthSafe(box) >> 2, box, __functionAddress);
    }

}