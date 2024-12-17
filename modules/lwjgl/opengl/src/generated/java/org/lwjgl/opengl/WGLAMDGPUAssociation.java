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

public class WGLAMDGPUAssociation {

    public static final int
        WGL_GPU_VENDOR_AMD                = 0x1F00,
        WGL_GPU_RENDERER_STRING_AMD       = 0x1F01,
        WGL_GPU_OPENGL_VERSION_STRING_AMD = 0x1F02,
        WGL_GPU_FASTEST_TARGET_GPUS_AMD   = 0x21A2,
        WGL_GPU_RAM_AMD                   = 0x21A3,
        WGL_GPU_CLOCK_AMD                 = 0x21A4,
        WGL_GPU_NUM_PIPES_AMD             = 0x21A5,
        WGL_GPU_NUM_SIMD_AMD              = 0x21A6,
        WGL_GPU_NUM_RB_AMD                = 0x21A7,
        WGL_GPU_NUM_SPI_AMD               = 0x21A8;

    protected WGLAMDGPUAssociation() {
        throw new UnsupportedOperationException();
    }

    // --- [ wglGetGPUIDsAMD ] ---

    /** {@code UINT wglGetGPUIDsAMD(UINT maxCount, UINT * ids)} */
    public static int nwglGetGPUIDsAMD(int maxCount, long ids) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetGPUIDsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(maxCount, ids, __functionAddress);
    }

    /** {@code UINT wglGetGPUIDsAMD(UINT maxCount, UINT * ids)} */
    @NativeType("UINT")
    public static int wglGetGPUIDsAMD(@NativeType("UINT *") @Nullable IntBuffer ids) {
        return nwglGetGPUIDsAMD(remainingSafe(ids), memAddressSafe(ids));
    }

    // --- [ wglGetGPUInfoAMD ] ---

    /** {@code int wglGetGPUInfoAMD(UINT id, int property, GLenum dataType, UINT size, void * data)} */
    public static int nwglGetGPUInfoAMD(int id, int property, int dataType, int size, long data) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetGPUInfoAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(id, property, dataType, size, data, __functionAddress);
    }

    /** {@code int wglGetGPUInfoAMD(UINT id, int property, GLenum dataType, UINT size, void * data)} */
    public static int wglGetGPUInfoAMD(@NativeType("UINT") int id, int property, @NativeType("GLenum") int dataType, @NativeType("void *") ByteBuffer data) {
        return nwglGetGPUInfoAMD(id, property, dataType, data.remaining() >> GLChecks.typeToByteShift(dataType), memAddress(data));
    }

    /** {@code int wglGetGPUInfoAMD(UINT id, int property, GLenum dataType, UINT size, void * data)} */
    public static int wglGetGPUInfoAMD(@NativeType("UINT") int id, int property, @NativeType("GLenum") int dataType, @NativeType("void *") IntBuffer data) {
        return nwglGetGPUInfoAMD(id, property, dataType, (int)(((long)data.remaining() << 2) >> GLChecks.typeToByteShift(dataType)), memAddress(data));
    }

    /** {@code int wglGetGPUInfoAMD(UINT id, int property, GLenum dataType, UINT size, void * data)} */
    public static int wglGetGPUInfoAMD(@NativeType("UINT") int id, int property, @NativeType("GLenum") int dataType, @NativeType("void *") FloatBuffer data) {
        return nwglGetGPUInfoAMD(id, property, dataType, (int)(((long)data.remaining() << 2) >> GLChecks.typeToByteShift(dataType)), memAddress(data));
    }

    // --- [ wglGetContextGPUIDAMD ] ---

    /** {@code UINT wglGetContextGPUIDAMD(HGLRC hglrc)} */
    @NativeType("UINT")
    public static int wglGetContextGPUIDAMD(@NativeType("HGLRC") long hglrc) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetContextGPUIDAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(hglrc);
        }
        return callPI(hglrc, __functionAddress);
    }

    // --- [ wglCreateAssociatedContextAMD ] ---

    /** {@code HGLRC wglCreateAssociatedContextAMD(UINT id)} */
    @NativeType("HGLRC")
    public static long wglCreateAssociatedContextAMD(@NativeType("UINT") int id) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreateAssociatedContextAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(id, __functionAddress);
    }

    // --- [ wglCreateAssociatedContextAttribsAMD ] ---

    /** {@code HGLRC wglCreateAssociatedContextAttribsAMD(UINT id, HGLRC shareContext, int const * attribList)} */
    public static long nwglCreateAssociatedContextAttribsAMD(int id, long shareContext, long attribList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreateAssociatedContextAttribsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPP(id, shareContext, attribList, __functionAddress);
    }

    /** {@code HGLRC wglCreateAssociatedContextAttribsAMD(UINT id, HGLRC shareContext, int const * attribList)} */
    @NativeType("HGLRC")
    public static long wglCreateAssociatedContextAttribsAMD(@NativeType("UINT") int id, @NativeType("HGLRC") long shareContext, @NativeType("int const *") @Nullable IntBuffer attribList) {
        if (CHECKS) {
            checkNTSafe(attribList);
        }
        return nwglCreateAssociatedContextAttribsAMD(id, shareContext, memAddressSafe(attribList));
    }

    // --- [ wglDeleteAssociatedContextAMD ] ---

    /** {@code BOOL wglDeleteAssociatedContextAMD(HGLRC hglrc)} */
    @NativeType("BOOL")
    public static boolean wglDeleteAssociatedContextAMD(@NativeType("HGLRC") long hglrc) {
        long __functionAddress = GL.getCapabilitiesWGL().wglDeleteAssociatedContextAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(hglrc);
        }
        return callPI(hglrc, __functionAddress) != 0;
    }

    // --- [ wglMakeAssociatedContextCurrentAMD ] ---

    /** {@code BOOL wglMakeAssociatedContextCurrentAMD(HGLRC hglrc)} */
    @NativeType("BOOL")
    public static boolean wglMakeAssociatedContextCurrentAMD(@NativeType("HGLRC") long hglrc) {
        long __functionAddress = GL.getCapabilitiesWGL().wglMakeAssociatedContextCurrentAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(hglrc);
        }
        return callPI(hglrc, __functionAddress) != 0;
    }

    // --- [ wglGetCurrentAssociatedContextAMD ] ---

    /** {@code HGLRC wglGetCurrentAssociatedContextAMD(void)} */
    @NativeType("HGLRC")
    public static long wglGetCurrentAssociatedContextAMD() {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetCurrentAssociatedContextAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

    // --- [ wglBlitContextFramebufferAMD ] ---

    /** {@code VOID wglBlitContextFramebufferAMD(HGLRC dstCtx, GLint srcX0, GLint srcY0, GLint srcX1, GLint srcY1, GLint dstX0, GLint dstY0, GLint dstX1, GLint dstY1, GLbitfield mask, GLenum filter)} */
    @NativeType("VOID")
    public static void wglBlitContextFramebufferAMD(@NativeType("HGLRC") long dstCtx, @NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        long __functionAddress = GL.getCapabilitiesWGL().wglBlitContextFramebufferAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(dstCtx);
        }
        callPV(dstCtx, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, __functionAddress);
    }

    /** {@code UINT wglGetGPUIDsAMD(UINT maxCount, UINT * ids)} */
    @NativeType("UINT")
    public static int wglGetGPUIDsAMD(@NativeType("UINT *") int @Nullable [] ids) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetGPUIDsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(lengthSafe(ids), ids, __functionAddress);
    }

    /** {@code int wglGetGPUInfoAMD(UINT id, int property, GLenum dataType, UINT size, void * data)} */
    public static int wglGetGPUInfoAMD(@NativeType("UINT") int id, int property, @NativeType("GLenum") int dataType, @NativeType("void *") int[] data) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetGPUInfoAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(id, property, dataType, data.length, data, __functionAddress);
    }

    /** {@code int wglGetGPUInfoAMD(UINT id, int property, GLenum dataType, UINT size, void * data)} */
    public static int wglGetGPUInfoAMD(@NativeType("UINT") int id, int property, @NativeType("GLenum") int dataType, @NativeType("void *") float[] data) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetGPUInfoAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(id, property, dataType, data.length, data, __functionAddress);
    }

    /** {@code HGLRC wglCreateAssociatedContextAttribsAMD(UINT id, HGLRC shareContext, int const * attribList)} */
    @NativeType("HGLRC")
    public static long wglCreateAssociatedContextAttribsAMD(@NativeType("UINT") int id, @NativeType("HGLRC") long shareContext, @NativeType("int const *") int @Nullable [] attribList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreateAssociatedContextAttribsAMD;
        if (CHECKS) {
            check(__functionAddress);
            checkNTSafe(attribList);
        }
        return callPPP(id, shareContext, attribList, __functionAddress);
    }

}