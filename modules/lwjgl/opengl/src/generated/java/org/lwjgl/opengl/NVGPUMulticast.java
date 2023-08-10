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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_gpu_multicast.txt">NV_gpu_multicast</a> extension.
 * 
 * <p>This extension enables novel multi-GPU rendering techniques by providing application control over a group of linked GPUs with identical hardware
 * configuration.</p>
 * 
 * <p>Multi-GPU rendering techniques fall into two categories: implicit and explicit. Existing explicit approaches like {@link WGLNVGPUAffinity WGL_NV_gpu_affinity} have two
 * main drawbacks: CPU overhead and application complexity. An application must manage one context per GPU and multi-pump the API stream. Implicit
 * multi-GPU rendering techniques avoid these issues by broadcasting rendering from one context to multiple GPUs. Common implicit approaches include
 * alternate-frame rendering (AFR), split-frame rendering (SFR) and multi-GPU anti-aliasing. They each have drawbacks. AFR scales nicely but interacts
 * poorly with inter-frame dependencies. SFR can improve latency but has challenges with offscreen rendering and scaling of vertex processing. With
 * multi-GPU anti-aliasing, each GPU renders the same content with alternate sample positions and the driver blends the result to improve quality. This
 * also has issues with offscreen rendering and can conflict with other anti-aliasing techniques.</p>
 * 
 * <p>These issues with implicit multi-GPU rendering all have the same root cause: the driver lacks adequate knowledge to accelerate every application. To
 * resolve this, NV_gpu_multicast provides fine-grained, explicit application control over multiple GPUs with a single context.</p>
 * 
 * <p>Key points:</p>
 * 
 * <ul>
 * <li>One context controls multiple GPUs. Every GPU in the linked group can access every object.</li>
 * <li>Rendering is broadcast. Each draw is repeated across all GPUs in the linked group.</li>
 * <li>Each GPU gets its own instance of all framebuffers, allowing individualized output for each GPU. Input data can be customized for each GPU using
 * buffers created with the storage flag, {@link #GL_PER_GPU_STORAGE_BIT_NV PER_GPU_STORAGE_BIT_NV} and a new API, {@link #glMulticastBufferSubDataNV MulticastBufferSubDataNV}.</li>
 * <li>New interfaces provide mechanisms to transfer textures and buffers from one GPU to another.</li>
 * </ul>
 * 
 * <p>Requires {@link ARBCopyImage ARB_copy_image} and {@link EXTDirectStateAccess EXT_direct_state_access}.</p>
 */
public class NVGPUMulticast {

    static { GL.initialize(); }

    /** Accepted in the {@code flags} parameter of BufferStorage and NamedBufferStorageEXT. */
    public static final int GL_PER_GPU_STORAGE_BIT_NV = 0x800;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int
        GL_MULTICAST_GPUS_NV  = 0x92BA,
        GL_RENDER_GPU_MASK_NV = 0x9558;

    /**
     * Accepted as a value for {@code pname} for the TexParameter{if}, TexParameter{if}v, TextureParameter{if}, TextureParameter{if}v, MultiTexParameter{if}EXT
     * and MultiTexParameter{if}vEXT commands and for the {@code value} parameter of GetTexParameter{if}v, GetTextureParameter{if}vEXT and
     * GetMultiTexParameter{if}vEXT.
     */
    public static final int GL_PER_GPU_STORAGE_NV = 0x9548;

    /** Accepted by the {@code pname} parameter of GetMultisamplefv. */
    public static final int GL_MULTICAST_PROGRAMMABLE_SAMPLE_LOCATION_NV = 0x9549;

    protected NVGPUMulticast() {
        throw new UnsupportedOperationException();
    }

    // --- [ glRenderGpuMaskNV ] ---

    /** Restricts render commands to a specific set of GPUs. */
    public static native void glRenderGpuMaskNV(@NativeType("GLbitfield") int mask);

    // --- [ glMulticastBufferSubDataNV ] ---

    public static native void nglMulticastBufferSubDataNV(int gpuMask, int buffer, long offset, long size, long data);

    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ByteBuffer data) {
        nglMulticastBufferSubDataNV(gpuMask, buffer, offset, data.remaining(), memAddress(data));
    }

    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ShortBuffer data) {
        nglMulticastBufferSubDataNV(gpuMask, buffer, offset, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data));
    }

    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") IntBuffer data) {
        nglMulticastBufferSubDataNV(gpuMask, buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") FloatBuffer data) {
        nglMulticastBufferSubDataNV(gpuMask, buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") DoubleBuffer data) {
        nglMulticastBufferSubDataNV(gpuMask, buffer, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    // --- [ glMulticastCopyBufferSubDataNV ] ---

    public static native void glMulticastCopyBufferSubDataNV(@NativeType("GLuint") int readGpu, @NativeType("GLbitfield") int writeGpuMask, @NativeType("GLuint") int readBuffer, @NativeType("GLuint") int writeBuffer, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size);

    // --- [ glMulticastCopyImageSubDataNV ] ---

    public static native void glMulticastCopyImageSubDataNV(@NativeType("GLuint") int srcGpu, @NativeType("GLbitfield") int dstGpuMask, @NativeType("GLuint") int srcName, @NativeType("GLenum") int srcTarget, @NativeType("GLint") int srcLevel, @NativeType("GLint") int srcX, @NativeType("GLint") int srxY, @NativeType("GLint") int srcZ, @NativeType("GLuint") int dstName, @NativeType("GLenum") int dstTarget, @NativeType("GLint") int dstLevel, @NativeType("GLint") int dstX, @NativeType("GLint") int dstY, @NativeType("GLint") int dstZ, @NativeType("GLsizei") int srcWidth, @NativeType("GLsizei") int srcHeight, @NativeType("GLsizei") int srcDepth);

    // --- [ glMulticastBlitFramebufferNV ] ---

    public static native void glMulticastBlitFramebufferNV(@NativeType("GLuint") int srcGpu, @NativeType("GLuint") int dstGpu, @NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter);

    // --- [ glMulticastFramebufferSampleLocationsfvNV ] ---

    public static native void nglMulticastFramebufferSampleLocationsfvNV(int gpu, int framebuffer, int start, int count, long v);

    public static void glMulticastFramebufferSampleLocationsfvNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int framebuffer, @NativeType("GLuint") int start, @NativeType("GLfloat const *") FloatBuffer v) {
        nglMulticastFramebufferSampleLocationsfvNV(gpu, framebuffer, start, v.remaining() >> 1, memAddress(v));
    }

    // --- [ glMulticastBarrierNV ] ---

    public static native void glMulticastBarrierNV();

    // --- [ glMulticastWaitSyncNV ] ---

    public static native void glMulticastWaitSyncNV(@NativeType("GLuint") int signalGpu, @NativeType("GLbitfield") int waitGpuMask);

    // --- [ glMulticastGetQueryObjectivNV ] ---

    public static native void nglMulticastGetQueryObjectivNV(int gpu, int id, int pname, long params);

    public static void glMulticastGetQueryObjectivNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglMulticastGetQueryObjectivNV(gpu, id, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glMulticastGetQueryObjectiNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglMulticastGetQueryObjectivNV(gpu, id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMulticastGetQueryObjectuivNV ] ---

    public static native void nglMulticastGetQueryObjectuivNV(int gpu, int id, int pname, long params);

    public static void glMulticastGetQueryObjectuivNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglMulticastGetQueryObjectuivNV(gpu, id, pname, memAddress(params));
    }

    @NativeType("void")
    public static int glMulticastGetQueryObjectuiNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglMulticastGetQueryObjectuivNV(gpu, id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMulticastGetQueryObjecti64vNV ] ---

    public static native void nglMulticastGetQueryObjecti64vNV(int gpu, int id, int pname, long params);

    public static void glMulticastGetQueryObjecti64vNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglMulticastGetQueryObjecti64vNV(gpu, id, pname, memAddress(params));
    }

    @NativeType("void")
    public static long glMulticastGetQueryObjecti64NV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglMulticastGetQueryObjecti64vNV(gpu, id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMulticastGetQueryObjectui64vNV ] ---

    public static native void nglMulticastGetQueryObjectui64vNV(int gpu, int id, int pname, long params);

    public static void glMulticastGetQueryObjectui64vNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglMulticastGetQueryObjectui64vNV(gpu, id, pname, memAddress(params));
    }

    @NativeType("void")
    public static long glMulticastGetQueryObjectui64NV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglMulticastGetQueryObjectui64vNV(gpu, id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glMulticastBufferSubDataNV MulticastBufferSubDataNV} */
    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") short[] data) {
        long __functionAddress = GL.getICD().glMulticastBufferSubDataNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(gpuMask, buffer, offset, Integer.toUnsignedLong(data.length) << 1, data, __functionAddress);
    }

    /** Array version of: {@link #glMulticastBufferSubDataNV MulticastBufferSubDataNV} */
    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") int[] data) {
        long __functionAddress = GL.getICD().glMulticastBufferSubDataNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(gpuMask, buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** Array version of: {@link #glMulticastBufferSubDataNV MulticastBufferSubDataNV} */
    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") float[] data) {
        long __functionAddress = GL.getICD().glMulticastBufferSubDataNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(gpuMask, buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** Array version of: {@link #glMulticastBufferSubDataNV MulticastBufferSubDataNV} */
    public static void glMulticastBufferSubDataNV(@NativeType("GLbitfield") int gpuMask, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") double[] data) {
        long __functionAddress = GL.getICD().glMulticastBufferSubDataNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(gpuMask, buffer, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** Array version of: {@link #glMulticastFramebufferSampleLocationsfvNV MulticastFramebufferSampleLocationsfvNV} */
    public static void glMulticastFramebufferSampleLocationsfvNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int framebuffer, @NativeType("GLuint") int start, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glMulticastFramebufferSampleLocationsfvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(gpu, framebuffer, start, v.length >> 1, v, __functionAddress);
    }

    /** Array version of: {@link #glMulticastGetQueryObjectivNV MulticastGetQueryObjectivNV} */
    public static void glMulticastGetQueryObjectivNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glMulticastGetQueryObjectivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(gpu, id, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glMulticastGetQueryObjectuivNV MulticastGetQueryObjectuivNV} */
    public static void glMulticastGetQueryObjectuivNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glMulticastGetQueryObjectuivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(gpu, id, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glMulticastGetQueryObjecti64vNV MulticastGetQueryObjecti64vNV} */
    public static void glMulticastGetQueryObjecti64vNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GL.getICD().glMulticastGetQueryObjecti64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(gpu, id, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glMulticastGetQueryObjectui64vNV MulticastGetQueryObjectui64vNV} */
    public static void glMulticastGetQueryObjectui64vNV(@NativeType("GLuint") int gpu, @NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GL.getICD().glMulticastGetQueryObjectui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(gpu, id, pname, params, __functionAddress);
    }

}