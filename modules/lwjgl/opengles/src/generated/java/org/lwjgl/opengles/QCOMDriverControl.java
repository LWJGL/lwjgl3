/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class QCOMDriverControl {

    static { GLES.initialize(); }

    protected QCOMDriverControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetDriverControlsQCOM ] ---

    /** {@code void glGetDriverControlsQCOM(GLint * num, GLsizei size, GLuint * driverControls)} */
    public static native void nglGetDriverControlsQCOM(long num, int size, long driverControls);

    /** {@code void glGetDriverControlsQCOM(GLint * num, GLsizei size, GLuint * driverControls)} */
    public static void glGetDriverControlsQCOM(@NativeType("GLint *") @Nullable IntBuffer num, @NativeType("GLuint *") @Nullable IntBuffer driverControls) {
        if (CHECKS) {
            checkSafe(num, 1);
        }
        nglGetDriverControlsQCOM(memAddressSafe(num), remainingSafe(driverControls), memAddressSafe(driverControls));
    }

    // --- [ glGetDriverControlStringQCOM ] ---

    /** {@code void glGetDriverControlStringQCOM(GLuint driverControl, GLsizei bufSize, GLsizei * length, GLchar * driverControlString)} */
    public static native void nglGetDriverControlStringQCOM(int driverControl, int bufSize, long length, long driverControlString);

    /** {@code void glGetDriverControlStringQCOM(GLuint driverControl, GLsizei bufSize, GLsizei * length, GLchar * driverControlString)} */
    public static void glGetDriverControlStringQCOM(@NativeType("GLuint") int driverControl, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") @Nullable ByteBuffer driverControlString) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetDriverControlStringQCOM(driverControl, remainingSafe(driverControlString), memAddressSafe(length), memAddressSafe(driverControlString));
    }

    /** {@code void glGetDriverControlStringQCOM(GLuint driverControl, GLsizei bufSize, GLsizei * length, GLchar * driverControlString)} */
    @NativeType("void")
    public static String glGetDriverControlStringQCOM(@NativeType("GLuint") int driverControl, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer driverControlString = stack.malloc(bufSize);
            nglGetDriverControlStringQCOM(driverControl, bufSize, memAddress(length), memAddress(driverControlString));
            return memASCII(driverControlString, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glEnableDriverControlQCOM ] ---

    /** {@code void glEnableDriverControlQCOM(GLuint driverControl)} */
    public static native void glEnableDriverControlQCOM(@NativeType("GLuint") int driverControl);

    // --- [ glDisableDriverControlQCOM ] ---

    /** {@code void glDisableDriverControlQCOM(GLuint driverControl)} */
    public static native void glDisableDriverControlQCOM(@NativeType("GLuint") int driverControl);

    /** {@code void glGetDriverControlsQCOM(GLint * num, GLsizei size, GLuint * driverControls)} */
    public static void glGetDriverControlsQCOM(@NativeType("GLint *") int @Nullable [] num, @NativeType("GLuint *") int @Nullable [] driverControls) {
        long __functionAddress = GLES.getICD().glGetDriverControlsQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(num, 1);
        }
        callPPV(num, lengthSafe(driverControls), driverControls, __functionAddress);
    }

    /** {@code void glGetDriverControlStringQCOM(GLuint driverControl, GLsizei bufSize, GLsizei * length, GLchar * driverControlString)} */
    public static void glGetDriverControlStringQCOM(@NativeType("GLuint") int driverControl, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") @Nullable ByteBuffer driverControlString) {
        long __functionAddress = GLES.getICD().glGetDriverControlStringQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(driverControl, remainingSafe(driverControlString), length, memAddressSafe(driverControlString), __functionAddress);
    }

}