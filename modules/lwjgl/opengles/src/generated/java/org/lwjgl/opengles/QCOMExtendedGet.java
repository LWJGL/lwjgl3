/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/QCOM/QCOM_extended_get.txt">QCOM_extended_get</a> extension.
 * This extension enables instrumenting the driver for debugging of OpenGL ES applications.
 */
public class QCOMExtendedGet {

    static { GLES.initialize(); }

    /** Accepted by the {@code pname} parameter of ExtGetTexLevelParameterivQCOM. */
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

    /** Accepted by the {@code pname} parameter of ExtTexObjectStateOverrideiQCOM. */
    public static final int GL_STATE_RESTORE = 0x8BDC;

    protected QCOMExtendedGet() {
        throw new UnsupportedOperationException();
    }

    // --- [ glExtGetTexturesQCOM ] ---

    public static native void nglExtGetTexturesQCOM(long textures, int maxTextures, long numTextures);

    public static void glExtGetTexturesQCOM(@Nullable @NativeType("GLuint *") IntBuffer textures, @Nullable @NativeType("GLint *") IntBuffer numTextures) {
        if (CHECKS) {
            checkSafe(numTextures, 1);
        }
        nglExtGetTexturesQCOM(memAddressSafe(textures), remainingSafe(textures), memAddressSafe(numTextures));
    }

    // --- [ glExtGetBuffersQCOM ] ---

    public static native void nglExtGetBuffersQCOM(long buffers, int maxBuffers, long numBuffers);

    public static void glExtGetBuffersQCOM(@Nullable @NativeType("GLuint *") IntBuffer buffers, @Nullable @NativeType("GLint *") IntBuffer numBuffers) {
        if (CHECKS) {
            checkSafe(numBuffers, 1);
        }
        nglExtGetBuffersQCOM(memAddressSafe(buffers), remainingSafe(buffers), memAddressSafe(numBuffers));
    }

    // --- [ glExtGetRenderbuffersQCOM ] ---

    public static native void nglExtGetRenderbuffersQCOM(long renderbuffers, int maxRenderbuffers, long numRenderbuffers);

    public static void glExtGetRenderbuffersQCOM(@Nullable @NativeType("GLuint *") IntBuffer renderbuffers, @Nullable @NativeType("GLint *") IntBuffer numRenderbuffers) {
        if (CHECKS) {
            checkSafe(numRenderbuffers, 1);
        }
        nglExtGetRenderbuffersQCOM(memAddressSafe(renderbuffers), remainingSafe(renderbuffers), memAddressSafe(numRenderbuffers));
    }

    // --- [ glExtGetFramebuffersQCOM ] ---

    public static native void nglExtGetFramebuffersQCOM(long framebuffers, int maxFramebuffers, long numFramebuffers);

    public static void glExtGetFramebuffersQCOM(@Nullable @NativeType("GLuint *") IntBuffer framebuffers, @Nullable @NativeType("GLint *") IntBuffer numFramebuffers) {
        if (CHECKS) {
            checkSafe(numFramebuffers, 1);
        }
        nglExtGetFramebuffersQCOM(memAddressSafe(framebuffers), remainingSafe(framebuffers), memAddressSafe(numFramebuffers));
    }

    // --- [ glExtGetTexLevelParameterivQCOM ] ---

    public static native void nglExtGetTexLevelParameterivQCOM(int texture, int face, int level, int pname, long params);

    public static void glExtGetTexLevelParameterivQCOM(@NativeType("GLuint") int texture, @NativeType("GLenum") int face, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglExtGetTexLevelParameterivQCOM(texture, face, level, pname, memAddress(params));
    }

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

    public static native void glExtTexObjectStateOverrideiQCOM(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glExtGetTexSubImageQCOM ] ---

    public static native void nglExtGetTexSubImageQCOM(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long texels);

    public static void glExtGetTexSubImageQCOM(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer texels) {
        nglExtGetTexSubImageQCOM(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(texels));
    }

    // --- [ glExtGetBufferPointervQCOM ] ---

    public static native void nglExtGetBufferPointervQCOM(int target, long params);

    public static void glExtGetBufferPointervQCOM(@NativeType("GLenum") int target, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglExtGetBufferPointervQCOM(target, memAddress(params));
    }

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

    /** Array version of: {@link #glExtGetTexturesQCOM ExtGetTexturesQCOM} */
    public static void glExtGetTexturesQCOM(@Nullable @NativeType("GLuint *") int[] textures, @Nullable @NativeType("GLint *") int[] numTextures) {
        long __functionAddress = GLES.getICD().glExtGetTexturesQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(numTextures, 1);
        }
        callPPV(textures, lengthSafe(textures), numTextures, __functionAddress);
    }

    /** Array version of: {@link #glExtGetBuffersQCOM ExtGetBuffersQCOM} */
    public static void glExtGetBuffersQCOM(@Nullable @NativeType("GLuint *") int[] buffers, @Nullable @NativeType("GLint *") int[] numBuffers) {
        long __functionAddress = GLES.getICD().glExtGetBuffersQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(numBuffers, 1);
        }
        callPPV(buffers, lengthSafe(buffers), numBuffers, __functionAddress);
    }

    /** Array version of: {@link #glExtGetRenderbuffersQCOM ExtGetRenderbuffersQCOM} */
    public static void glExtGetRenderbuffersQCOM(@Nullable @NativeType("GLuint *") int[] renderbuffers, @Nullable @NativeType("GLint *") int[] numRenderbuffers) {
        long __functionAddress = GLES.getICD().glExtGetRenderbuffersQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(numRenderbuffers, 1);
        }
        callPPV(renderbuffers, lengthSafe(renderbuffers), numRenderbuffers, __functionAddress);
    }

    /** Array version of: {@link #glExtGetFramebuffersQCOM ExtGetFramebuffersQCOM} */
    public static void glExtGetFramebuffersQCOM(@Nullable @NativeType("GLuint *") int[] framebuffers, @Nullable @NativeType("GLint *") int[] numFramebuffers) {
        long __functionAddress = GLES.getICD().glExtGetFramebuffersQCOM;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(numFramebuffers, 1);
        }
        callPPV(framebuffers, lengthSafe(framebuffers), numFramebuffers, __functionAddress);
    }

    /** Array version of: {@link #glExtGetTexLevelParameterivQCOM ExtGetTexLevelParameterivQCOM} */
    public static void glExtGetTexLevelParameterivQCOM(@NativeType("GLuint") int texture, @NativeType("GLenum") int face, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glExtGetTexLevelParameterivQCOM;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, face, level, pname, params, __functionAddress);
    }

}