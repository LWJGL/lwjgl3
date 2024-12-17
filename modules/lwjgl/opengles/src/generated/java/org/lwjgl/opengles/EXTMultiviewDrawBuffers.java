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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTMultiviewDrawBuffers {

    static { GLES.initialize(); }

    public static final int
        GL_COLOR_ATTACHMENT_EXT = 0x90F0,
        GL_MULTIVIEW_EXT        = 0x90F1;

    public static final int
        GL_DRAW_BUFFER_EXT = 0xC01,
        GL_READ_BUFFER_EXT = 0xC02;

    public static final int GL_MAX_MULTIVIEW_BUFFERS_EXT = 0x90F2;

    protected EXTMultiviewDrawBuffers() {
        throw new UnsupportedOperationException();
    }

    // --- [ glReadBufferIndexedEXT ] ---

    /** {@code void glReadBufferIndexedEXT(GLenum src, GLint index)} */
    public static native void glReadBufferIndexedEXT(@NativeType("GLenum") int src, @NativeType("GLint") int index);

    // --- [ glDrawBuffersIndexedEXT ] ---

    /** {@code void glDrawBuffersIndexedEXT(GLint n, GLenum const * location, GLint const * indices)} */
    public static native void nglDrawBuffersIndexedEXT(int n, long location, long indices);

    /** {@code void glDrawBuffersIndexedEXT(GLint n, GLenum const * location, GLint const * indices)} */
    public static void glDrawBuffersIndexedEXT(@NativeType("GLenum const *") IntBuffer location, @NativeType("GLint const *") IntBuffer indices) {
        if (CHECKS) {
            check(indices, location.remaining());
        }
        nglDrawBuffersIndexedEXT(location.remaining(), memAddress(location), memAddress(indices));
    }

    // --- [ glGetIntegeri_vEXT ] ---

    /** {@code void glGetIntegeri_vEXT(GLenum target, GLuint index, GLint * data)} */
    public static native void nglGetIntegeri_vEXT(int target, int index, long data);

    /** {@code void glGetIntegeri_vEXT(GLenum target, GLuint index, GLint * data)} */
    public static void glGetIntegeri_vEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetIntegeri_vEXT(target, index, memAddress(data));
    }

    /** {@code void glGetIntegeri_vEXT(GLenum target, GLuint index, GLint * data)} */
    @NativeType("void")
    public static int glGetIntegeriEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer data = stack.callocInt(1);
            nglGetIntegeri_vEXT(target, index, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glDrawBuffersIndexedEXT(GLint n, GLenum const * location, GLint const * indices)} */
    public static void glDrawBuffersIndexedEXT(@NativeType("GLenum const *") int[] location, @NativeType("GLint const *") int[] indices) {
        long __functionAddress = GLES.getICD().glDrawBuffersIndexedEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(indices, location.length);
        }
        callPPV(location.length, location, indices, __functionAddress);
    }

    /** {@code void glGetIntegeri_vEXT(GLenum target, GLuint index, GLint * data)} */
    public static void glGetIntegeri_vEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") int[] data) {
        long __functionAddress = GLES.getICD().glGetIntegeri_vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(target, index, data, __functionAddress);
    }

}