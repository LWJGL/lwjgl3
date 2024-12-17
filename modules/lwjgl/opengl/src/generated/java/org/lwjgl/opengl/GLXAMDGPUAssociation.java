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

public class GLXAMDGPUAssociation {

    public static final int
        GLX_GPU_VENDOR_AMD                = 0x1F00,
        GLX_GPU_RENDERER_STRING_AMD       = 0x1F01,
        GLX_GPU_OPENGL_VERSION_STRING_AMD = 0x1F02,
        GLX_GPU_FASTEST_TARGET_GPUS_AMD   = 0x21A2,
        GLX_GPU_RAM_AMD                   = 0x21A3,
        GLX_GPU_CLOCK_AMD                 = 0x21A4,
        GLX_GPU_NUM_PIPES_AMD             = 0x21A5,
        GLX_GPU_NUM_SIMD_AMD              = 0x21A6,
        GLX_GPU_NUM_RB_AMD                = 0x21A7,
        GLX_GPU_NUM_SPI_AMD               = 0x21A8;

    protected GLXAMDGPUAssociation() {
        throw new UnsupportedOperationException();
    }

    // --- [ glXBlitContextFramebufferAMD ] ---

    /** {@code void glXBlitContextFramebufferAMD(GLXContext dstCtx, GLint srcX0, GLint srcY0, GLint srcX1, GLint srcY1, GLint dstX0, GLint dstY0, GLint dstX1, GLint dstY1, GLbitfield mask, GLenum filter)} */
    public static void glXBlitContextFramebufferAMD(@NativeType("GLXContext") long dstCtx, @NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXBlitContextFramebufferAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(dstCtx);
        }
        callPV(dstCtx, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, __functionAddress);
    }

    // --- [ glXCreateAssociatedContextAMD ] ---

    /** {@code GLXContext glXCreateAssociatedContextAMD(unsigned int id, GLXContext share_list)} */
    @NativeType("GLXContext")
    public static long glXCreateAssociatedContextAMD(@NativeType("unsigned int") int id, @NativeType("GLXContext") long share_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateAssociatedContextAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPP(id, share_list, __functionAddress);
    }

    // --- [ glXCreateAssociatedContextAttribsAMD ] ---

    /** {@code GLXContext glXCreateAssociatedContextAttribsAMD(unsigned int id, GLXContext share_list, int const * attribList)} */
    public static long nglXCreateAssociatedContextAttribsAMD(int id, long share_list, long attribList) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateAssociatedContextAttribsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPP(id, share_list, attribList, __functionAddress);
    }

    /** {@code GLXContext glXCreateAssociatedContextAttribsAMD(unsigned int id, GLXContext share_list, int const * attribList)} */
    @NativeType("GLXContext")
    public static long glXCreateAssociatedContextAttribsAMD(@NativeType("unsigned int") int id, @NativeType("GLXContext") long share_list, @NativeType("int const *") IntBuffer attribList) {
        if (CHECKS) {
            checkNT(attribList);
        }
        return nglXCreateAssociatedContextAttribsAMD(id, share_list, memAddress(attribList));
    }

    // --- [ glXDeleteAssociatedContextAMD ] ---

    /** {@code Bool glXDeleteAssociatedContextAMD(GLXContext ctx)} */
    @NativeType("Bool")
    public static boolean glXDeleteAssociatedContextAMD(@NativeType("GLXContext") long ctx) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXDeleteAssociatedContextAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(ctx);
        }
        return callPI(ctx, __functionAddress) != 0;
    }

    // --- [ glXGetContextGPUIDAMD ] ---

    /** {@code unsigned int glXGetContextGPUIDAMD(GLXContext ctx)} */
    @NativeType("unsigned int")
    public static int glXGetContextGPUIDAMD(@NativeType("GLXContext") long ctx) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetContextGPUIDAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ glXGetCurrentAssociatedContextAMD ] ---

    /** {@code GLXContext glXGetCurrentAssociatedContextAMD(void)} */
    @NativeType("GLXContext")
    public static long glXGetCurrentAssociatedContextAMD() {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetCurrentAssociatedContextAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

    // --- [ glXGetGPUIDsAMD ] ---

    /** {@code unsigned int glXGetGPUIDsAMD(unsigned int maxCount, unsigned int * ids)} */
    public static int nglXGetGPUIDsAMD(int maxCount, long ids) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetGPUIDsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(maxCount, ids, __functionAddress);
    }

    /** {@code unsigned int glXGetGPUIDsAMD(unsigned int maxCount, unsigned int * ids)} */
    @NativeType("unsigned int")
    public static int glXGetGPUIDsAMD(@NativeType("unsigned int *") @Nullable IntBuffer ids) {
        return nglXGetGPUIDsAMD(remainingSafe(ids), memAddressSafe(ids));
    }

    // --- [ glXGetGPUInfoAMD ] ---

    /** {@code int glXGetGPUInfoAMD(unsigned int id, int property, GLenum dataType, unsigned int size, void * data)} */
    public static int nglXGetGPUInfoAMD(int id, int property, int dataType, int size, long data) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetGPUInfoAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(id, property, dataType, size, data, __functionAddress);
    }

    /** {@code int glXGetGPUInfoAMD(unsigned int id, int property, GLenum dataType, unsigned int size, void * data)} */
    public static int glXGetGPUInfoAMD(@NativeType("unsigned int") int id, int property, @NativeType("GLenum") int dataType, @NativeType("void *") ByteBuffer data) {
        return nglXGetGPUInfoAMD(id, property, dataType, data.remaining(), memAddress(data));
    }

    // --- [ glXMakeAssociatedContextCurrentAMD ] ---

    /** {@code Bool glXMakeAssociatedContextCurrentAMD(GLXContext ctx)} */
    @NativeType("Bool")
    public static boolean glXMakeAssociatedContextCurrentAMD(@NativeType("GLXContext") long ctx) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXMakeAssociatedContextCurrentAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(ctx);
        }
        return callPI(ctx, __functionAddress) != 0;
    }

    /** {@code GLXContext glXCreateAssociatedContextAttribsAMD(unsigned int id, GLXContext share_list, int const * attribList)} */
    @NativeType("GLXContext")
    public static long glXCreateAssociatedContextAttribsAMD(@NativeType("unsigned int") int id, @NativeType("GLXContext") long share_list, @NativeType("int const *") int[] attribList) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateAssociatedContextAttribsAMD;
        if (CHECKS) {
            check(__functionAddress);
            checkNT(attribList);
        }
        return callPPP(id, share_list, attribList, __functionAddress);
    }

    /** {@code unsigned int glXGetGPUIDsAMD(unsigned int maxCount, unsigned int * ids)} */
    @NativeType("unsigned int")
    public static int glXGetGPUIDsAMD(@NativeType("unsigned int *") int @Nullable [] ids) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetGPUIDsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(lengthSafe(ids), ids, __functionAddress);
    }

}