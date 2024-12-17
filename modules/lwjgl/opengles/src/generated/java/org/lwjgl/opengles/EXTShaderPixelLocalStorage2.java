/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTShaderPixelLocalStorage2 {

    static { GLES.initialize(); }

    public static final int
        GL_MAX_SHADER_COMBINED_LOCAL_STORAGE_FAST_SIZE_EXT = 0x9650,
        GL_MAX_SHADER_COMBINED_LOCAL_STORAGE_SIZE_EXT      = 0x9651;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_INSUFFICIENT_SHADER_COMBINED_LOCAL_STORAGE_EXT = 0x9652;

    protected EXTShaderPixelLocalStorage2() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferPixelLocalStorageSizeEXT ] ---

    /** {@code void glFramebufferPixelLocalStorageSizeEXT(GLuint target, GLsizei size)} */
    public static native void glFramebufferPixelLocalStorageSizeEXT(@NativeType("GLuint") int target, @NativeType("GLsizei") int size);

    // --- [ glGetFramebufferPixelLocalStorageSizeEXT ] ---

    /** {@code GLsizei glGetFramebufferPixelLocalStorageSizeEXT(GLuint target)} */
    @NativeType("GLsizei")
    public static native int glGetFramebufferPixelLocalStorageSizeEXT(@NativeType("GLuint") int target);

    // --- [ glClearPixelLocalStorageuiEXT ] ---

    /** {@code void glClearPixelLocalStorageuiEXT(GLsizei offset, GLsizei n, GLuint const * values)} */
    public static native void nglClearPixelLocalStorageuiEXT(int offset, int n, long values);

    /** {@code void glClearPixelLocalStorageuiEXT(GLsizei offset, GLsizei n, GLuint const * values)} */
    public static void glClearPixelLocalStorageuiEXT(@NativeType("GLsizei") int offset, @NativeType("GLuint const *") IntBuffer values) {
        nglClearPixelLocalStorageuiEXT(offset, values.remaining(), memAddress(values));
    }

    /** {@code void glClearPixelLocalStorageuiEXT(GLsizei offset, GLsizei n, GLuint const * values)} */
    public static void glClearPixelLocalStorageuiEXT(@NativeType("GLsizei") int offset, @NativeType("GLuint const *") int[] values) {
        long __functionAddress = GLES.getICD().glClearPixelLocalStorageuiEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(offset, values.length, values, __functionAddress);
    }

}