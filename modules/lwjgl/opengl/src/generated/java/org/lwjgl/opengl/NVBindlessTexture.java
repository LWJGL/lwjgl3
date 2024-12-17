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

public class NVBindlessTexture {

    static { GL.initialize(); }

    protected NVBindlessTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetTextureHandleNV ] ---

    /** {@code GLuint64 glGetTextureHandleNV(GLuint texture)} */
    @NativeType("GLuint64")
    public static native long glGetTextureHandleNV(@NativeType("GLuint") int texture);

    // --- [ glGetTextureSamplerHandleNV ] ---

    /** {@code GLuint64 glGetTextureSamplerHandleNV(GLuint texture, GLuint sampler)} */
    @NativeType("GLuint64")
    public static native long glGetTextureSamplerHandleNV(@NativeType("GLuint") int texture, @NativeType("GLuint") int sampler);

    // --- [ glMakeTextureHandleResidentNV ] ---

    /** {@code void glMakeTextureHandleResidentNV(GLuint64 handle)} */
    public static native void glMakeTextureHandleResidentNV(@NativeType("GLuint64") long handle);

    // --- [ glMakeTextureHandleNonResidentNV ] ---

    /** {@code void glMakeTextureHandleNonResidentNV(GLuint64 handle)} */
    public static native void glMakeTextureHandleNonResidentNV(@NativeType("GLuint64") long handle);

    // --- [ glGetImageHandleNV ] ---

    /** {@code GLuint64 glGetImageHandleNV(GLuint texture, GLint level, GLboolean layered, GLint layer, GLenum format)} */
    @NativeType("GLuint64")
    public static native long glGetImageHandleNV(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLboolean") boolean layered, @NativeType("GLint") int layer, @NativeType("GLenum") int format);

    // --- [ glMakeImageHandleResidentNV ] ---

    /** {@code void glMakeImageHandleResidentNV(GLuint64 handle, GLenum access)} */
    public static native void glMakeImageHandleResidentNV(@NativeType("GLuint64") long handle, @NativeType("GLenum") int access);

    // --- [ glMakeImageHandleNonResidentNV ] ---

    /** {@code void glMakeImageHandleNonResidentNV(GLuint64 handle)} */
    public static native void glMakeImageHandleNonResidentNV(@NativeType("GLuint64") long handle);

    // --- [ glUniformHandleui64NV ] ---

    /** {@code void glUniformHandleui64NV(GLint location, GLuint64 value)} */
    public static native void glUniformHandleui64NV(@NativeType("GLint") int location, @NativeType("GLuint64") long value);

    // --- [ glUniformHandleui64vNV ] ---

    /** {@code void glUniformHandleui64vNV(GLint location, GLsizei count, GLuint64 const * values)} */
    public static native void nglUniformHandleui64vNV(int location, int count, long values);

    /** {@code void glUniformHandleui64vNV(GLint location, GLsizei count, GLuint64 const * values)} */
    public static void glUniformHandleui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer values) {
        nglUniformHandleui64vNV(location, values.remaining(), memAddress(values));
    }

    // --- [ glProgramUniformHandleui64NV ] ---

    /** {@code void glProgramUniformHandleui64NV(GLuint program, GLint location, GLuint64 value)} */
    public static native void glProgramUniformHandleui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64") long value);

    // --- [ glProgramUniformHandleui64vNV ] ---

    /** {@code void glProgramUniformHandleui64vNV(GLuint program, GLint location, GLsizei count, GLuint64 const * values)} */
    public static native void nglProgramUniformHandleui64vNV(int program, int location, int count, long values);

    /** {@code void glProgramUniformHandleui64vNV(GLuint program, GLint location, GLsizei count, GLuint64 const * values)} */
    public static void glProgramUniformHandleui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer values) {
        nglProgramUniformHandleui64vNV(program, location, values.remaining(), memAddress(values));
    }

    // --- [ glIsTextureHandleResidentNV ] ---

    /** {@code GLboolean glIsTextureHandleResidentNV(GLuint64 handle)} */
    @NativeType("GLboolean")
    public static native boolean glIsTextureHandleResidentNV(@NativeType("GLuint64") long handle);

    // --- [ glIsImageHandleResidentNV ] ---

    /** {@code GLboolean glIsImageHandleResidentNV(GLuint64 handle)} */
    @NativeType("GLboolean")
    public static native boolean glIsImageHandleResidentNV(@NativeType("GLuint64") long handle);

    /** {@code void glUniformHandleui64vNV(GLint location, GLsizei count, GLuint64 const * values)} */
    public static void glUniformHandleui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] values) {
        long __functionAddress = GL.getICD().glUniformHandleui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, values.length, values, __functionAddress);
    }

    /** {@code void glProgramUniformHandleui64vNV(GLuint program, GLint location, GLsizei count, GLuint64 const * values)} */
    public static void glProgramUniformHandleui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] values) {
        long __functionAddress = GL.getICD().glProgramUniformHandleui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, values.length, values, __functionAddress);
    }

}