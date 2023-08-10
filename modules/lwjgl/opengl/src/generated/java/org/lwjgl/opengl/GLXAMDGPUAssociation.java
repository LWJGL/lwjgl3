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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/GLX_AMD_gpu_association.txt">GLX_AMD_gpu_association</a> extension.
 * 
 * <p>There currently is no way for applications to efficiently use GPU resources in systems that contain more than one GPU. Vendors have provided methods
 * that attempt to split the workload for an application among the available GPU resources. This has proven to be very inefficient because most
 * applications were never written with these sorts of optimizations in mind.</p>
 * 
 * <p>This extension provides a mechanism for applications to explicitly use the GPU resources on a given system individually. By providing this
 * functionality, a driver allows applications to make appropriate decisions regarding where and when to distribute rendering tasks.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5}, {@link GLX13 GLX 1.3}, {@link EXTFramebufferObject EXT_framebuffer_object} and {@link GLXARBGetProcAddress GLX_ARB_get_proc_address}.</p>
 */
public class GLXAMDGPUAssociation {

    /** Accepted by the {@code property} parameter of {@link #glXGetGPUInfoAMD GetGPUInfoAMD}. */
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

    public static void glXBlitContextFramebufferAMD(@NativeType("GLXContext") long dstCtx, @NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXBlitContextFramebufferAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(dstCtx);
        }
        callPV(dstCtx, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter, __functionAddress);
    }

    // --- [ glXCreateAssociatedContextAMD ] ---

    /** Creates an associated context. */
    @NativeType("GLXContext")
    public static long glXCreateAssociatedContextAMD(@NativeType("unsigned int") int id, @NativeType("GLXContext") long share_list) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateAssociatedContextAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(share_list);
        }
        return callPP(id, share_list, __functionAddress);
    }

    // --- [ glXCreateAssociatedContextAttribsAMD ] ---

    /** Unsafe version of: {@link #glXCreateAssociatedContextAttribsAMD CreateAssociatedContextAttribsAMD} */
    public static long nglXCreateAssociatedContextAttribsAMD(int id, long share_context, long attribList) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateAssociatedContextAttribsAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(share_context);
        }
        return callPPP(id, share_context, attribList, __functionAddress);
    }

    /** Creates an associated context and requests a specific GL version. */
    @NativeType("GLXContext")
    public static long glXCreateAssociatedContextAttribsAMD(@NativeType("unsigned int") int id, @NativeType("GLXContext") long share_context, @NativeType("int const *") IntBuffer attribList) {
        if (CHECKS) {
            checkNT(attribList);
        }
        return nglXCreateAssociatedContextAttribsAMD(id, share_context, memAddress(attribList));
    }

    // --- [ glXDeleteAssociatedContextAMD ] ---

    /**
     * Deletes an associated context.
     *
     * @param ctx the GLXContext
     */
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

    /**
     * Determines which GPU a context is attached to.
     *
     * @param ctx the GLXContext
     */
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

    /** Queries the crrent associated context. */
    @NativeType("GLXContext")
    public static long glXGetCurrentAssociatedContextAMD() {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetCurrentAssociatedContextAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callP(__functionAddress);
    }

    // --- [ glXGetGPUIDsAMD ] ---

    /** Queries the IDs for available GPUs. */
    @NativeType("unsigned int")
    public static int glXGetGPUIDsAMD(@NativeType("unsigned int") int maxCount, @NativeType("unsigned int") int ids) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetGPUIDsAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callI(maxCount, ids, __functionAddress);
    }

    // --- [ glXGetGPUInfoAMD ] ---

    /** Unsafe version of: {@link #glXGetGPUInfoAMD GetGPUInfoAMD} */
    public static int nglXGetGPUInfoAMD(int id, int property, int dataType, int size, long data) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXGetGPUInfoAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(id, property, dataType, size, data, __functionAddress);
    }

    /**
     * Queries GPU properties.
     *
     * @param property one of:<br><table><tr><td>{@link #GLX_GPU_VENDOR_AMD GPU_VENDOR_AMD}</td><td>{@link #GLX_GPU_RENDERER_STRING_AMD GPU_RENDERER_STRING_AMD}</td><td>{@link #GLX_GPU_OPENGL_VERSION_STRING_AMD GPU_OPENGL_VERSION_STRING_AMD}</td><td>{@link #GLX_GPU_FASTEST_TARGET_GPUS_AMD GPU_FASTEST_TARGET_GPUS_AMD}</td></tr><tr><td>{@link #GLX_GPU_RAM_AMD GPU_RAM_AMD}</td><td>{@link #GLX_GPU_CLOCK_AMD GPU_CLOCK_AMD}</td><td>{@link #GLX_GPU_NUM_PIPES_AMD GPU_NUM_PIPES_AMD}</td><td>{@link #GLX_GPU_NUM_SIMD_AMD GPU_NUM_SIMD_AMD}</td></tr><tr><td>{@link #GLX_GPU_NUM_RB_AMD GPU_NUM_RB_AMD}</td><td>{@link #GLX_GPU_NUM_SPI_AMD GPU_NUM_SPI_AMD}</td></tr></table>
     */
    public static int glXGetGPUInfoAMD(@NativeType("unsigned int") int id, int property, @NativeType("GLenum") int dataType, @NativeType("void *") ByteBuffer data) {
        return nglXGetGPUInfoAMD(id, property, dataType, data.remaining(), memAddress(data));
    }

    // --- [ glXMakeAssociatedContextCurrentAMD ] ---

    /**
     * Makes an associated context current in the current thread.
     *
     * @param ctx the GLXContext
     */
    @NativeType("Bool")
    public static boolean glXMakeAssociatedContextCurrentAMD(@NativeType("GLXContext") long ctx) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXMakeAssociatedContextCurrentAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(ctx);
        }
        return callPI(ctx, __functionAddress) != 0;
    }

    /** Array version of: {@link #glXCreateAssociatedContextAttribsAMD CreateAssociatedContextAttribsAMD} */
    @NativeType("GLXContext")
    public static long glXCreateAssociatedContextAttribsAMD(@NativeType("unsigned int") int id, @NativeType("GLXContext") long share_context, @NativeType("int const *") int[] attribList) {
        long __functionAddress = GL.getCapabilitiesGLXClient().glXCreateAssociatedContextAttribsAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(share_context);
            checkNT(attribList);
        }
        return callPPP(id, share_context, attribList, __functionAddress);
    }

}