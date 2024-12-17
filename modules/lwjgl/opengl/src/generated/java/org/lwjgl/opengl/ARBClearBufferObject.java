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

public class ARBClearBufferObject {

    static { GL.initialize(); }

    protected ARBClearBufferObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glClearBufferData ] ---

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void nglClearBufferData(int target, int internalformat, int format, int type, long data) {
        GL43C.nglClearBufferData(target, internalformat, format, type, data);
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    // --- [ glClearBufferSubData ] ---

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void nglClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, long data) {
        GL43C.nglClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    // --- [ glClearNamedBufferDataEXT ] ---

    /** {@code void glClearNamedBufferDataEXT(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static native void nglClearNamedBufferDataEXT(int buffer, int internalformat, int format, int type, long data);

    /** {@code void glClearNamedBufferDataEXT(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglClearNamedBufferDataEXT(buffer, internalformat, format, type, memAddressSafe(data));
    }

    /** {@code void glClearNamedBufferDataEXT(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        nglClearNamedBufferDataEXT(buffer, internalformat, format, type, memAddressSafe(data));
    }

    /** {@code void glClearNamedBufferDataEXT(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        nglClearNamedBufferDataEXT(buffer, internalformat, format, type, memAddressSafe(data));
    }

    /** {@code void glClearNamedBufferDataEXT(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        nglClearNamedBufferDataEXT(buffer, internalformat, format, type, memAddressSafe(data));
    }

    // --- [ glClearNamedBufferSubDataEXT ] ---

    /** {@code void glClearNamedBufferSubDataEXT(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static native void nglClearNamedBufferSubDataEXT(int buffer, int internalformat, long offset, long size, int format, int type, long data);

    /** {@code void glClearNamedBufferSubDataEXT(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglClearNamedBufferSubDataEXT(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
    }

    /** {@code void glClearNamedBufferSubDataEXT(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        nglClearNamedBufferSubDataEXT(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
    }

    /** {@code void glClearNamedBufferSubDataEXT(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        nglClearNamedBufferSubDataEXT(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
    }

    /** {@code void glClearNamedBufferSubDataEXT(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        nglClearNamedBufferSubDataEXT(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearNamedBufferDataEXT(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, internalformat, format, type, data, __functionAddress);
    }

    /** {@code void glClearNamedBufferDataEXT(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, internalformat, format, type, data, __functionAddress);
    }

    /** {@code void glClearNamedBufferDataEXT(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, internalformat, format, type, data, __functionAddress);
    }

    /** {@code void glClearNamedBufferSubDataEXT(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, internalformat, offset, size, format, type, data, __functionAddress);
    }

    /** {@code void glClearNamedBufferSubDataEXT(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, internalformat, offset, size, format, type, data, __functionAddress);
    }

    /** {@code void glClearNamedBufferSubDataEXT(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubDataEXT(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferSubDataEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, internalformat, offset, size, format, type, data, __functionAddress);
    }

}