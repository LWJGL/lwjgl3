/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class QCOMExtendedGet {

    static { GLES.initialize(); }

    public static final int
        GL_TEXTURE_WIDTH_QCOM           = 0x8BD2,
        GL_TEXTURE_HEIGHT_QCOM          = 0x8BD3,
        GL_TEXTURE_DEPTH_QCOM           = 0x8BD4,
        GL_TEXTURE_INTERNAL_FORMAT_QCOM = 0x8BD5,
        GL_TEXTURE_FORMAT_QCOM          = 0x8BD6,
        GL_TEXTURE_TYPE_QCOM            = 0x8BD7,
        GL_TEXTURE_IMAGE_VALID_QCOM     = 0x8BD8,
        GL_TEXTURE_NUM_LEVELS_QCOM      = 0x8BD9,
        GL_TEXTURE_TARGET_QCOM          = 0x8BDA,
        GL_TEXTURE_OBJECT_VALID_QCOM    = 0x8BDB;

    public static final int GL_STATE_RESTORE = 0x8BDC;

    protected QCOMExtendedGet() {
        throw new UnsupportedOperationException();
    }

    // --- [ glExtGetTexturesQCOM ] ---

    /** {@code void glExtGetTexturesQCOM(GLuint * textures, GLint maxTextures, GLint * numTextures)} */
    public static native void nglExtGetTexturesQCOM(long textures, int maxTextures, long numTextures);

    /** {@code void glExtGetTexturesQCOM(GLuint * textures, GLint maxTextures, GLint * numTextures)} */
    public static void glExtGetTexturesQCOM(@NativeType("GLuint *") @Nullable IntBuffer textures, @NativeType("GLint *") @Nullable IntBuffer numTextures) {
        if (CHECKS) {
            checkSafe(numTextures, 1);
        }
        nglExtGetTexturesQCOM(memAddressSafe(textures), remainingSafe(textures), memAddressSafe(numTextures));
    }

    // --- [ glExtGetBuffersQCOM ] ---

    /** {@code void glExtGetBuffersQCOM(GLuint * buffers, GLint maxBuffers, GLint * numBuffers)} */
    public static native void nglExtGetBuffersQCOM(long buffers, int maxBuffers, long numBuffers);

    /** {@code void glExtGetBuffersQCOM(GLuint * buffers, GLint maxBuffers, GLint * numBuffers)} */
    public static void glExtGetBuffersQCOM(@NativeType("GLuint *") @Nullable IntBuffer buffers, @NativeType("GLint *") @Nullable IntBuffer numBuffers) {
        if (CHECKS) {
            checkSafe(numBuffers, 1);
        }
        nglExtGetBuffersQCOM(memAddressSafe(buffers), remainingSafe(buffers), memAddressSafe(numBuffers));
    }

    // --- [ glExtGetRenderbuffersQCOM ] ---

    /** {@code void glExtGetRenderbuffersQCOM(GLuint * renderbuffers, GLint maxRenderbuffers, GLint * numRenderbuffers)} */
    public static native void nglExtGetRenderbuffersQCOM(long renderbuffers, int maxRenderbuffers, long numRenderbuffers);

    /** {@code void glExtGetRenderbuffersQCOM(GLuint * renderbuffers, GLint maxRenderbuffers, GLint * numRenderbuffers)} */
    public static void glExtGetRenderbuffersQCOM(@NativeType("GLuint *") @Nullable IntBuffer renderbuffers, @NativeType("GLint *") @Nullable IntBuffer numRenderbuffers) {
        if (CHECKS) {
            checkSafe(numRenderbuffers, 1);
        }
        nglExtGetRenderbuffersQCOM(memAddressSafe(renderbuffers), remainingSafe(renderbuffers), memAddressSafe(numRenderbuffers));
    }

    // --- [ glExtGetFramebuffersQCOM ] ---

    /** {@code void glExtGetFramebuffersQCOM(GLuint * framebuffers, GLint maxFramebuffers, GLint * numFramebuffers)} */
    public static native void nglExtGetFramebuffersQCOM(long framebuffers, int maxFramebuffers, long numFramebuffers);

    /** {@code void glExtGetFramebuffersQCOM(GLuint * framebuffers, GLint maxFramebuffers, GLint * numFramebuffers)} */
    public static void glExtGetFramebuffersQCOM(@NativeType("GLuint *") @Nullable IntBuffer framebuffers, @NativeType("GLint *") @Nullable IntBuffer numFramebuffers) {
        if (CHECKS) {
            checkSafe(numFramebuffers, 1);
        }
        nglExtGetFramebuffersQCOM(memAddressSafe(framebuffers), remainingSafe(framebuffers), memAddressSafe(numFramebuffers));
    }

    // --- [ glExtGetTexLevelParameterivQCOM ] ---

    /** {@code void glExtGetTexLevelParameterivQCOM(GLuint texture, GLenum face, GLint level, GLenum pname, GLint * params)} */
    public static native void nglExtGetTexLevelParameterivQCOM(int texture, int face, int level, int pname, long params);

    /** {@code void glExtGetTexLevelParameterivQCOM(GLuint texture, GLenum face, GLint level, GLenum pname, GLint * params)} */
    public static void glExtGetTexLevelParameterivQCOM(@NativeType("GLuint") int texture, @NativeType("GLenum") int face, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglExtGetTexLevelParameterivQCOM(texture, face, level, pname, memAddress(params));
    }

    /** {@code void glExtGetTexLevelParameterivQCOM(GLuint texture, GLenum face, GLint level, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glExtGetTexLevelParameteriQCOM(@NativeType("GLuint") int texture, @NativeType("GLenum") int face, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglExtGetTexLevelParameterivQCOM(texture, face, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glExtTexObjectStateOverrideiQCOM ] ---

    /** {@code void glExtTexObjectStateOverrideiQCOM(GLenum target, GLenum pname, GLint param)} */
    public static native void glExtTexObjectStateOverrideiQCOM(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glExtGetTexSubImageQCOM ] ---

    /** {@code void glExtGetTexSubImageQCOM(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void * texels)} */
    public static native void nglExtGetTexSubImageQCOM(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long texels);

    /** {@code void glExtGetTexSubImageQCOM(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void * texels)} */
    public static void glExtGetTexSubImageQCOM(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer texels) {
        nglExtGetTexSubImageQCOM(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(texels));
    }

    // --- [ glExtGetBufferPointervQCOM ] ---

    /** {@code void glExtGetBufferPointervQCOM(GLenum target, void ** params)} */
    public static native void nglExtGetBufferPointervQCOM(int target, long params);

    /** {@code void glExtGetBufferPointervQCOM(GLenum target, void ** params)} */
    public static void glExtGetBufferPointervQCOM(@NativeType("GLenum") int target, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglExtGetBufferPointervQCOM(target, memAddress(params));
    }

    /** {@code void glExtGetBufferPointervQCOM(GLenum target, void ** params)} */
    @NativeType("void")
    public static long glExtGetBufferPointerQCOM(@NativeType("GLenum") int target) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglExtGetBufferPointervQCOM(target, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glExtGetTexturesQCOM(GLuint * textures, GLint maxTextures, GLint * numTextures)} */
    public static void glExtGetTexturesQCOM(@NativeType("GLuint *") int @Nullable [] textures, @NativeType("GLint *") int @Nullable [] numTextures) {
        long __functionAddress = GLES.getICD().glExtGetTexturesQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(numTextures, 1);
        }
        callPPV(textures, lengthSafe(textures), numTextures, __functionAddress);
    }

    /** {@code void glExtGetBuffersQCOM(GLuint * buffers, GLint maxBuffers, GLint * numBuffers)} */
    public static void glExtGetBuffersQCOM(@NativeType("GLuint *") int @Nullable [] buffers, @NativeType("GLint *") int @Nullable [] numBuffers) {
        long __functionAddress = GLES.getICD().glExtGetBuffersQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(numBuffers, 1);
        }
        callPPV(buffers, lengthSafe(buffers), numBuffers, __functionAddress);
    }

    /** {@code void glExtGetRenderbuffersQCOM(GLuint * renderbuffers, GLint maxRenderbuffers, GLint * numRenderbuffers)} */
    public static void glExtGetRenderbuffersQCOM(@NativeType("GLuint *") int @Nullable [] renderbuffers, @NativeType("GLint *") int @Nullable [] numRenderbuffers) {
        long __functionAddress = GLES.getICD().glExtGetRenderbuffersQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(numRenderbuffers, 1);
        }
        callPPV(renderbuffers, lengthSafe(renderbuffers), numRenderbuffers, __functionAddress);
    }

    /** {@code void glExtGetFramebuffersQCOM(GLuint * framebuffers, GLint maxFramebuffers, GLint * numFramebuffers)} */
    public static void glExtGetFramebuffersQCOM(@NativeType("GLuint *") int @Nullable [] framebuffers, @NativeType("GLint *") int @Nullable [] numFramebuffers) {
        long __functionAddress = GLES.getICD().glExtGetFramebuffersQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(numFramebuffers, 1);
        }
        callPPV(framebuffers, lengthSafe(framebuffers), numFramebuffers, __functionAddress);
    }

    /** {@code void glExtGetTexLevelParameterivQCOM(GLuint texture, GLenum face, GLint level, GLenum pname, GLint * params)} */
    public static void glExtGetTexLevelParameterivQCOM(@NativeType("GLuint") int texture, @NativeType("GLenum") int face, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glExtGetTexLevelParameterivQCOM;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, face, level, pname, params, __functionAddress);
    }

}