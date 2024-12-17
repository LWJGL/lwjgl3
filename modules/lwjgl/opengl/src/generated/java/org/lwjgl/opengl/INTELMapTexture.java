/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class INTELMapTexture {

    static { GL.initialize(); }

    public static final int GL_TEXTURE_MEMORY_LAYOUT_INTEL = 0x83FF;

    public static final int
        GL_LAYOUT_DEFAULT_INTEL           = 0,
        GL_LAYOUT_LINEAR_INTEL            = 1,
        GL_LAYOUT_LINEAR_CPU_CACHED_INTEL = 2;

    protected INTELMapTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glSyncTextureINTEL ] ---

    /** {@code void glSyncTextureINTEL(GLuint texture)} */
    public static native void glSyncTextureINTEL(@NativeType("GLuint") int texture);

    // --- [ glUnmapTexture2DINTEL ] ---

    /** {@code void glUnmapTexture2DINTEL(GLuint texture, GLint level)} */
    public static native void glUnmapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glMapTexture2DINTEL ] ---

    /** {@code void * glMapTexture2DINTEL(GLuint texture, GLint level, GLbitfield access, GLint * stride, GLenum * layout)} */
    public static native long nglMapTexture2DINTEL(int texture, int level, int access, long stride, long layout);

    /** {@code void * glMapTexture2DINTEL(GLuint texture, GLint level, GLbitfield access, GLint * stride, GLenum * layout)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") IntBuffer stride, @NativeType("GLenum *") IntBuffer layout) {
        if (CHECKS) {
            check(stride, 1);
            check(layout, 1);
        }
        long __result = nglMapTexture2DINTEL(texture, level, access, memAddress(stride), memAddress(layout));
        return memByteBufferSafe(__result, getStride(stride) * GLChecks.getTexLevelParameteri(texture, GL11.GL_TEXTURE_2D, level, GL11.GL_TEXTURE_HEIGHT));
    }

    /** {@code void * glMapTexture2DINTEL(GLuint texture, GLint level, GLbitfield access, GLint * stride, GLenum * layout)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") IntBuffer stride, @NativeType("GLenum *") IntBuffer layout, @Nullable ByteBuffer old_buffer) {
        if (CHECKS) {
            check(stride, 1);
            check(layout, 1);
        }
        long __result = nglMapTexture2DINTEL(texture, level, access, memAddress(stride), memAddress(layout));
        int length = getStride(stride) * GLChecks.getTexLevelParameteri(texture, GL11.GL_TEXTURE_2D, level, GL11.GL_TEXTURE_HEIGHT);
        return apiGetMappedBuffer(old_buffer, __result, length);
    }

    /** {@code void * glMapTexture2DINTEL(GLuint texture, GLint level, GLbitfield access, GLint * stride, GLenum * layout)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") IntBuffer stride, @NativeType("GLenum *") IntBuffer layout, long length, @Nullable ByteBuffer old_buffer) {
        if (CHECKS) {
            check(stride, 1);
            check(layout, 1);
        }
        long __result = nglMapTexture2DINTEL(texture, level, access, memAddress(stride), memAddress(layout));
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    /** {@code void * glMapTexture2DINTEL(GLuint texture, GLint level, GLbitfield access, GLint * stride, GLenum * layout)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") int[] stride, @NativeType("GLenum *") int[] layout) {
        long __functionAddress = GL.getICD().glMapTexture2DINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(stride, 1);
            check(layout, 1);
        }
        long __result = callPPP(texture, level, access, stride, layout, __functionAddress);
        return memByteBufferSafe(__result, getStride(stride) * GLChecks.getTexLevelParameteri(texture, GL11.GL_TEXTURE_2D, level, GL11.GL_TEXTURE_HEIGHT));
    }

    /** {@code void * glMapTexture2DINTEL(GLuint texture, GLint level, GLbitfield access, GLint * stride, GLenum * layout)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") int[] stride, @NativeType("GLenum *") int[] layout, @Nullable ByteBuffer old_buffer) {
        long __functionAddress = GL.getICD().glMapTexture2DINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(stride, 1);
            check(layout, 1);
        }
        long __result = callPPP(texture, level, access, stride, layout, __functionAddress);
        int length = getStride(stride) * GLChecks.getTexLevelParameteri(texture, GL11.GL_TEXTURE_2D, level, GL11.GL_TEXTURE_HEIGHT);
        return apiGetMappedBuffer(old_buffer, __result, length);
    }

    /** {@code void * glMapTexture2DINTEL(GLuint texture, GLint level, GLbitfield access, GLint * stride, GLenum * layout)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") int[] stride, @NativeType("GLenum *") int[] layout, long length, @Nullable ByteBuffer old_buffer) {
        long __functionAddress = GL.getICD().glMapTexture2DINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(stride, 1);
            check(layout, 1);
        }
        long __result = callPPP(texture, level, access, stride, layout, __functionAddress);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    private static int getStride(IntBuffer stride) {
        return stride.get(stride.position());
    }

    private static int getStride(int[] stride) {
        return stride[0];
    }

}