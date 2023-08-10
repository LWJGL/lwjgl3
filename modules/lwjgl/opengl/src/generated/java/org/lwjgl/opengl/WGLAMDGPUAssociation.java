/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/WGL_AMD_gpu_association.txt">WGL_AMD_gpu_association</a> extension.
 * 
 * <p>There currently is no way for applications to efficiently use GPU resources in systems that contain more than one GPU. Vendors have provided methods
 * that attempt to split the workload for an application among the available GPU resources. This has proven to be very inefficient because most
 * applications were never written with these sorts of optimizations in mind.</p>
 * 
 * <p>This extension provides a mechanism for applications to explicitly use the GPU resources on a given system individually. By providing this
 * functionality, a driver allows applications to make appropriate decisions regarding where and when to distribute rendering tasks.</p>
 * 
 * <p>Requires {@link WGLARBExtensionsString WGL_ARB_extensions_string} and {@link EXTFramebufferObject EXT_framebuffer_object}.</p>
 */
public class WGLAMDGPUAssociation {

    /** Accepted by the {@code property} parameter of {@link #wglGetGPUInfoAMD GetGPUInfoAMD}. */
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

    /**
     * Unsafe version of: {@link #wglGetGPUIDsAMD GetGPUIDsAMD}
     *
     * @param maxCount the max number of IDs that can be returned
     */
    public static int nwglGetGPUIDsAMD(int maxCount, long ids) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetGPUIDsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(maxCount, ids, __functionAddress);
    }

    /**
     * Returns the IDs for available GPUs.
     * 
     * <p>If the function succeeds, the return value is the number of total GPUs available. The value 0 is returned if no GPUs are available or if the call has
     * failed. The ID 0 is reserved and will not be retuned as a valid GPU ID. If the array {@code ids} is {@code NULL}, the function will only return the total
     * number of GPUs. {@code ids} will be tightly packed with no 0 values between valid ids.</p>
     *
     * @param ids the array of returned IDs
     */
    @NativeType("UINT")
    public static int wglGetGPUIDsAMD(@Nullable @NativeType("UINT *") IntBuffer ids) {
        return nwglGetGPUIDsAMD(remainingSafe(ids), memAddressSafe(ids));
    }

    // --- [ wglGetGPUInfoAMD ] ---

    /**
     * Unsafe version of: {@link #wglGetGPUInfoAMD GetGPUInfoAMD}
     *
     * @param size the size of the {@code data} buffer
     */
    public static int nwglGetGPUInfoAMD(int id, int property, int dataType, int size, long data) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetGPUInfoAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(id, property, dataType, size, data, __functionAddress);
    }

    /**
     * Each GPU in a system may have different properties, performance characteristics and different supported OpenGL versions. Use this function to determine
     * which GPU is best suited for a specific task.
     * 
     * <p>For a string, {@code size} will be the number of characters allocated and will include {@code NULL} termination. For arrays of type GL_UNSIGNED_INT, GL_INT,
     * and GL_FLOAT {@code size} will be the array depth. If the function succeeds, the number of values written will be returned. If the number of values
     * written is equal to {@code size}, the query should be repeated with a larger {@code data} buffer. Strings should be queried using the GL_UNSIGNED_BYTE
     * type, are UTF-8 encoded and will be {@code NULL} terminated. If the function fails, -1 will be returned.</p>
     *
     * @param id       a GPU id obtained from calling {@link #wglGetGPUIDsAMD GetGPUIDsAMD}
     * @param property the information being queried. One of:<br><table><tr><td>{@link #WGL_GPU_VENDOR_AMD GPU_VENDOR_AMD}</td><td>{@link #WGL_GPU_RENDERER_STRING_AMD GPU_RENDERER_STRING_AMD}</td><td>{@link #WGL_GPU_OPENGL_VERSION_STRING_AMD GPU_OPENGL_VERSION_STRING_AMD}</td><td>{@link #WGL_GPU_FASTEST_TARGET_GPUS_AMD GPU_FASTEST_TARGET_GPUS_AMD}</td></tr><tr><td>{@link #WGL_GPU_RAM_AMD GPU_RAM_AMD}</td><td>{@link #WGL_GPU_CLOCK_AMD GPU_CLOCK_AMD}</td><td>{@link #WGL_GPU_NUM_PIPES_AMD GPU_NUM_PIPES_AMD}</td><td>{@link #WGL_GPU_NUM_SIMD_AMD GPU_NUM_SIMD_AMD}</td></tr><tr><td>{@link #WGL_GPU_NUM_RB_AMD GPU_NUM_RB_AMD}</td><td>{@link #WGL_GPU_NUM_SPI_AMD GPU_NUM_SPI_AMD}</td></tr></table>
     * @param dataType the data type to be returned. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td></tr></table>
     * @param data     the buffer which will be filled with the requested information
     */
    public static int wglGetGPUInfoAMD(@NativeType("UINT") int id, int property, @NativeType("GLenum") int dataType, @NativeType("void *") ByteBuffer data) {
        return nwglGetGPUInfoAMD(id, property, dataType, data.remaining() >> GLChecks.typeToByteShift(dataType), memAddress(data));
    }

    /**
     * Each GPU in a system may have different properties, performance characteristics and different supported OpenGL versions. Use this function to determine
     * which GPU is best suited for a specific task.
     * 
     * <p>For a string, {@code size} will be the number of characters allocated and will include {@code NULL} termination. For arrays of type GL_UNSIGNED_INT, GL_INT,
     * and GL_FLOAT {@code size} will be the array depth. If the function succeeds, the number of values written will be returned. If the number of values
     * written is equal to {@code size}, the query should be repeated with a larger {@code data} buffer. Strings should be queried using the GL_UNSIGNED_BYTE
     * type, are UTF-8 encoded and will be {@code NULL} terminated. If the function fails, -1 will be returned.</p>
     *
     * @param id       a GPU id obtained from calling {@link #wglGetGPUIDsAMD GetGPUIDsAMD}
     * @param property the information being queried. One of:<br><table><tr><td>{@link #WGL_GPU_VENDOR_AMD GPU_VENDOR_AMD}</td><td>{@link #WGL_GPU_RENDERER_STRING_AMD GPU_RENDERER_STRING_AMD}</td><td>{@link #WGL_GPU_OPENGL_VERSION_STRING_AMD GPU_OPENGL_VERSION_STRING_AMD}</td><td>{@link #WGL_GPU_FASTEST_TARGET_GPUS_AMD GPU_FASTEST_TARGET_GPUS_AMD}</td></tr><tr><td>{@link #WGL_GPU_RAM_AMD GPU_RAM_AMD}</td><td>{@link #WGL_GPU_CLOCK_AMD GPU_CLOCK_AMD}</td><td>{@link #WGL_GPU_NUM_PIPES_AMD GPU_NUM_PIPES_AMD}</td><td>{@link #WGL_GPU_NUM_SIMD_AMD GPU_NUM_SIMD_AMD}</td></tr><tr><td>{@link #WGL_GPU_NUM_RB_AMD GPU_NUM_RB_AMD}</td><td>{@link #WGL_GPU_NUM_SPI_AMD GPU_NUM_SPI_AMD}</td></tr></table>
     * @param dataType the data type to be returned. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td></tr></table>
     * @param data     the buffer which will be filled with the requested information
     */
    public static int wglGetGPUInfoAMD(@NativeType("UINT") int id, int property, @NativeType("GLenum") int dataType, @NativeType("void *") IntBuffer data) {
        return nwglGetGPUInfoAMD(id, property, dataType, (int)(((long)data.remaining() << 2) >> GLChecks.typeToByteShift(dataType)), memAddress(data));
    }

    /**
     * Each GPU in a system may have different properties, performance characteristics and different supported OpenGL versions. Use this function to determine
     * which GPU is best suited for a specific task.
     * 
     * <p>For a string, {@code size} will be the number of characters allocated and will include {@code NULL} termination. For arrays of type GL_UNSIGNED_INT, GL_INT,
     * and GL_FLOAT {@code size} will be the array depth. If the function succeeds, the number of values written will be returned. If the number of values
     * written is equal to {@code size}, the query should be repeated with a larger {@code data} buffer. Strings should be queried using the GL_UNSIGNED_BYTE
     * type, are UTF-8 encoded and will be {@code NULL} terminated. If the function fails, -1 will be returned.</p>
     *
     * @param id       a GPU id obtained from calling {@link #wglGetGPUIDsAMD GetGPUIDsAMD}
     * @param property the information being queried. One of:<br><table><tr><td>{@link #WGL_GPU_VENDOR_AMD GPU_VENDOR_AMD}</td><td>{@link #WGL_GPU_RENDERER_STRING_AMD GPU_RENDERER_STRING_AMD}</td><td>{@link #WGL_GPU_OPENGL_VERSION_STRING_AMD GPU_OPENGL_VERSION_STRING_AMD}</td><td>{@link #WGL_GPU_FASTEST_TARGET_GPUS_AMD GPU_FASTEST_TARGET_GPUS_AMD}</td></tr><tr><td>{@link #WGL_GPU_RAM_AMD GPU_RAM_AMD}</td><td>{@link #WGL_GPU_CLOCK_AMD GPU_CLOCK_AMD}</td><td>{@link #WGL_GPU_NUM_PIPES_AMD GPU_NUM_PIPES_AMD}</td><td>{@link #WGL_GPU_NUM_SIMD_AMD GPU_NUM_SIMD_AMD}</td></tr><tr><td>{@link #WGL_GPU_NUM_RB_AMD GPU_NUM_RB_AMD}</td><td>{@link #WGL_GPU_NUM_SPI_AMD GPU_NUM_SPI_AMD}</td></tr></table>
     * @param dataType the data type to be returned. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td></tr></table>
     * @param data     the buffer which will be filled with the requested information
     */
    public static int wglGetGPUInfoAMD(@NativeType("UINT") int id, int property, @NativeType("GLenum") int dataType, @NativeType("void *") FloatBuffer data) {
        return nwglGetGPUInfoAMD(id, property, dataType, (int)(((long)data.remaining() << 2) >> GLChecks.typeToByteShift(dataType)), memAddress(data));
    }

    // --- [ wglGetContextGPUIDAMD ] ---

    /**
     * Determine which GPU a context is attached to.
     * 
     * <p>Unassociated contexts are created by calling {@link WGL#wglCreateContext CreateContext}. Although these contexts are unassociated, their use will still be tied to a single
     * GPU in most cases. For this reason it is advantageous to be able to query the GPU an existing unassociated context resides on. If multiple GPUs are
     * available, it would be undesirable to use one for rendering to visible surfaces and then chose the same one for off-screen rendering.</p>
     *
     * @param hglrc the context for which the GPU id will be returned
     */
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

    /**
     * Creates an associated context. Upon successful creation, no pixel format is tied to an associated context.
     *
     * @param id a valid GPU id
     */
    @NativeType("HGLRC")
    public static long wglCreateAssociatedContextAMD(@NativeType("UINT") int id) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreateAssociatedContextAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(id, __functionAddress);
    }

    // --- [ wglCreateAssociatedContextAttribsAMD ] ---

    /** Unsafe version of: {@link #wglCreateAssociatedContextAttribsAMD CreateAssociatedContextAttribsAMD} */
    public static long nwglCreateAssociatedContextAttribsAMD(int id, long shareContext, long attribList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreateAssociatedContextAttribsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPP(id, shareContext, attribList, __functionAddress);
    }

    /**
     * Create an associated context with a specific GL version.
     * 
     * <p>All capabilities and limitations of {@link WGLARBCreateContext#wglCreateContextAttribsARB CreateContextAttribsARB} apply to {@code CreateAssociatedContextAttribsAMD}.</p>
     *
     * @param id           a valid GPU id
     * @param shareContext must either be {@code NULL} or that of an associated context created with the same GPU ID as {@code id}
     * @param attribList   a 0-terminated list of attributes for the context
     */
    @NativeType("HGLRC")
    public static long wglCreateAssociatedContextAttribsAMD(@NativeType("UINT") int id, @NativeType("HGLRC") long shareContext, @Nullable @NativeType("int const *") IntBuffer attribList) {
        if (CHECKS) {
            checkNTSafe(attribList);
        }
        return nwglCreateAssociatedContextAttribsAMD(id, shareContext, memAddressSafe(attribList));
    }

    // --- [ wglDeleteAssociatedContextAMD ] ---

    /**
     * Deletes an associated context. An associated context cannot be deleted by calling {@link WGL#wglDeleteContext DeleteContext}.
     *
     * @param hglrc a valid associated context created by calling {@link #wglCreateAssociatedContextAMD CreateAssociatedContextAMD}
     */
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

    /**
     * Makes an associated context current in the current thread.
     *
     * @param hglrc a context handle created by calling {@link #wglCreateAssociatedContextAMD CreateAssociatedContextAMD}
     */
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

    /** Returns the current associated context in the current thread. */
    @NativeType("HGLRC")
    public static long wglGetCurrentAssociatedContextAMD() {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetCurrentAssociatedContextAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

    // --- [ wglBlitContextFramebufferAMD ] ---

    /**
     * Blits data from one context to another. This facilitates high performance data communication between multiple contexts.
     *
     * @param dstCtx the context handle for the write context
     * @param srcX0  the source x<sub>0</sub> coordinate
     * @param srcY0  the source Y<sub>0</sub> coordinate
     * @param srcX1  the source X<sub>1</sub> coordinate
     * @param srcY1  the source Y<sub>1</sub> coordinate
     * @param dstX0  the destination X<sub>0</sub> coordinate
     * @param dstY0  the destination Y<sub>0</sub> coordinate
     * @param dstX1  the destination X<sub>1</sub> coordinate
     * @param dstY1  the destination Y<sub>1</sub> coordinate
     * @param mask   the bitwise OR of a number of values indicating which buffers are to be copied. One or more of:<br><table><tr><td>{@link GL11#GL_COLOR_BUFFER_BIT COLOR_BUFFER_BIT}</td><td>{@link GL11#GL_DEPTH_BUFFER_BIT DEPTH_BUFFER_BIT}</td><td>{@link GL11#GL_STENCIL_BUFFER_BIT STENCIL_BUFFER_BIT}</td></tr></table>
     * @param filter the interpolation method to apply if the image is stretched. One of:<br><table><tr><td>{@link GL11#GL_LINEAR LINEAR}</td><td>{@link GL11#GL_NEAREST NEAREST}</td></tr></table>
     */
    @NativeType("VOID")
    public static void wglBlitContextFramebufferAMD(@NativeType("HGLRC") long dstCtx, @NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        long __functionAddress = GL.getCapabilitiesWGL().wglBlitContextFramebufferAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(dstCtx);
        }
        callPV(dstCtx, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, __functionAddress);
    }

    /** Array version of: {@link #wglGetGPUIDsAMD GetGPUIDsAMD} */
    @NativeType("UINT")
    public static int wglGetGPUIDsAMD(@Nullable @NativeType("UINT *") int[] ids) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetGPUIDsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(lengthSafe(ids), ids, __functionAddress);
    }

    /** Array version of: {@link #wglGetGPUInfoAMD GetGPUInfoAMD} */
    public static int wglGetGPUInfoAMD(@NativeType("UINT") int id, int property, @NativeType("GLenum") int dataType, @NativeType("void *") int[] data) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetGPUInfoAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(id, property, dataType, data.length, data, __functionAddress);
    }

    /** Array version of: {@link #wglGetGPUInfoAMD GetGPUInfoAMD} */
    public static int wglGetGPUInfoAMD(@NativeType("UINT") int id, int property, @NativeType("GLenum") int dataType, @NativeType("void *") float[] data) {
        long __functionAddress = GL.getCapabilitiesWGL().wglGetGPUInfoAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(id, property, dataType, data.length, data, __functionAddress);
    }

    /** Array version of: {@link #wglCreateAssociatedContextAttribsAMD CreateAssociatedContextAttribsAMD} */
    @NativeType("HGLRC")
    public static long wglCreateAssociatedContextAttribsAMD(@NativeType("UINT") int id, @NativeType("HGLRC") long shareContext, @Nullable @NativeType("int const *") int[] attribList) {
        long __functionAddress = GL.getCapabilitiesWGL().wglCreateAssociatedContextAttribsAMD;
        if (CHECKS) {
            check(__functionAddress);
            checkNTSafe(attribList);
        }
        return callPPP(id, shareContext, attribList, __functionAddress);
    }

}