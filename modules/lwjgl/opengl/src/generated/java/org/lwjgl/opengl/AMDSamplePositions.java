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

public class AMDSamplePositions {

    static { GL.initialize(); }

    public static final int GL_SUBSAMPLE_DISTANCE_AMD = 0x883F;

    protected AMDSamplePositions() {
        throw new UnsupportedOperationException();
    }

    // --- [ glSetMultisamplefvAMD ] ---

    /** {@code void glSetMultisamplefvAMD(GLenum pname, GLuint index, GLfloat const * val)} */
    public static native void nglSetMultisamplefvAMD(int pname, int index, long val);

    /** {@code void glSetMultisamplefvAMD(GLenum pname, GLuint index, GLfloat const * val)} */
    public static void glSetMultisamplefvAMD(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer val) {
        if (CHECKS) {
            check(val, 2);
        }
        nglSetMultisamplefvAMD(pname, index, memAddress(val));
    }

    /** {@code void glSetMultisamplefvAMD(GLenum pname, GLuint index, GLfloat const * val)} */
    public static void glSetMultisamplefvAMD(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] val) {
        long __functionAddress = GL.getICD().glSetMultisamplefvAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(val, 2);
        }
        callPV(pname, index, val, __functionAddress);
    }

}