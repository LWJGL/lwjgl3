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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_timeline_semaphore.txt">NV_timeline_semaphore</a> extension.
 * 
 * <p>The Vulkan API introduces the concept of timeline semaphores. This extension brings those concepts to the OpenGL API by adding a semaphore type to the
 * semaphore object. In OpenGL, timeline semaphore signal and wait operations are similar to the corresponding operations on imported Direct3D 12 fences
 * defined in EXT_external_objects_win32.</p>
 * 
 * <p>Requires {@link EXTSemaphore EXT_semaphore} or a version of OpenGL that incorporates it.</p>
 */
public class NVTimelineSemaphore {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of SemaphoreParameterivNV and GetSemaphoreParameterivNV. */
    public static final int GL_SEMAPHORE_TYPE_NV = 0x95B3;

    /** Accepted by the {@code param} parameter of SemaphoreParameterivNV and GetSemaphoreParameterivNV when {@code pname} parameter is SEMAPHORE_TYPE_NV. */
    public static final int
        GL_SEMAPHORE_TYPE_BINARY_NV   = 0x95B4,
        GL_SEMAPHORE_TYPE_TIMELINE_NV = 0x95B5;

    /** Accepted by the {@code pname} parameter of SemaphoreParameterui64vNV and GetSemaphoreParameterui64vNV. */
    public static final int GL_TIMELINE_SEMAPHORE_VALUE_NV = 0x9595;

    /** Accepted by the {@code pname} parameter to GetIntegerv, GetFloatv, GetDoublev, GetInteger64v, and GetBooleanv. */
    public static final int GL_MAX_TIMELINE_SEMAPHORE_VALUE_DIFFERENCE_NV = 0x95B6;

    protected NVTimelineSemaphore() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCreateSemaphoresNV ] ---

    public static native void nglCreateSemaphoresNV(int n, long semaphores);

    public static void glCreateSemaphoresNV(@NativeType("GLuint *") IntBuffer semaphores) {
        nglCreateSemaphoresNV(semaphores.remaining(), memAddress(semaphores));
    }

    @NativeType("void")
    public static int glCreateSemaphoresNV() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer semaphores = stack.callocInt(1);
            nglCreateSemaphoresNV(1, memAddress(semaphores));
            return semaphores.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glSemaphoreParameterivNV ] ---

    public static native void nglSemaphoreParameterivNV(int semaphore, int pname, long params);

    public static void glSemaphoreParameterivNV(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSemaphoreParameterivNV(semaphore, pname, memAddress(params));
    }

    // --- [ glGetSemaphoreParameterivNV ] ---

    public static native void nglGetSemaphoreParameterivNV(int semaphore, int pname, long params);

    public static void glGetSemaphoreParameterivNV(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSemaphoreParameterivNV(semaphore, pname, memAddress(params));
    }

    /** Array version of: {@link #glCreateSemaphoresNV CreateSemaphoresNV} */
    public static void glCreateSemaphoresNV(@NativeType("GLuint *") int[] semaphores) {
        long __functionAddress = GL.getICD().glCreateSemaphoresNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(semaphores.length, semaphores, __functionAddress);
    }

    /** Array version of: {@link #glSemaphoreParameterivNV SemaphoreParameterivNV} */
    public static void glSemaphoreParameterivNV(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glSemaphoreParameterivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(semaphore, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetSemaphoreParameterivNV GetSemaphoreParameterivNV} */
    public static void glGetSemaphoreParameterivNV(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetSemaphoreParameterivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(semaphore, pname, params, __functionAddress);
    }

}