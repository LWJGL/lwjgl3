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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_external_objects.txt">EXT_semaphore</a> extension.
 * 
 * <p>The Vulkan API introduces the concept of explicit memory objects and reusable synchronization objects. This extension brings those concepts to the
 * OpenGL API via two new object types:</p>
 * 
 * <ul>
 * <li>Memory objects</li>
 * <li>Semaphores</li>
 * </ul>
 * 
 * <p>Rather than allocating memory as a response to object allocation, memory allocation and binding are two separate operations in Vulkan. This extension
 * allows an OpenGL application to import a Vulkan memory object, and to bind textures and/or buffer objects to it.</p>
 * 
 * <p>No methods to import memory objects are defined here. Separate platform-specific extensions are defined for this purpose.</p>
 * 
 * <p>Semaphores are synchronization primitives that can be waited on and signaled only by the GPU, or in GL terms, in the GL server. They are similar in
 * concept to GL's "sync" objects and EGL's "EGLSync" objects, but different enough that compatibilities between the two are difficult to derive.</p>
 * 
 * <p>Rather than attempt to map Vulkan semaphores on to GL/EGL sync objects to achieve interoperability, this extension introduces a new object, GL
 * semaphores, that map directly to the semantics of Vulkan semaphores. To achieve full image and buffer memory coherence with a Vulkan driver, the
 * commands that manipulate semaphores also allow external usage information to be imported and exported.</p>
 */
public class EXTSemaphore {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, GetInteger64v, {@link #glGetUnsignedBytevEXT GetUnsignedBytevEXT}, and the
     * {@code target} parameter of GetBooleani_v, GetIntegeri_v,GetFloati_v, GetDoublei_v, GetInteger64i_v, and {@link #glGetUnsignedBytei_vEXT GetUnsignedBytei_vEXT}.
     */
    public static final int
        GL_NUM_DEVICE_UUIDS_EXT = 0x9596,
        GL_DEVICE_UUID_EXT      = 0x9597,
        GL_DRIVER_UUID_EXT      = 0x9598;

    /** Constant values. */
    public static final int GL_UUID_SIZE_EXT = 16;

    /** Accepted by the {@code dstLayouts} parameter of {@link #glSignalSemaphoreEXT SignalSemaphoreEXT} and the {@code srcLayouts} parameter of {@link #glWaitSemaphoreEXT WaitSemaphoreEXT}. */
    public static final int
        GL_LAYOUT_GENERAL_EXT                            = 0x958D,
        GL_LAYOUT_COLOR_ATTACHMENT_EXT                   = 0x958E,
        GL_LAYOUT_DEPTH_STENCIL_ATTACHMENT_EXT           = 0x958F,
        GL_LAYOUT_DEPTH_STENCIL_READ_ONLY_EXT            = 0x9590,
        GL_LAYOUT_SHADER_READ_ONLY_EXT                   = 0x9591,
        GL_LAYOUT_TRANSFER_SRC_EXT                       = 0x9592,
        GL_LAYOUT_TRANSFER_DST_EXT                       = 0x9593,
        GL_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_EXT = 0x9530,
        GL_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_EXT = 0x9531;

    protected EXTSemaphore() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetUnsignedBytevEXT ] ---

    public static void nglGetUnsignedBytevEXT(int pname, long data) {
        EXTMemoryObject.nglGetUnsignedBytevEXT(pname, data);
    }

    public static void glGetUnsignedBytevEXT(@NativeType("GLenum") int pname, @NativeType("GLubyte *") ByteBuffer data) {
        EXTMemoryObject.glGetUnsignedBytevEXT(pname, data);
    }

    // --- [ glGetUnsignedBytei_vEXT ] ---

    public static void nglGetUnsignedBytei_vEXT(int target, int index, long data) {
        EXTMemoryObject.nglGetUnsignedBytei_vEXT(target, index, data);
    }

    public static void glGetUnsignedBytei_vEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLubyte *") ByteBuffer data) {
        EXTMemoryObject.glGetUnsignedBytei_vEXT(target, index, data);
    }

    // --- [ glGenSemaphoresEXT ] ---

    public static native void nglGenSemaphoresEXT(int n, long semaphores);

    public static void glGenSemaphoresEXT(@NativeType("GLuint *") IntBuffer semaphores) {
        nglGenSemaphoresEXT(semaphores.remaining(), memAddress(semaphores));
    }

    @NativeType("void")
    public static int glGenSemaphoresEXT() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer semaphores = stack.callocInt(1);
            nglGenSemaphoresEXT(1, memAddress(semaphores));
            return semaphores.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteSemaphoresEXT ] ---

    public static native void nglDeleteSemaphoresEXT(int n, long semaphores);

    public static void glDeleteSemaphoresEXT(@NativeType("GLuint const *") IntBuffer semaphores) {
        nglDeleteSemaphoresEXT(semaphores.remaining(), memAddress(semaphores));
    }

    public static void glDeleteSemaphoresEXT(@NativeType("GLuint const *") int semaphore) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer semaphores = stack.ints(semaphore);
            nglDeleteSemaphoresEXT(1, memAddress(semaphores));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsSemaphoreEXT ] ---

    @NativeType("GLboolean")
    public static native boolean glIsSemaphoreEXT(@NativeType("GLuint") int semaphore);

    // --- [ glSemaphoreParameterui64vEXT ] ---

    public static native void nglSemaphoreParameterui64vEXT(int semaphore, int pname, long params);

    public static void glSemaphoreParameterui64vEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLuint64 const *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSemaphoreParameterui64vEXT(semaphore, pname, memAddress(params));
    }

    public static void glSemaphoreParameterui64EXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLuint64 const *") long param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.longs(param);
            nglSemaphoreParameterui64vEXT(semaphore, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSemaphoreParameterui64vEXT ] ---

    public static native void nglGetSemaphoreParameterui64vEXT(int semaphore, int pname, long params);

    public static void glGetSemaphoreParameterui64vEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSemaphoreParameterui64vEXT(semaphore, pname, memAddress(params));
    }

    @NativeType("void")
    public static long glGetSemaphoreParameterui64EXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetSemaphoreParameterui64vEXT(semaphore, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glWaitSemaphoreEXT ] ---

    public static native void nglWaitSemaphoreEXT(int semaphore, int numBufferBarriers, long buffers, int numTextureBarriers, long textures, long srcLayouts);

    public static void glWaitSemaphoreEXT(@NativeType("GLuint") int semaphore, @NativeType("GLuint const *") IntBuffer buffers, @NativeType("GLuint const *") IntBuffer textures, @NativeType("GLenum const *") IntBuffer srcLayouts) {
        if (CHECKS) {
            check(srcLayouts, textures.remaining());
        }
        nglWaitSemaphoreEXT(semaphore, buffers.remaining(), memAddress(buffers), textures.remaining(), memAddress(textures), memAddress(srcLayouts));
    }

    // --- [ glSignalSemaphoreEXT ] ---

    public static native void nglSignalSemaphoreEXT(int semaphore, int numBufferBarriers, long buffers, int numTextureBarriers, long textures, long dstLayouts);

    public static void glSignalSemaphoreEXT(@NativeType("GLuint") int semaphore, @NativeType("GLuint const *") IntBuffer buffers, @NativeType("GLuint const *") IntBuffer textures, @NativeType("GLenum const *") IntBuffer dstLayouts) {
        if (CHECKS) {
            check(dstLayouts, textures.remaining());
        }
        nglSignalSemaphoreEXT(semaphore, buffers.remaining(), memAddress(buffers), textures.remaining(), memAddress(textures), memAddress(dstLayouts));
    }

    /** Array version of: {@link #glGenSemaphoresEXT GenSemaphoresEXT} */
    public static void glGenSemaphoresEXT(@NativeType("GLuint *") int[] semaphores) {
        long __functionAddress = GL.getICD().glGenSemaphoresEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(semaphores.length, semaphores, __functionAddress);
    }

    /** Array version of: {@link #glDeleteSemaphoresEXT DeleteSemaphoresEXT} */
    public static void glDeleteSemaphoresEXT(@NativeType("GLuint const *") int[] semaphores) {
        long __functionAddress = GL.getICD().glDeleteSemaphoresEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(semaphores.length, semaphores, __functionAddress);
    }

    /** Array version of: {@link #glSemaphoreParameterui64vEXT SemaphoreParameterui64vEXT} */
    public static void glSemaphoreParameterui64vEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLuint64 const *") long[] params) {
        long __functionAddress = GL.getICD().glSemaphoreParameterui64vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(semaphore, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetSemaphoreParameterui64vEXT GetSemaphoreParameterui64vEXT} */
    public static void glGetSemaphoreParameterui64vEXT(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetSemaphoreParameterui64vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(semaphore, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glWaitSemaphoreEXT WaitSemaphoreEXT} */
    public static void glWaitSemaphoreEXT(@NativeType("GLuint") int semaphore, @NativeType("GLuint const *") int[] buffers, @NativeType("GLuint const *") int[] textures, @NativeType("GLenum const *") int[] srcLayouts) {
        long __functionAddress = GL.getICD().glWaitSemaphoreEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(srcLayouts, textures.length);
        }
        callPPPV(semaphore, buffers.length, buffers, textures.length, textures, srcLayouts, __functionAddress);
    }

    /** Array version of: {@link #glSignalSemaphoreEXT SignalSemaphoreEXT} */
    public static void glSignalSemaphoreEXT(@NativeType("GLuint") int semaphore, @NativeType("GLuint const *") int[] buffers, @NativeType("GLuint const *") int[] textures, @NativeType("GLenum const *") int[] dstLayouts) {
        long __functionAddress = GL.getICD().glSignalSemaphoreEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dstLayouts, textures.length);
        }
        callPPPV(semaphore, buffers.length, buffers, textures.length, textures, dstLayouts, __functionAddress);
    }

}